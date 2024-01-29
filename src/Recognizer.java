
import gen.no_whitespace.OberonGrammarLexer;
import gen.no_whitespace.OberonGrammarParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;


public class Recognizer {
    static int noPassed = 0;
    static int noFailed = 0;

    static FileWriter log;

    public static void main(String[] args) throws IOException {
        // Folder path:
        String pathName = "C:\\Users\\omer_\\IdeaProjects\\OberonRecognizer\\input\\";
        log = new FileWriter("log.txt");

        try (Stream<Path> paths = Files.walk(Paths.get(pathName))) {
            paths.forEach(Recognizer::parseFile);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Number passed: " + noPassed);
        System.out.println("Number failed: " + noFailed);
        log.close();
    }

    private static void parseFile(Path directory) {

        File program = directory.toFile();

        if (program.isFile()) {  //walk also goes through dirs...
            try {

                String programPath = program.getAbsolutePath();
                CharStream input = CharStreams.fromFileName(programPath);
                OberonGrammarLexer lexer = new OberonGrammarLexer(input);
                CommonTokenStream tokens = new CommonTokenStream(lexer);
                OberonGrammarParser parser = new OberonGrammarParser(tokens);
                ParseTree tree = parser.moduleDefinition();
                if (parser.getNumberOfSyntaxErrors() == 0) {
//                        System.out.println(program.getName() + " PASS");
//                          log.write(program.getPath() + " PASS\n");
                    noPassed++;
                } else {
                    System.out.println(program.getName() + " FAIL");
                    log.write(program.getPath() + " FAIL\n");
                    noFailed++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
