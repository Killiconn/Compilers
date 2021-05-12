// Generated from cal.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link calParser}.
 */
public interface calListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link calParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(calParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link calParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(calParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link calParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(calParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link calParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(calParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link calParser#decl_list}.
	 * @param ctx the parse tree
	 */
	void enterDecl_list(calParser.Decl_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link calParser#decl_list}.
	 * @param ctx the parse tree
	 */
	void exitDecl_list(calParser.Decl_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link calParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(calParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link calParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(calParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link calParser#const_decl}.
	 * @param ctx the parse tree
	 */
	void enterConst_decl(calParser.Const_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link calParser#const_decl}.
	 * @param ctx the parse tree
	 */
	void exitConst_decl(calParser.Const_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link calParser#function_list}.
	 * @param ctx the parse tree
	 */
	void enterFunction_list(calParser.Function_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link calParser#function_list}.
	 * @param ctx the parse tree
	 */
	void exitFunction_list(calParser.Function_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link calParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(calParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link calParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(calParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link calParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(calParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link calParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(calParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link calParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_list(calParser.Parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link calParser#parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_list(calParser.Parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link calParser#nemp_parameter_list}.
	 * @param ctx the parse tree
	 */
	void enterNemp_parameter_list(calParser.Nemp_parameter_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link calParser#nemp_parameter_list}.
	 * @param ctx the parse tree
	 */
	void exitNemp_parameter_list(calParser.Nemp_parameter_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link calParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(calParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link calParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(calParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link calParser#statement_block}.
	 * @param ctx the parse tree
	 */
	void enterStatement_block(calParser.Statement_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link calParser#statement_block}.
	 * @param ctx the parse tree
	 */
	void exitStatement_block(calParser.Statement_blockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IDExprStm}
	 * labeled alternative in {@link calParser#stm}.
	 * @param ctx the parse tree
	 */
	void enterIDExprStm(calParser.IDExprStmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IDExprStm}
	 * labeled alternative in {@link calParser#stm}.
	 * @param ctx the parse tree
	 */
	void exitIDExprStm(calParser.IDExprStmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IDArgListStm}
	 * labeled alternative in {@link calParser#stm}.
	 * @param ctx the parse tree
	 */
	void enterIDArgListStm(calParser.IDArgListStmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IDArgListStm}
	 * labeled alternative in {@link calParser#stm}.
	 * @param ctx the parse tree
	 */
	void exitIDArgListStm(calParser.IDArgListStmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BlockStm}
	 * labeled alternative in {@link calParser#stm}.
	 * @param ctx the parse tree
	 */
	void enterBlockStm(calParser.BlockStmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BlockStm}
	 * labeled alternative in {@link calParser#stm}.
	 * @param ctx the parse tree
	 */
	void exitBlockStm(calParser.BlockStmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfBlocktm}
	 * labeled alternative in {@link calParser#stm}.
	 * @param ctx the parse tree
	 */
	void enterIfBlocktm(calParser.IfBlocktmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfBlocktm}
	 * labeled alternative in {@link calParser#stm}.
	 * @param ctx the parse tree
	 */
	void exitIfBlocktm(calParser.IfBlocktmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStm}
	 * labeled alternative in {@link calParser#stm}.
	 * @param ctx the parse tree
	 */
	void enterWhileStm(calParser.WhileStmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStm}
	 * labeled alternative in {@link calParser#stm}.
	 * @param ctx the parse tree
	 */
	void exitWhileStm(calParser.WhileStmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SkipStm}
	 * labeled alternative in {@link calParser#stm}.
	 * @param ctx the parse tree
	 */
	void enterSkipStm(calParser.SkipStmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SkipStm}
	 * labeled alternative in {@link calParser#stm}.
	 * @param ctx the parse tree
	 */
	void exitSkipStm(calParser.SkipStmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IDExpr}
	 * labeled alternative in {@link calParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIDExpr(calParser.IDExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IDExpr}
	 * labeled alternative in {@link calParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIDExpr(calParser.IDExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BracExpr}
	 * labeled alternative in {@link calParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBracExpr(calParser.BracExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BracExpr}
	 * labeled alternative in {@link calParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBracExpr(calParser.BracExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinOpExpr}
	 * labeled alternative in {@link calParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinOpExpr(calParser.BinOpExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinOpExpr}
	 * labeled alternative in {@link calParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinOpExpr(calParser.BinOpExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FragExpr}
	 * labeled alternative in {@link calParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFragExpr(calParser.FragExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FragExpr}
	 * labeled alternative in {@link calParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFragExpr(calParser.FragExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link calParser#binary_arith_op}.
	 * @param ctx the parse tree
	 */
	void enterBinary_arith_op(calParser.Binary_arith_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link calParser#binary_arith_op}.
	 * @param ctx the parse tree
	 */
	void exitBinary_arith_op(calParser.Binary_arith_opContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IDFrag}
	 * labeled alternative in {@link calParser#frag}.
	 * @param ctx the parse tree
	 */
	void enterIDFrag(calParser.IDFragContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IDFrag}
	 * labeled alternative in {@link calParser#frag}.
	 * @param ctx the parse tree
	 */
	void exitIDFrag(calParser.IDFragContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NegIDFrag}
	 * labeled alternative in {@link calParser#frag}.
	 * @param ctx the parse tree
	 */
	void enterNegIDFrag(calParser.NegIDFragContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NegIDFrag}
	 * labeled alternative in {@link calParser#frag}.
	 * @param ctx the parse tree
	 */
	void exitNegIDFrag(calParser.NegIDFragContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumberFrag}
	 * labeled alternative in {@link calParser#frag}.
	 * @param ctx the parse tree
	 */
	void enterNumberFrag(calParser.NumberFragContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumberFrag}
	 * labeled alternative in {@link calParser#frag}.
	 * @param ctx the parse tree
	 */
	void exitNumberFrag(calParser.NumberFragContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrueFrag}
	 * labeled alternative in {@link calParser#frag}.
	 * @param ctx the parse tree
	 */
	void enterTrueFrag(calParser.TrueFragContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrueFrag}
	 * labeled alternative in {@link calParser#frag}.
	 * @param ctx the parse tree
	 */
	void exitTrueFrag(calParser.TrueFragContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FalseFrag}
	 * labeled alternative in {@link calParser#frag}.
	 * @param ctx the parse tree
	 */
	void enterFalseFrag(calParser.FalseFragContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FalseFrag}
	 * labeled alternative in {@link calParser#frag}.
	 * @param ctx the parse tree
	 */
	void exitFalseFrag(calParser.FalseFragContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BrackCond}
	 * labeled alternative in {@link calParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterBrackCond(calParser.BrackCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BrackCond}
	 * labeled alternative in {@link calParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitBrackCond(calParser.BrackCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NegCond}
	 * labeled alternative in {@link calParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterNegCond(calParser.NegCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NegCond}
	 * labeled alternative in {@link calParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitNegCond(calParser.NegCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrAndCond}
	 * labeled alternative in {@link calParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterOrAndCond(calParser.OrAndCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrAndCond}
	 * labeled alternative in {@link calParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitOrAndCond(calParser.OrAndCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprCompOpCond}
	 * labeled alternative in {@link calParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterExprCompOpCond(calParser.ExprCompOpCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprCompOpCond}
	 * labeled alternative in {@link calParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitExprCompOpCond(calParser.ExprCompOpCondContext ctx);
	/**
	 * Enter a parse tree produced by {@link calParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void enterComp_op(calParser.Comp_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link calParser#comp_op}.
	 * @param ctx the parse tree
	 */
	void exitComp_op(calParser.Comp_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link calParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void enterArg_list(calParser.Arg_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link calParser#arg_list}.
	 * @param ctx the parse tree
	 */
	void exitArg_list(calParser.Arg_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link calParser#nemp_arg_list}.
	 * @param ctx the parse tree
	 */
	void enterNemp_arg_list(calParser.Nemp_arg_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link calParser#nemp_arg_list}.
	 * @param ctx the parse tree
	 */
	void exitNemp_arg_list(calParser.Nemp_arg_listContext ctx);
}