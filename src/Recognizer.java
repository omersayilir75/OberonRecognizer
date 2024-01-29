
import gen.no_whitespace.OberonGrammarLexer;
import gen.no_whitespace.OberonGrammarParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.File;
import java.io.IOException;

public class Recognizer {
    public static void main(String[] args) {
        // Folder path:
        String pathName = "C:\\Users\\omer_\\IdeaProjects\\OberonRecognizer\\src\\fuzzer\\obfiles_generated";
        File dir = new File(pathName);
        File[] directoryListing = dir.listFiles();
        int noPassed = 0;
        int noFailed = 0;

        if(directoryListing != null){
            for(File program : directoryListing) {
                try {
                    String programPath = program.getAbsolutePath();
                    CharStream input = CharStreams.fromFileName(programPath);
                    OberonGrammarLexer lexer = new OberonGrammarLexer(input);
                    CommonTokenStream tokens = new CommonTokenStream(lexer);
                    OberonGrammarParser parser = new OberonGrammarParser(tokens);
                    ParseTree tree = parser.moduleDefinition();
                    if (parser.getNumberOfSyntaxErrors() == 0) {
//                        System.out.println(program.getName() + " PASS");
                          noPassed++;
                    } else {
                        System.out.println(program.getName() + " FAIL");
                        noFailed++;
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        else {
            System.out.println("No files found in directory.");
        }

        System.out.println("Number passed: " + noPassed);
        System.out.println("Number failed: " + noFailed);
    }
}
