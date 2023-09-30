// Generated from CppExpr.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CppExprParser}.
 */
public interface CppExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CppExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CppExprParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CppExprParser.ExprContext ctx);
}