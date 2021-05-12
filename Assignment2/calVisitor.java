// Generated from cal.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link calParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface calVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link calParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(calParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link calParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(calParser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link calParser#decl_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_list(calParser.Decl_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link calParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(calParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link calParser#const_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_decl(calParser.Const_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link calParser#function_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_list(calParser.Function_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link calParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(calParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link calParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(calParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link calParser#parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_list(calParser.Parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link calParser#nemp_parameter_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNemp_parameter_list(calParser.Nemp_parameter_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link calParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(calParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link calParser#statement_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_block(calParser.Statement_blockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IDExprStm}
	 * labeled alternative in {@link calParser#stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIDExprStm(calParser.IDExprStmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IDArgListStm}
	 * labeled alternative in {@link calParser#stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIDArgListStm(calParser.IDArgListStmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockStm}
	 * labeled alternative in {@link calParser#stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStm(calParser.BlockStmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfBlocktm}
	 * labeled alternative in {@link calParser#stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlocktm(calParser.IfBlocktmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStm}
	 * labeled alternative in {@link calParser#stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStm(calParser.WhileStmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SkipStm}
	 * labeled alternative in {@link calParser#stm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkipStm(calParser.SkipStmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IDExpr}
	 * labeled alternative in {@link calParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIDExpr(calParser.IDExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BracExpr}
	 * labeled alternative in {@link calParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracExpr(calParser.BracExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BinOpExpr}
	 * labeled alternative in {@link calParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinOpExpr(calParser.BinOpExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FragExpr}
	 * labeled alternative in {@link calParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFragExpr(calParser.FragExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link calParser#binary_arith_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_arith_op(calParser.Binary_arith_opContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IDFrag}
	 * labeled alternative in {@link calParser#frag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIDFrag(calParser.IDFragContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NegIDFrag}
	 * labeled alternative in {@link calParser#frag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegIDFrag(calParser.NegIDFragContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumberFrag}
	 * labeled alternative in {@link calParser#frag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberFrag(calParser.NumberFragContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrueFrag}
	 * labeled alternative in {@link calParser#frag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueFrag(calParser.TrueFragContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FalseFrag}
	 * labeled alternative in {@link calParser#frag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseFrag(calParser.FalseFragContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BrackCond}
	 * labeled alternative in {@link calParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBrackCond(calParser.BrackCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NegCond}
	 * labeled alternative in {@link calParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegCond(calParser.NegCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrAndCond}
	 * labeled alternative in {@link calParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrAndCond(calParser.OrAndCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprCompOpCond}
	 * labeled alternative in {@link calParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCompOpCond(calParser.ExprCompOpCondContext ctx);
	/**
	 * Visit a parse tree produced by {@link calParser#comp_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_op(calParser.Comp_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link calParser#arg_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg_list(calParser.Arg_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link calParser#nemp_arg_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNemp_arg_list(calParser.Nemp_arg_listContext ctx);
}