// Generated from Conflict.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ConflictParser}.
 */
public interface ConflictListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code ReturnStat}
	 * labeled alternative in {@link ConflictParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterReturnStat(ConflictParser.ReturnStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnStat}
	 * labeled alternative in {@link ConflictParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitReturnStat(ConflictParser.ReturnStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BreakStat}
	 * labeled alternative in {@link ConflictParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBreakStat(ConflictParser.BreakStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BreakStat}
	 * labeled alternative in {@link ConflictParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBreakStat(ConflictParser.BreakStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultExpr}
	 * labeled alternative in {@link ConflictParser#e}.
	 * @param ctx the parse tree
	 */
	void enterMultExpr(ConflictParser.MultExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultExpr}
	 * labeled alternative in {@link ConflictParser#e}.
	 * @param ctx the parse tree
	 */
	void exitMultExpr(ConflictParser.MultExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddExpr}
	 * labeled alternative in {@link ConflictParser#e}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(ConflictParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddExpr}
	 * labeled alternative in {@link ConflictParser#e}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(ConflictParser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link ConflictParser#e}.
	 * @param ctx the parse tree
	 */
	void enterInt(ConflictParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link ConflictParser#e}.
	 * @param ctx the parse tree
	 */
	void exitInt(ConflictParser.IntContext ctx);
}