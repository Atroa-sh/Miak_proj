// Generated from /Users/tluszczyk/dev/JAVA/AGH/semV/MIAK/AniLang/AniLangParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AniLangParser}.
 */
public interface AniLangParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AniLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(AniLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AniLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(AniLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link AniLangParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(AniLangParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link AniLangParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(AniLangParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link AniLangParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(AniLangParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link AniLangParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(AniLangParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BreakStat}
	 * labeled alternative in {@link AniLangParser#escape_statement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStat(AniLangParser.BreakStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BreakStat}
	 * labeled alternative in {@link AniLangParser#escape_statement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStat(AniLangParser.BreakStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnStat}
	 * labeled alternative in {@link AniLangParser#escape_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStat(AniLangParser.ReturnStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnStat}
	 * labeled alternative in {@link AniLangParser#escape_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStat(AniLangParser.ReturnStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnValueStat}
	 * labeled alternative in {@link AniLangParser#escape_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnValueStat(AniLangParser.ReturnValueStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnValueStat}
	 * labeled alternative in {@link AniLangParser#escape_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnValueStat(AniLangParser.ReturnValueStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ContinueStat}
	 * labeled alternative in {@link AniLangParser#escape_statement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStat(AniLangParser.ContinueStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ContinueStat}
	 * labeled alternative in {@link AniLangParser#escape_statement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStat(AniLangParser.ContinueStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link AniLangParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(AniLangParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link AniLangParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(AniLangParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link AniLangParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(AniLangParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link AniLangParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(AniLangParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link AniLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(AniLangParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AniLangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(AniLangParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AniLangParser#expr_1}.
	 * @param ctx the parse tree
	 */
	void enterExpr_1(AniLangParser.Expr_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link AniLangParser#expr_1}.
	 * @param ctx the parse tree
	 */
	void exitExpr_1(AniLangParser.Expr_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link AniLangParser#expr_2}.
	 * @param ctx the parse tree
	 */
	void enterExpr_2(AniLangParser.Expr_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link AniLangParser#expr_2}.
	 * @param ctx the parse tree
	 */
	void exitExpr_2(AniLangParser.Expr_2Context ctx);
	/**
	 * Enter a parse tree produced by {@link AniLangParser#expr_3}.
	 * @param ctx the parse tree
	 */
	void enterExpr_3(AniLangParser.Expr_3Context ctx);
	/**
	 * Exit a parse tree produced by {@link AniLangParser#expr_3}.
	 * @param ctx the parse tree
	 */
	void exitExpr_3(AniLangParser.Expr_3Context ctx);
	/**
	 * Enter a parse tree produced by {@link AniLangParser#expr_4}.
	 * @param ctx the parse tree
	 */
	void enterExpr_4(AniLangParser.Expr_4Context ctx);
	/**
	 * Exit a parse tree produced by {@link AniLangParser#expr_4}.
	 * @param ctx the parse tree
	 */
	void exitExpr_4(AniLangParser.Expr_4Context ctx);
	/**
	 * Enter a parse tree produced by {@link AniLangParser#expr_5}.
	 * @param ctx the parse tree
	 */
	void enterExpr_5(AniLangParser.Expr_5Context ctx);
	/**
	 * Exit a parse tree produced by {@link AniLangParser#expr_5}.
	 * @param ctx the parse tree
	 */
	void exitExpr_5(AniLangParser.Expr_5Context ctx);
	/**
	 * Enter a parse tree produced by {@link AniLangParser#expr_6}.
	 * @param ctx the parse tree
	 */
	void enterExpr_6(AniLangParser.Expr_6Context ctx);
	/**
	 * Exit a parse tree produced by {@link AniLangParser#expr_6}.
	 * @param ctx the parse tree
	 */
	void exitExpr_6(AniLangParser.Expr_6Context ctx);
	/**
	 * Enter a parse tree produced by {@link AniLangParser#expr_7}.
	 * @param ctx the parse tree
	 */
	void enterExpr_7(AniLangParser.Expr_7Context ctx);
	/**
	 * Exit a parse tree produced by {@link AniLangParser#expr_7}.
	 * @param ctx the parse tree
	 */
	void exitExpr_7(AniLangParser.Expr_7Context ctx);
	/**
	 * Enter a parse tree produced by {@link AniLangParser#expr_8}.
	 * @param ctx the parse tree
	 */
	void enterExpr_8(AniLangParser.Expr_8Context ctx);
	/**
	 * Exit a parse tree produced by {@link AniLangParser#expr_8}.
	 * @param ctx the parse tree
	 */
	void exitExpr_8(AniLangParser.Expr_8Context ctx);
	/**
	 * Enter a parse tree produced by {@link AniLangParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(AniLangParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AniLangParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(AniLangParser.Unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AniLangParser#declaration_stat}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration_stat(AniLangParser.Declaration_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link AniLangParser#declaration_stat}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration_stat(AniLangParser.Declaration_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link AniLangParser#assignment_stat}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stat(AniLangParser.Assignment_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link AniLangParser#assignment_stat}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stat(AniLangParser.Assignment_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link AniLangParser#else_stat}.
	 * @param ctx the parse tree
	 */
	void enterElse_stat(AniLangParser.Else_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link AniLangParser#else_stat}.
	 * @param ctx the parse tree
	 */
	void exitElse_stat(AniLangParser.Else_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link AniLangParser#else_if_stat}.
	 * @param ctx the parse tree
	 */
	void enterElse_if_stat(AniLangParser.Else_if_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link AniLangParser#else_if_stat}.
	 * @param ctx the parse tree
	 */
	void exitElse_if_stat(AniLangParser.Else_if_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link AniLangParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_stat(AniLangParser.If_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link AniLangParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_stat(AniLangParser.If_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link AniLangParser#for_stat}.
	 * @param ctx the parse tree
	 */
	void enterFor_stat(AniLangParser.For_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link AniLangParser#for_stat}.
	 * @param ctx the parse tree
	 */
	void exitFor_stat(AniLangParser.For_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link AniLangParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stat(AniLangParser.While_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link AniLangParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stat(AniLangParser.While_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link AniLangParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(AniLangParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link AniLangParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(AniLangParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link AniLangParser#println}.
	 * @param ctx the parse tree
	 */
	void enterPrintln(AniLangParser.PrintlnContext ctx);
	/**
	 * Exit a parse tree produced by {@link AniLangParser#println}.
	 * @param ctx the parse tree
	 */
	void exitPrintln(AniLangParser.PrintlnContext ctx);
	/**
	 * Enter a parse tree produced by {@link AniLangParser#createScene}.
	 * @param ctx the parse tree
	 */
	void enterCreateScene(AniLangParser.CreateSceneContext ctx);
	/**
	 * Exit a parse tree produced by {@link AniLangParser#createScene}.
	 * @param ctx the parse tree
	 */
	void exitCreateScene(AniLangParser.CreateSceneContext ctx);
	/**
	 * Enter a parse tree produced by {@link AniLangParser#createBox}.
	 * @param ctx the parse tree
	 */
	void enterCreateBox(AniLangParser.CreateBoxContext ctx);
	/**
	 * Exit a parse tree produced by {@link AniLangParser#createBox}.
	 * @param ctx the parse tree
	 */
	void exitCreateBox(AniLangParser.CreateBoxContext ctx);
	/**
	 * Enter a parse tree produced by {@link AniLangParser#buildScene}.
	 * @param ctx the parse tree
	 */
	void enterBuildScene(AniLangParser.BuildSceneContext ctx);
	/**
	 * Exit a parse tree produced by {@link AniLangParser#buildScene}.
	 * @param ctx the parse tree
	 */
	void exitBuildScene(AniLangParser.BuildSceneContext ctx);
	/**
	 * Enter a parse tree produced by {@link AniLangParser#block_stat}.
	 * @param ctx the parse tree
	 */
	void enterBlock_stat(AniLangParser.Block_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link AniLangParser#block_stat}.
	 * @param ctx the parse tree
	 */
	void exitBlock_stat(AniLangParser.Block_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link AniLangParser#blockless_stat}.
	 * @param ctx the parse tree
	 */
	void enterBlockless_stat(AniLangParser.Blockless_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link AniLangParser#blockless_stat}.
	 * @param ctx the parse tree
	 */
	void exitBlockless_stat(AniLangParser.Blockless_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link AniLangParser#stat_with_semicolon}.
	 * @param ctx the parse tree
	 */
	void enterStat_with_semicolon(AniLangParser.Stat_with_semicolonContext ctx);
	/**
	 * Exit a parse tree produced by {@link AniLangParser#stat_with_semicolon}.
	 * @param ctx the parse tree
	 */
	void exitStat_with_semicolon(AniLangParser.Stat_with_semicolonContext ctx);
	/**
	 * Enter a parse tree produced by {@link AniLangParser#then}.
	 * @param ctx the parse tree
	 */
	void enterThen(AniLangParser.ThenContext ctx);
	/**
	 * Exit a parse tree produced by {@link AniLangParser#then}.
	 * @param ctx the parse tree
	 */
	void exitThen(AniLangParser.ThenContext ctx);
	/**
	 * Enter a parse tree produced by {@link AniLangParser#end}.
	 * @param ctx the parse tree
	 */
	void enterEnd(AniLangParser.EndContext ctx);
	/**
	 * Exit a parse tree produced by {@link AniLangParser#end}.
	 * @param ctx the parse tree
	 */
	void exitEnd(AniLangParser.EndContext ctx);
	/**
	 * Enter a parse tree produced by {@link AniLangParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(AniLangParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link AniLangParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(AniLangParser.BlockContext ctx);
}