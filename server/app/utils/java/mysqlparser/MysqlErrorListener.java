package utils.java.mysqlparser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

import java.util.BitSet;

public class MysqlErrorListener extends BaseErrorListener {
    Callable callable;

    MysqlErrorListener(Callable callable){
        this.callable = callable;
    }
    public void	reportAmbiguity(Parser recognizer,
                                   DFA dfa,
                                   int startIndex,
                                   int stopIndex,
                                   boolean exact,
                                   BitSet ambigAlts,
                                   ATNConfigSet configs){
    }

    public void	reportAttemptingFullContext(Parser recognizer,
                                               DFA dfa,
                                               int startIndex,
                                               int stopIndex,
                                               BitSet conflictingAlts,
                                               ATNConfigSet configs){
    }

    public void	reportContextSensitivity(Parser recognizer,
                                            DFA dfa,
                                            int startIndex,
                                            int stopIndex,
                                            int prediction,
                                            ATNConfigSet configs){
    }

    public void	syntaxError(Recognizer<?,?> recognizer,
                               Object offendingSymbol,
                               int line,
                               int charPositionInLine,
                               String msg,
                               RecognitionException e){

        callable.message("error in syntax-> "+
                "Object: "+ offendingSymbol +
                "| line: " + line +
                "| charPositionInLine: " +charPositionInLine +
                "| msg: " + msg+
                "| exception: " +e);
    }

}
