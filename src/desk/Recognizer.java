package desk;



import desk.desk.grammar.deskTerminalOnlyLexer;
import desk.desk.grammar.deskTerminalOnlyParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;


public class Recognizer {
    public static AtomicInteger noPassed = new AtomicInteger(0);
    static AtomicInteger noFailed = new AtomicInteger(0);
    static AtomicInteger noProcessed = new AtomicInteger(0);
    static FileWriter log;

    public static void main(String[] args) throws IOException {
        // Folder path:
        String pathName = "C:\\Users\\omer_\\Desktop\\gensamples\\positive\\desk\\terminalOnly\\generated\\depth10";

        log = new FileWriter("log.txt");

        try (Stream<Path> paths = Files.walk(Paths.get(pathName))) {
            paths.parallel().forEach(Recognizer::parseFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Number passed: " + noPassed.get());
        System.out.println("Number failed: " + noFailed.get());
        log.close();
    }

    private static void parseFile(Path directory) {
        BufferedReader reader = null;
        File program = directory.toFile();

        if (program.isFile()) {  //walk also goes through dirs...
            try {
                String programPath = program.getAbsolutePath();
                reader = new BufferedReader(new FileReader(programPath));
                CharStream input = CharStreams.fromReader(reader);
                deskTerminalOnlyLexer lexer = new deskTerminalOnlyLexer(input);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                deskTerminalOnlyParser parser = new deskTerminalOnlyParser(tokens);
                ParseTree tree = parser.desk();


                if (parser.getNumberOfSyntaxErrors() == 0) {
//                        System.out.println(program.getName() + " PASS");
//                          log.write(program.getPath() + "\n");
                    noPassed.incrementAndGet();
                } else {
                    System.out.println(program.getName() + " FAIL");
//                    log.write(program.getPath() + " FAIL\n");
                    noFailed.incrementAndGet();
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
