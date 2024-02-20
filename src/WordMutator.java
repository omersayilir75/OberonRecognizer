import gen.no_whitespace.OberonGrammarLexer;
import org.antlr.v4.runtime.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;

public class WordMutator {
    public static void main(String[] args) throws IOException {
        HashSet<TokenTypePair> poisonedPairs = PPCalculator.calculatePoisonedPairs();
        BufferedReader reader = null;
        // file to test on:
        String filePath = "C:\\Users\\omer_\\Desktop\\gensamples\\positive\\obgensamples\\depth_10\\generated_input\\obfiles\\testoberon0.mod";
        // open and create a tokenstream:
        reader = new BufferedReader(new FileReader(filePath));
        CharStream input = CharStreams.fromReader(reader);
        OberonGrammarLexer lexer = new OberonGrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill();

        for (int i = 0; i < tokens.size(); i++) {

            Token prevToken = i > 0 ? tokens.get(i - 1) : null;
            Token token = tokens.get(i);
            Token nextToken = i < tokens.size() - 1 ? tokens.get(i + 1) : null;

            int prevType = prevToken != null ? prevToken.getType() : -2; // -1 reserved for EOF
            int tokenType = token.getType();
            int nextType = nextToken != null ? nextToken.getType() : -2;

            // conditions of predicate 1

            //token deletion:
            tokenDeletion(filePath, i, poisonedPairs);

            //token insertion:
            // for all pps that start with token, perform token insertion and save and save.

            //token substitution :
            // for all pps that start with token, substitute nextToken with an instance of one of the poisoned right part

            //token transposition:
            tokenTransposition(filePath, i, poisonedPairs);
        }



    }

    private static void tokenDeletion (String filePath, Integer currentPos, HashSet<TokenTypePair> poisonedPairs) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        CharStream input = CharStreams.fromReader(reader);
        OberonGrammarLexer lexer = new OberonGrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill();

        Token prevToken = currentPos > 0 ? tokens.get(currentPos - 1) : null;
        Token token = tokens.get(currentPos);
        Token nextToken = currentPos < tokens.size() - 1 ? tokens.get(currentPos + 1) : null;

        int prevType = prevToken != null ? prevToken.getType() : -2; // -1 reserved for EOF
        int tokenType = token.getType();
        int nextType = nextToken != null ? nextToken.getType() : -2;

        TokenTypePair searchToken = new TokenTypePair(prevType, nextType);

        if(poisonedPairs.contains(searchToken)){
            TokenStreamRewriter rewriter = new TokenStreamRewriter(tokens);
            rewriter.delete(token);

            //simple space serializer so the output is parsable
            for (int i=0; i<tokens.size(); i++) {
                Token cur = tokens.get(i);
                rewriter.insertAfter(cur, " ");
            }

            String modifiedProgram = rewriter.getText();
            FileWriter writer = new FileWriter("C:\\Users\\omer_\\Desktop\\gensamples\\negative\\oberonzero\\wordmutation\\indev\\testoberon0_" + currentPos + "_tokenDeletion.mod");
            try(writer){
                writer.write(modifiedProgram);
            } catch(IOException e){
                e.printStackTrace();
            }
        }
    }


    //TODO extract method if statement, & produces duplicates check why...
    private static void tokenTransposition (String filePath, Integer currentPos, HashSet<TokenTypePair> poisonedPairs) throws IOException {
        // if pp(prevtype, nexttype), remove token and save.

        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        CharStream input = CharStreams.fromReader(reader);
        OberonGrammarLexer lexer = new OberonGrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill();

        Token prevToken = currentPos > 0 ? tokens.get(currentPos - 1) : null;
        Token token = tokens.get(currentPos);
        Token nextToken = currentPos < tokens.size() - 1 ? tokens.get(currentPos + 1) : null;

        int prevType = prevToken != null ? prevToken.getType() : -2; // -1 reserved for EOF
        int tokenType = token.getType();
        int nextType = nextToken != null ? nextToken.getType() : -2;


        TokenTypePair[] searchTokens = new TokenTypePair[] {new TokenTypePair(prevType, nextType),
                                                            new TokenTypePair(tokenType, prevType),
                                                            new TokenTypePair(nextType, tokenType),
                                                            new TokenTypePair(nextType, prevType),
                                                            };
        for(TokenTypePair searchToken : searchTokens){
            if(poisonedPairs.contains(searchToken)){
                if(searchToken.first == prevType && searchToken.second == nextType){
                    TokenStreamRewriter rewriter = new TokenStreamRewriter(tokens);
                    tokenSwapper(token, nextToken, rewriter);
                    for (int i=0; i<tokens.size(); i++) {
                        Token cur = tokens.get(i);
                        rewriter.insertAfter(cur, " ");
                    }

                    String modifiedProgram = rewriter.getText();
                    FileWriter writer = new FileWriter("C:\\Users\\omer_\\Desktop\\gensamples\\negative\\oberonzero\\wordmutation\\indev\\testoberon0_" + currentPos + '_' + tokenType + '_' + nextType + "_tokenTransposition.mod");
                    try(writer){
                        writer.write(modifiedProgram);
                    } catch(IOException e){
                        e.printStackTrace();
                    }
                } else if (searchToken.first == tokenType && searchToken.second == prevType) {
                    TokenStreamRewriter rewriter = new TokenStreamRewriter(tokens);
                    tokenSwapper(token, prevToken, rewriter);
                    for (int i=0; i<tokens.size(); i++) {
                        Token cur = tokens.get(i);
                        rewriter.insertAfter(cur, " ");
                    }

                    String modifiedProgram = rewriter.getText();
                    FileWriter writer = new FileWriter("C:\\Users\\omer_\\Desktop\\gensamples\\negative\\oberonzero\\wordmutation\\indev\\testoberon0_" + currentPos + '_' + tokenType + '_'+ prevType+ "_tokenTransposition.mod");
                    try(writer){
                        writer.write(modifiedProgram);
                    } catch(IOException e){
                        e.printStackTrace();
                    }
                } else if (searchToken.first == nextType && searchToken.second == tokenType) {
                    TokenStreamRewriter rewriter = new TokenStreamRewriter(tokens);
                    tokenSwapper(token, nextToken, rewriter);
                    for (int i=0; i<tokens.size(); i++) {
                        Token cur = tokens.get(i);
                        rewriter.insertAfter(cur, " ");
                    }

                    String modifiedProgram = rewriter.getText();
                    FileWriter writer = new FileWriter("C:\\Users\\omer_\\Desktop\\gensamples\\negative\\oberonzero\\wordmutation\\indev\\testoberon0_" + currentPos + '_' + nextType + '_' + tokenType + "_tokenTransposition.mod");
                    try(writer){
                        writer.write(modifiedProgram);
                    } catch(IOException e){
                        e.printStackTrace();
                    }
                } else if (searchToken.first == nextType && searchToken.second == prevType) {
                    TokenStreamRewriter rewriter = new TokenStreamRewriter(tokens);
                    // this should work...
                    String leftText = prevToken.getText();
                    String middleText = token.getText();
                    String rightText = nextToken.getText();

                    rewriter.replace(prevToken, middleText);
                    rewriter.replace(token, rightText);
                    rewriter.replace(nextToken, leftText);

                    for (int i=0; i<tokens.size(); i++) {
                        Token cur = tokens.get(i);
                        rewriter.insertAfter(cur, " ");
                    }

                    String modifiedProgram = rewriter.getText();
                    FileWriter writer = new FileWriter("C:\\Users\\omer_\\Desktop\\gensamples\\negative\\oberonzero\\wordmutation\\indev\\testoberon0_" + currentPos + '_' + nextType + '_' +  prevType +"_tokenTransposition.mod");
                    try(writer){
                        writer.write(modifiedProgram);
                    } catch(IOException e){
                        e.printStackTrace();
                    }
                }
            }
        }
    }



    private static void tokenSwapper (Token left, Token right, TokenStreamRewriter rewriter){
        String leftText = left.getText();
        String rightText = right.getText();

        rewriter.replace(left, rightText);
        rewriter.replace(right, leftText);
    }


}
