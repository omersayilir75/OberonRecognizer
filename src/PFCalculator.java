
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import gen.no_whitespace.OberonGrammarLexer;
import org.antlr.v4.runtime.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Hashtable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;


public class PFCalculator {
    static AtomicInteger noPassed = new AtomicInteger(0);
    static AtomicInteger noFailed = new AtomicInteger(0);
    static AtomicInteger noProcessed = new AtomicInteger(0);
    static FileWriter log;
    static Hashtable<Integer, TokenNeighbours> tokenNeighboursHashtable =  new Hashtable<Integer, TokenNeighbours>();

    public static void main(String[] args) throws IOException {
        // Folder path:
        System.out.println("GA based input");
        String pathName_GA = "C:\\Users\\omer_\\Desktop\\gensamples\\positive\\obgensamples\\GA_Based\\generated_samples";
        try (Stream<Path> paths = Files.walk(Paths.get(pathName_GA))) {
            paths.parallel().forEach(PFCalculator::processFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("depth 10 input (+ original ob files)");
        String pathName_d10 = "C:\\Users\\omer_\\Desktop\\gensamples\\positive\\obgensamples\\depth_10\\generated_input";
        try (Stream<Path> paths = Files.walk(Paths.get(pathName_d10))) {
            paths.parallel().forEach(PFCalculator::processFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("depth 20 input");
        String pathName_d20 = "C:\\Users\\omer_\\Desktop\\gensamples\\positive\\obgensamples\\depth_20\\generated_input";
        try (Stream<Path> paths = Files.walk(Paths.get(pathName_d20))) {
            paths.parallel().forEach(PFCalculator::processFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        new ObjectMapper().writeValue(new File("C:\\Users\\omer_\\Desktop\\precede_and_follow_all_datasets.json"), tokenNeighboursHashtable);
    }

    private static void processFile(Path directory) {
        BufferedReader reader = null;
        File program = directory.toFile();

        if (program.isFile()) {  //walk also goes through dirs...
            try {
                String programPath = program.getAbsolutePath();
                reader = new BufferedReader(new FileReader(programPath));
                CharStream input = CharStreams.fromReader(reader);
                OberonGrammarLexer lexer = new OberonGrammarLexer(input);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                tokens.fill();
                for (int i = 0; i < tokens.size(); i++) {
                    Token token = tokens.get(i);
                    Token prevToken = i > 0 ? tokens.get(i - 1) : null;
                    Token nextToken = i < tokens.size() - 1 ? tokens.get(i + 1) : null;

                    int tokenType = token.getType();
                    int prevType = prevToken != null ? prevToken.getType() : -2; // -1 reserved for EOF
                    int nextType = nextToken != null ? nextToken.getType() : -2;

                    TokenNeighbours neighbours = tokenNeighboursHashtable.getOrDefault(tokenType, null);

                    if (neighbours == null) neighbours = new TokenNeighbours();
                    if (prevType != -2) neighbours.precede.add(prevType);
                    if (nextType != -2) neighbours.follow.add(nextType);
                    tokenNeighboursHashtable.put(tokenType, neighbours);

                }
                noProcessed.incrementAndGet();
                if (noProcessed.get() % 1000 == 0 ){
                    System.out.println("Processed " + noProcessed.get() + " files.");
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
}
