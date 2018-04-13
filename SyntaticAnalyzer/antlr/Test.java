import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;
import org.antlr.v4.runtime.misc.IntervalSet;


public class Test {
	public static void main(String[] args) throws Exception {
		String inputFile = null;
		if ( args.length>0 ) {
			inputFile = args[0];
		}

		InputStream is = System.in;
		if ( inputFile!=null ) {
			is = new FileInputStream(inputFile);
		}
		ANTLRInputStream input = new ANTLRInputStream(is);
		// create a lexer that feeds off of input CharStream
		AMZ_syntLexer lexer = new AMZ_syntLexer(input);
		
		// create a buffer of tokens pulled from the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		// create a parser that feeds off the tokens buffer
		AMZ_syntParser parser = new AMZ_syntParser(tokens);
		parser.setErrorHandler(new ErrorStrategy());

		
		ParseTree tree = parser.eval(); // begin parsing at eval rule
		System.out.println(tree.toStringTree(parser)); // print tree as text
	}
}