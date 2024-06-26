package desk;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

import desk.desk.grammar.deskTerminalOnlyLexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;


public class PPCalculator {
    static AtomicInteger noProcessed = new AtomicInteger(0);

    public static void calculatePoisonedPairs(HashSet<TokenTypePair> poisonedPairs,
                                              Hashtable<Integer, String> tokenInstances,
                                              Hashtable<Integer, TokenNeighbours> tokenNeighboursHashtable) throws IOException {
        // Folder path:


        String pathName_d10 = "C:\\Users\\omer_\\Desktop\\gensamples\\positive\\desk\\terminalOnly\\generated\\depth10";
        try (Stream<Path> paths = Files.walk(Paths.get(pathName_d10))) {
            paths.parallel().forEach(p -> processFile(p, tokenInstances, tokenNeighboursHashtable));
        } catch (IOException e) {
            e.printStackTrace();
        }


        ObjectMapper mapper = new ObjectMapper();
        SimpleModule module = new SimpleModule();
        module.addSerializer(TokenTypePair.class, new TokenTypePairSerializer());
        mapper.registerModule(module);

        mapper.writeValue(new File("C:\\Users\\omer_\\IdeaProjects\\OberonRecognizer\\src\\desk\\precede_and_follow_all_datasets.json"), tokenNeighboursHashtable);


        for (int i : tokenNeighboursHashtable.keySet()) {
            TokenNeighbours neighbours = tokenNeighboursHashtable.get(i);
            if (neighbours != null) {
                for (int j : tokenNeighboursHashtable.keySet()) {
                    if (!(neighbours.follow.contains(j))) {
                        TokenTypePair pair = new TokenTypePair(i, j);
                        poisonedPairs.add(pair);
                    }
                }
            }
        }
        mapper.writeValue(new File("C:\\Users\\omer_\\IdeaProjects\\OberonRecognizer\\src\\desk\\poisoned_pairs.json"), poisonedPairs);
    }

    private static void processFile(Path directory, Hashtable<Integer, String> tokenInstances, Hashtable<Integer,
            TokenNeighbours> tokenNeighboursHashtable) {
        BufferedReader reader = null;
        File program = directory.toFile();

        if (program.isFile()) {  //walk also goes through dirs...
            try {
                String programPath = program.getAbsolutePath();
                reader = new BufferedReader(new FileReader(programPath));
                CharStream input = CharStreams.fromReader(reader);
                deskTerminalOnlyLexer lexer = new deskTerminalOnlyLexer(input);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                tokens.fill();
                for (int i = 0; i < tokens.size(); i++) {
                    Token token = tokens.get(i);
                    Token prevToken = i > 0 ? tokens.get(i - 1) : null;
                    Token nextToken = i < tokens.size() - 1 ? tokens.get(i + 1) : null;

                    int tokenType = token.getType();

                    if (tokenType != -1) { // not doing -1, EOF is a token but not text that can be injected mid-file...
                        int prevType = prevToken != null ? prevToken.getType() : -2; // -1 reserved for EOF
                        int nextType = nextToken != null ? nextToken.getType() : -2;

                        TokenNeighbours neighbours = tokenNeighboursHashtable.getOrDefault(tokenType, null);
                        tokenInstances.put(tokenType, token.getText());

                        if (neighbours == null) neighbours = new TokenNeighbours();
                        if (prevType != -2 && prevType != -1) neighbours.precede.add(prevType);
                        if (nextType != -2 && nextType != -1) neighbours.follow.add(nextType);
                        tokenNeighboursHashtable.put(tokenType, neighbours);
                    }

                }
                noProcessed.incrementAndGet();
                if (noProcessed.get() % 1000 == 0) {
                    System.out.println("Processed " + noProcessed.get() + " files.");
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (reader != null) {
                    try {
                        reader.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }

            }
        }

    }
}
