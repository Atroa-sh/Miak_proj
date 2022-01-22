// Generated from /Users/tluszczyk/dev/JAVA/AGH/semV/MIAK/AniLang/AniLangParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AniLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AniLangParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AniLangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(AniLangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link AniLangParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(AniLangParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link AniLangParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(AniLangParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BreakStat}
	 * labeled alternative in {@link AniLangParser#escape_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStat(AniLangParser.BreakStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnStat}
	 * labeled alternative in {@link AniLangParser#escape_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStat(AniLangParser.ReturnStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnValueStat}
	 * labeled alternative in {@link AniLangParser#escape_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnValueStat(AniLangParser.ReturnValueStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ContinueStat}
	 * labeled alternative in {@link AniLangParser#escape_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinueStat(AniLangParser.ContinueStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link AniLangParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(AniLangParser.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AniLangParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(AniLangParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link AniLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(AniLangParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AniLangParser#expr_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_1(AniLangParser.Expr_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link AniLangParser#expr_2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_2(AniLangParser.Expr_2Context ctx);
	/**
	 * Visit a parse tree produced by {@link AniLangParser#expr_3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_3(AniLangParser.Expr_3Context ctx);
	/**
	 * Visit a parse tree produced by {@link AniLangParser#expr_4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_4(AniLangParser.Expr_4Context ctx);
	/**
	 * Visit a parse tree produced by {@link AniLangParser#expr_5}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_5(AniLangParser.Expr_5Context ctx);
	/**
	 * Visit a parse tree produced by {@link AniLangParser#expr_6}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_6(AniLangParser.Expr_6Context ctx);
	/**
	 * Visit a parse tree produced by {@link AniLangParser#expr_7}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_7(AniLangParser.Expr_7Context ctx);
	/**
	 * Visit a parse tree produced by {@link AniLangParser#expr_8}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_8(AniLangParser.Expr_8Context ctx);
	/**
	 * Visit a parse tree produced by {@link AniLangParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(AniLangParser.Unary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AniLangParser#declaration_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration_stat(AniLangParser.Declaration_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link AniLangParser#assignment_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_stat(AniLangParser.Assignment_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link AniLangParser#else_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_stat(AniLangParser.Else_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link AniLangParser#else_if_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_if_stat(AniLangParser.Else_if_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link AniLangParser#if_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stat(AniLangParser.If_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link AniLangParser#for_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_stat(AniLangParser.For_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link AniLangParser#while_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stat(AniLangParser.While_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link AniLangParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(AniLangParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link AniLangParser#println}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintln(AniLangParser.PrintlnContext ctx);
	/**
	 * Visit a parse tree produced by {@link AniLangParser#createScene}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateScene(AniLangParser.CreateSceneContext ctx);
	/**
	 * Visit a parse tree produced by {@link AniLangParser#createBox}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateBox(AniLangParser.CreateBoxContext ctx);
	/**
	 * Visit a parse tree produced by {@link AniLangParser#buildScene}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBuildScene(AniLangParser.BuildSceneContext ctx);
	/**
	 * Visit a parse tree produced by {@link AniLangParser#block_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_stat(AniLangParser.Block_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link AniLangParser#blockless_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockless_stat(AniLangParser.Blockless_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link AniLangParser#stat_with_semicolon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_with_semicolon(AniLangParser.Stat_with_semicolonContext ctx);
	/**
	 * Visit a parse tree produced by {@link AniLangParser#then}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThen(AniLangParser.ThenContext ctx);
	/**
	 * Visit a parse tree produced by {@link AniLangParser#end}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd(AniLangParser.EndContext ctx);
	/**
	 * Visit a parse tree produced by {@link AniLangParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(AniLangParser.BlockContext ctx);
}