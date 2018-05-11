import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.gui.TreeViewer;
import org.antlr.v4.runtime.misc.IntervalSet;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import error.*;
import symbol.*;

public class Main {
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

		/* Lexer */
		AMZ_syntLexer lexer = new AMZ_syntLexer(input);
		lexer.removeErrorListeners();
		lexer.addErrorListener(new LexerError());
		// create a buffer of tokens pulled from the lexer
		CommonTokenStream tokens = new CommonTokenStream(lexer);

		// create a parser that feeds off the tokens buffer
		/* Parser */
		AMZ_syntParser parser = new AMZ_syntParser(tokens);
		parser.setErrorHandler(new ErrorStrategy());

		/* Parse Tree */
		ParseTree tree = parser.eval(); // begin parsing at eval rule
		System.out.println(tree.toStringTree(parser)); // print tree as text
		if (Arrays.asList(args).contains("-gui")) {
			treeGui(parser, tree);
		}

		/* Semantic analysis */
        ParseTreeWalker walker = new ParseTreeWalker();
        AMZSemanticListener semanticListener = new AMZSemanticListener();
        walker.walk(semanticListener, tree);

	}

	public static void treeGui(AMZ_syntParser parser, ParseTree tree) {
		JFrame frame = new JFrame("Tree");
		TreeViewer viewr = new TreeViewer(
			Arrays.asList(parser.getRuleNames()), tree
		);
		viewr.setScale(1.5);
		JPanel panel = new JPanel();
		panel.add(viewr);
		JScrollPane jsp = new JScrollPane(panel);
		jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		jsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		frame.add(jsp);
		frame.setSize(5000,1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
