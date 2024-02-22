import gen.no_whitespace.OberonGrammarLexer;
import org.antlr.v4.runtime.*;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.UUID;
import java.util.stream.Stream;

public class WordMutator {
    static HashSet<TokenTypePair> poisonedPairs = new HashSet<>();
    static Hashtable<Integer, String> tokenInstances = new Hashtable<>();

    static String targetPath = "C:\\Users\\omer_\\Desktop\\gensamples\\negative\\oberonzero\\wordmutation\\indev";

    public static void main(String[] args) throws IOException {
        PPCalculator.calculatePoisonedPairs(poisonedPairs, tokenInstances);

        String pathName = "C:\\Users\\omer_\\Desktop\\gensamples\\negative\\oberonzero\\wordmutation\\input";
        try (Stream<Path> paths = Files.walk(Paths.get(pathName))) {
            paths.parallel().forEach(WordMutator::processFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void processFile(Path directory) {
        BufferedReader reader = null;
        File program = directory.toFile();

        if (program.isFile()) {  //walk also goes through dirs...
            try {
                // file to test on:
                String filePath = program.getAbsolutePath();
                // open and create a tokenstream:
                reader = new BufferedReader(new FileReader(filePath));
                CharStream input = CharStreams.fromReader(reader);
                OberonGrammarLexer lexer = new OberonGrammarLexer(input);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                tokens.fill();

                String filename = program.getName();
                for (int i = 0; i < tokens.size(); i++) {
                    // conditions of predicate 1
                    //token deletion:
                    tokenDeletion(filePath, i, poisonedPairs, filename);
                    // token insertion:
                    tokenInsertion(filePath, i ,poisonedPairs, tokenInstances, filename);
                    // token substitution :
                    tokenSubstitution(filePath, i, poisonedPairs, tokenInstances, filename);
                    //token transposition:
                    tokenTransposition(filePath, i, poisonedPairs, filename);
                }

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (reader != null){
                    try{
                        reader.close();
                    }catch (IOException e){
                        e.printStackTrace();
                    }

                }

            }
        }
    }

    private static void tokenSubstitution(String filePath, int currentPos, HashSet<TokenTypePair> poisonedPairs, Hashtable<Integer, String> tokenInstances, String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        CharStream input = CharStreams.fromReader(reader);
        OberonGrammarLexer lexer = new OberonGrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill();

        Token prevToken = currentPos > 0 ? tokens.get(currentPos - 1) : null;
        Token token = tokens.get(currentPos);
        Token nextToken = currentPos < tokens.size() - 1 ? tokens.get(currentPos + 1) : null;

        if (prevToken != null) {
            int tokenType = token.getType();
            //get poisoned pairs for tokenType:
            TokenTypePair[] poisonedPairsForToken = poisonedPairs.stream().filter(p -> p.second == tokenType).toArray(TokenTypePair[]::new);
            // for each poisoned pair, create a new file where the pp token is inserted
            for (TokenTypePair pp : poisonedPairsForToken) {
                String toInsert = tokenInstances.get(pp.first);
                TokenStreamRewriter rewriter = new TokenStreamRewriter(tokens);
                rewriter.replace(prevToken, toInsert);

                spaceSerializer(rewriter, tokens);

                String modifiedProgram = rewriter.getText();
                UUID uuid = UUID.randomUUID();
                FileWriter writer = new FileWriter(targetPath + "\\" + uuid + "_" + filename);
                try (writer) {
                    writer.write(modifiedProgram);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        if (nextToken != null) {
            int tokenType = token.getType();
            //get poisoned pairs for tokenType:
            TokenTypePair[] poisonedPairsForToken = poisonedPairs.stream().filter(p -> p.first == tokenType).toArray(TokenTypePair[]::new);
            // for each poisoned pair, create a new file where the pp token is inserted
            for (TokenTypePair pp : poisonedPairsForToken) {
                String toInsert = tokenInstances.get(pp.second);
                TokenStreamRewriter rewriter = new TokenStreamRewriter(tokens);
                rewriter.replace(nextToken, toInsert);

                spaceSerializer(rewriter, tokens);

                String modifiedProgram = rewriter.getText();
                UUID uuid = UUID.randomUUID();
                FileWriter writer = new FileWriter(targetPath + "\\" + uuid + "_" + filename);
                try (writer) {
                    writer.write(modifiedProgram);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void tokenInsertion(String filePath, int currentPos, HashSet<TokenTypePair> poisonedPairs, Hashtable<Integer, String> tokenInstances, String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        CharStream input = CharStreams.fromReader(reader);
        OberonGrammarLexer lexer = new OberonGrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill();

        Token token = tokens.get(currentPos);

        int tokenType = token.getType();

        //get poisoned pairs for tokenType:
        TokenTypePair[] poisonedPairsForTokenWhereLeft = poisonedPairs.stream().filter(p -> p.first == tokenType).toArray(TokenTypePair[]::new);
        // for each poisoned pair, create a new file where the pp token is inserted
        for (TokenTypePair pp : poisonedPairsForTokenWhereLeft) {
            String toInsert = tokenInstances.get(pp.second);
            toInsert = " " + toInsert; //add space
            TokenStreamRewriter rewriter = new TokenStreamRewriter(tokens);
            rewriter.insertAfter(token, toInsert);

            spaceSerializer(rewriter, tokens);

            String modifiedProgram = rewriter.getText();
            UUID uuid = UUID.randomUUID();
            FileWriter writer = new FileWriter(targetPath + "\\" + uuid + "_" + filename);
            try (writer) {
                writer.write(modifiedProgram);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        TokenTypePair[] poisonedPairsForTokenWhereRight = poisonedPairs.stream().filter(p -> p.second == tokenType).toArray(TokenTypePair[]::new);
        // for each poisoned pair, create a new file where the pp token is inserted
        for (TokenTypePair pp : poisonedPairsForTokenWhereRight) {
            String toInsert = tokenInstances.get(pp.first);
            toInsert = toInsert + " "; //add space
            TokenStreamRewriter rewriter = new TokenStreamRewriter(tokens);
            rewriter.insertBefore(token, toInsert);

            spaceSerializer(rewriter, tokens);

            String modifiedProgram = rewriter.getText();
            UUID uuid = UUID.randomUUID();
            FileWriter writer = new FileWriter(targetPath + "\\" + uuid + "_" +filename);
            try (writer) {
                writer.write(modifiedProgram);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    private static void tokenDeletion(String filePath, Integer currentPos, HashSet<TokenTypePair> poisonedPairs, String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        CharStream input = CharStreams.fromReader(reader);
        OberonGrammarLexer lexer = new OberonGrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill();

        Token prevToken = currentPos > 0 ? tokens.get(currentPos - 1) : null;
        Token token = tokens.get(currentPos);
        Token nextToken = currentPos < tokens.size() - 1 ? tokens.get(currentPos + 1) : null;

        int prevType = prevToken != null ? prevToken.getType() : -2;
        int nextType = nextToken != null ? nextToken.getType() : -2;

        TokenTypePair searchToken = new TokenTypePair(prevType, nextType);

        if (poisonedPairs.contains(searchToken)) {
            TokenStreamRewriter rewriter = new TokenStreamRewriter(tokens);
            rewriter.delete(token);

            //simple space serializer so the output is parsable
            for (int i = 0; i < tokens.size(); i++) {
                Token cur = tokens.get(i);
                rewriter.insertAfter(cur, " ");
            }

            String modifiedProgram = rewriter.getText();
            UUID uuid = UUID.randomUUID();
            FileWriter writer = new FileWriter(targetPath + "\\" + uuid + "_" + filename);
            try (writer) {
                writer.write(modifiedProgram);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void tokenTransposition(String filePath, Integer currentPos, HashSet<TokenTypePair> poisonedPairs, String filename) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        CharStream input = CharStreams.fromReader(reader);
        OberonGrammarLexer lexer = new OberonGrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill();

        Token prevToken = currentPos > 0 ? tokens.get(currentPos - 1) : null;
        Token token = tokens.get(currentPos);
        Token nextToken = currentPos < tokens.size() - 1 ? tokens.get(currentPos + 1) : null;
        Token nextNextToken = currentPos < tokens.size() - 2 ? tokens.get(currentPos + 2) : null;

        int prevType = prevToken != null ? prevToken.getType() : -2; // -1 reserved for EOF
        int tokenType = token.getType();
        int nextType = nextToken != null ? nextToken.getType() : -2;
        int nextNextType = nextNextToken != null ? nextNextToken.getType() : -2;

        TokenTypePair[] searchTokens = new TokenTypePair[]{
                new TokenTypePair(tokenType, nextNextType),
                new TokenTypePair(tokenType, prevType),
        };
        for (TokenTypePair searchToken : searchTokens) {
            if (poisonedPairs.contains(searchToken)) {
                if (searchToken.second == nextNextType) {
                    //case 1 from paper:
                    TokenStreamRewriter rewriterCase1 = new TokenStreamRewriter(tokens);
                    tokenSwapper(nextToken, nextNextToken, rewriterCase1);
                    spaceSerializer(rewriterCase1, tokens);
                    String modifiedProgramCase1 = rewriterCase1.getText();
                    UUID uuidCase1 = UUID.randomUUID();
                    FileWriter writerCase1 = new FileWriter(targetPath + "\\" + uuidCase1  + "_" +  filename);
                    try (writerCase1) {
                        writerCase1.write(modifiedProgramCase1);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    //case 3 from paper:
                    TokenStreamRewriter rewriterCase3 = new TokenStreamRewriter(tokens);
                    tokenSwapper(token, nextToken, rewriterCase3);
                    spaceSerializer(rewriterCase3, tokens);
                    String modifiedProgramCase3 = rewriterCase3.getText();
                    UUID uuidCase3 = UUID.randomUUID();
                    FileWriter writerCase3 = new FileWriter(targetPath + "\\" + uuidCase3 + "_" + filename);
                    try (writerCase3) {
                        writerCase3.write(modifiedProgramCase3);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else if (searchToken.second == prevType) {
                    //case 2 from paper:
                    TokenStreamRewriter rewriter = new TokenStreamRewriter(tokens);
                    tokenSwapper(token, prevToken, rewriter);
                    spaceSerializer(rewriter, tokens);
                    String modifiedProgramCase1 = rewriter.getText();
                    UUID uuid = UUID.randomUUID();
                    FileWriter writerCase1 = new FileWriter(targetPath + "\\" + uuid + "_" + filename);
                    try (writerCase1) {
                        writerCase1.write(modifiedProgramCase1);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    private static void tokenSwapper(Token left, Token right, TokenStreamRewriter rewriter) {
        String leftText = left.getText();
        String rightText = right.getText();

        rewriter.replace(left, rightText);
        rewriter.replace(right, leftText);
    }

    private static void spaceSerializer(TokenStreamRewriter rewriter, CommonTokenStream tokens) {
        for (int i = 0; i < tokens.size(); i++) {
            Token cur = tokens.get(i);
            rewriter.insertAfter(cur, " ");
        }
    }
}
