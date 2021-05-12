import org.antlr.v4.runtime.*;
import java.util.ArrayList;

public class CALErrorListener extends BaseErrorListener {

    public static final CALErrorListener INSTANCE = new CALErrorListener();
    
    public static Boolean errorCondition = false;

    @Override
    public void syntaxError(Recognizer<?,?> recognizer,
               Object offendingSymbol,
               int line,
               int charPositionInLine,
               String msg,
               RecognitionException e) {
        errorCondition = true;
    }
}