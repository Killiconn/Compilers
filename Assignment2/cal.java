import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CharStreams;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.PrintStream;

public class cal
{
	public static void main (String[] args) throws FileNotFoundException, IOException{
        String inputFile = null;

        try {
            if (args.length >0) { inputFile = args [0]; }

            InputStream is = System.in;
            if (inputFile != null) { is = new FileInputStream (inputFile); }

            calLexer lexer = new calLexer(CharStreams.fromStream(is));
            lexer.removeErrorListeners();
            lexer.addErrorListener(CALErrorListener.INSTANCE);

            CommonTokenStream tokens = new CommonTokenStream(lexer);

            calParser parser = new calParser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(CALErrorListener.INSTANCE);

            ParseTree tree = parser.prog();
            String out = tree.toStringTree(parser);
            
            if (CALErrorListener.errorCondition) { 
                System.out.println(inputFile + " did not parse successfully."); 
            }
            else { System.out.println(inputFile + " parse successfully."); } 

            CalVisitor cal = new CalVisitor();
            IRCode ircode = new IRCode();
            cal.visit(tree);
            PrintStream fileStream = new PrintStream("example.taci");
            System.setOut(fileStream);
            ircode.visit(tree);
            

        }
        catch (FileNotFoundException e){
            System.out.println("Invalid file was given as input");
        }
	}
}
