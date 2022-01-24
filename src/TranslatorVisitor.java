import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

// TODO: Return ma zwracać wartość i kończyć działanie funkcji
// TODO: Dokończyć operatory boolowskie i arytmetyczne
//      bool -> Tłuszcz ------------------------------------------- ✓
//      aryt -> Kacper  ------------------------------------------- ✓
// TODO: Przekazywanie argumentów do funkcji ---------------------- ✓
// TODO: Przekazywanie scope-ów do funkcji ------------------------ ✓
// TODO:
//      Kacper -> Operator Outer ---------------------------------- ✓
// TODO: Pętle
//      for   -> Tłuszcz ------------------------------------------ ✓
//      while -> Kacper  ------------------------------------------ ✓
// TODO:
//      Tłuszcz -> else do if-a ----------------------------------- ✓
// TODO: Podstawy x3dom
// TODO: * Obsługa błędów
// TODO: * Rzutowanie

// TODO: Dokumentacja
// TODO: Kompilator (program)

// TODO: Błędy
//      Expression ------------> Filip
//      Scene -----------------> Kacper
//      Scope -----------------> Kacper --------------------------- ✓
//      Box   -----------------> Kacper
//      Shape -----------------> Kacper

public class TranslatorVisitor extends AniLangParserBaseVisitor {
    private AniLangParser parser;

    private List<Scope> scopeStack = new ArrayList<>();

    private Scene scene;

    private Expression currentlyReturnedExpression;

    private AniLangParser.EndContext currentEndContext;


    public TranslatorVisitor(AniLangParser parser) {
        this.parser = parser;

        scopeStack.add(new Scope(null));
    }

    @Override
    public Object visitProgram(AniLangParser.ProgramContext ctx) {
        return super.visitProgram(ctx);
    }

    @Override
    public Object visitAtom(AniLangParser.AtomContext ctx) {
        return ctx.id() == null ? new Expression(ctx.getText()) : visitId(ctx.id()) ;
    }

    @Override
    public Object visitUnary_operator(AniLangParser.Unary_operatorContext ctx) {
        return super.visitUnary_operator(ctx);
    }

    @Override
    public Object visitBreakStat(AniLangParser.BreakStatContext ctx) {
        return super.visitBreakStat(ctx);
    }

    @Override
    public Object visitReturnStat(AniLangParser.ReturnStatContext ctx) {
        return super.visitReturnStat(ctx);
    }

    @Override
    public Object visitReturnValueStat(AniLangParser.ReturnValueStatContext ctx) {
        currentlyReturnedExpression = (Expression) visitExpr(ctx.expr());

        return super.visitReturnValueStat(ctx);
    }

    @Override
    public Object visitContinueStat(AniLangParser.ContinueStatContext ctx) {
        return super.visitContinueStat(ctx);
    }

    @Override
    public Object visitFunction_declaration(AniLangParser.Function_declarationContext ctx) {
//        System.out.println("function declaration for sure");

        try {
            getCurrentScope()
                    .declareFunction(
                            ctx.Id(0).getText(),
                            stringToType(ctx.Type(0)),
                            stringToType(ctx.Type()),
                            ctx.Id(),
                            ctx
                    );
        } catch(Exception e) {
            raiseError(e.toString(), ctx.getStart().getLine());
        }

        return null;//super.visitFunction_declaration(ctx);
    }

    @Override
    public Object visitFunction_call(AniLangParser.Function_callContext ctx) {
//        System.out.println("function call for sure");

        Scope functionArgumentsScope = new Scope(getCurrentScope(), true);
        scopeStack.add(functionArgumentsScope);

        Function func;

        try {
            func = getCurrentScope().getFunction(ctx.Id().getText());

            // check if the function is well called
            if( func.getParamCount() > 0 ) {
                if( ctx.expr() == null || func.getParamCount() != ctx.expr().size() )
                    raiseError(String.format(
                            "Function %s expects %d parameters, but got %d",
                            func.getId(),
                            func.getParamCount(),
                            ctx.expr().size()
                    ), ctx.getStart().getLine());

                // get the values of the expressions to pass as parameters
                List<Expression> values = new ArrayList<>();

                for(int parNum = 0; parNum < ctx.expr().size(); parNum++)
                    values.add((Expression) visitExpr(ctx.expr(parNum)));

                // parameter variables declaration and assignment
                for(int parNum = 0; parNum < func.getParamCount(); parNum++) {

                    Expression value = values.get(parNum);

                    // declaration
                    functionArgumentsScope.declareVariable(new Variable(
                            func.getArgTypes().get(parNum),
                            func.getArgId().get(parNum)
                    ));

                    // assignment
                    if( value.type != func.getArgTypes().get(parNum) ) {
                        raiseError(String.format(
                                "Parameter %d to function %s is type %s, but got %s",
                                parNum,
                                func.getId(),
                                func.getArgTypes().get(parNum),
                                value.type
                        ), ctx.getStart().getLine());
                    }

                    functionArgumentsScope.getVariable(
                            func
                                    .getArgId()
                                    .get(parNum)
                    ).assignValue(value);
                }
            }

            super.visitFunction_declaration(func.getCtx());

        } catch (Exception e) {
            e.printStackTrace();
        }

        scopeStack.remove(getCurrentScope());

        return super.visitFunction_call(ctx);
    }

    @Override
    public Object visitId(AniLangParser.IdContext ctx) {
        Variable var = null;
        try {
            var = getCurrentScope().getVariable(ctx.getText());
        } catch (Exception e) {
            raiseError(e.getMessage(), ctx.getStart().getLine());
        }

        return new Expression(var.getType(), var.getValue());
    }

//    @Override
//    public Object visitBinaryExpr(AniLangParser.BinaryExprContext ctx) {
//        Expression leftExpr = evaluateExpr(ctx.expr(0));
//        Expression rightExpr = evaluateExpr(ctx.expr(1));
//
//        return switch ( (String) visitBinary_operator(ctx.binary_operator()) ) {
//            // Arithmetic
//            case "+" -> leftExpr.add(rightExpr);
//            case "-" -> leftExpr.sub(rightExpr);
//            case "*" -> leftExpr.mul(rightExpr);
//            case "/" -> leftExpr.div(rightExpr);
//            case "**" -> leftExpr.pow(rightExpr);
//
//            // Boolean
//            case "and" -> leftExpr.and(rightExpr);
//            case "or" -> leftExpr.or(rightExpr);
//
//            // Comparation
//            case "<" -> leftExpr.lesser(rightExpr);
//            case ">" -> leftExpr.greater(rightExpr);
//            case "<=" -> leftExpr.leq(rightExpr);
//            case ">=" -> leftExpr.geq(rightExpr);
//            case "==" -> leftExpr.eq(rightExpr);
//
//            // Default
//            default -> null;
//        };
//    }

    @Override // Or
    public Object visitExpr(AniLangParser.ExprContext ctx) {
        Expression result = (Expression) this.visitExpr_1(ctx.expr_1(0));

        if( ctx.Or(0) != null ) {

            for(int i=1; i<ctx.expr_1().size(); i++) {
                result = result.or( (Expression) this.visitExpr_1(ctx.expr_1(i)) );
            }
        }
        return result;
    }

    @Override // And
    public Object visitExpr_1(AniLangParser.Expr_1Context ctx) {
        Expression result = (Expression) this.visitExpr_2(ctx.expr_2(0));

        if( ctx.And(0) != null ) {

            for(int i=1; i<ctx.expr_2().size(); i++) {
                result = result.and( (Expression) this.visitExpr_2(ctx.expr_2(i)) );
            }
        }
        return result;
    }

    @Override // Lesser | Greater | Leq | Geq | Equals
    public Object visitExpr_2(AniLangParser.Expr_2Context ctx) {
        Expression left = (Expression) this.visitExpr_3(ctx.expr_3(0));

        if( ctx.expr_3().size() > 1 ) {
            Expression right = (Expression) this.visitExpr_3(ctx.expr_3(1));

            return switch(ctx.ComparationToken().getText()) {
                case "<" -> left.lesser(right);
                case ">" -> left.greater(right);
                case "<=" -> left.leq(right);
                case ">=" -> left.geq(right);
                case "==" -> left.eq(right);

                default -> null;
            };
        }
        return left;
    }

    @Override // Minus
    public Object visitExpr_3(AniLangParser.Expr_3Context ctx) {
        Expression left = (Expression) this.visitExpr_4(ctx.expr_4(0));

        if( ctx.expr_4().size() > 1 ) {
            for(int i=1; i<ctx.expr_4().size(); i++) {
                Expression right = (Expression) this.visitExpr_4(ctx.expr_4(i));

                left = switch(ctx.Minus(i-1).getText()) {
                    case "-" -> left.sub(right);
                    default -> null;
                };
            }
        }
        return left;
    }

    @Override // Plus
    public Object visitExpr_4(AniLangParser.Expr_4Context ctx) {
        Expression left = (Expression) this.visitExpr_5(ctx.expr_5(0));

        if( ctx.expr_5().size() > 1 ) {
            for(int i=1; i<ctx.expr_5().size(); i++) {
                Expression right = (Expression) this.visitExpr_5(ctx.expr_5(i));

                try {
                    left = switch(ctx.Plus(i-1).getText()) {
                        case "+" -> left.add(right);
                        default -> null;
                    };
                } catch( Exception e) {
                    raiseError(
                            e.getMessage(),
                            ctx.getStart().getLine()
                    );
                }
            }
        }
        return left;
    }

    @Override // Star | Slash
    public Object visitExpr_5(AniLangParser.Expr_5Context ctx) {
        Expression left = (Expression) this.visitExpr_6(ctx.expr_6(0));

        if( ctx.expr_6().size() > 1 ) {
            for(int i=1; i<ctx.expr_6().size(); i++) {
                Expression right = (Expression) this.visitExpr_6(ctx.expr_6(i));

                left = switch(ctx.Star_Slash(i-1).getText()) {
                    case "*" -> left.mul(right);
                    case "/" -> left.div(right);
                    default -> null;
                };
            }
        }
        return left;
    }

    @Override // unary operator
    public Object visitExpr_6(AniLangParser.Expr_6Context ctx) {
        Expression result = (Expression) this.visitExpr_7(ctx.expr_7());

        if( ctx.unary_operator() != null ) {

            return switch ( ctx.unary_operator().getText() ) {
                // Arithmetic
                case "-" -> result.neg();

                // Boolean
                case "!" -> result.not();

                // Default
                default -> null;
            };
        }
        return result;
    }

    @Override // Power
    public Object visitExpr_7(AniLangParser.Expr_7Context ctx) {
        Expression left = (Expression) this.visitExpr_8(ctx.expr_8(0));

        if( ctx.Power(0) != null ) {

            for(int i=1; i<ctx.expr_8().size(); i++) {
                Expression right =  (Expression) this.visitExpr_8(ctx.expr_8(i));

                left = left.pow( right );
            }
        }
        return left;
    }

    @Override // atom | Outer id | function_call | Open_Parenthesis expr Close_Parenthesis
    public Object visitExpr_8(AniLangParser.Expr_8Context ctx) {
        if( ctx.atom() != null ) {
            return this.visitAtom(ctx.atom());

        } else if( ctx.Outer() != null ) {
            return this.visitOuterExpr(ctx.id().getText(), ctx.getStart().getLine());

        } else if( ctx.function_call() != null ) {
            this.visitFunction_call(ctx.function_call());
            return currentlyReturnedExpression;

        } else if( ctx.Open_Parenthesis() != null ) {
            return visitExpr(ctx.expr());
        }
        return null;
    }

    @Override
    public Object visitPrint(AniLangParser.PrintContext ctx) {
        System.out.print(visitExpr(ctx.expr()));
        return null;
    }

    @Override
    public Object visitPrintln(AniLangParser.PrintlnContext ctx) {
        System.out.println(visitExpr(ctx.expr()));
        return super.visitPrintln(ctx);
    }

    @Override
    public Object visitCreateScene(AniLangParser.CreateSceneContext ctx) {
        // TODO: czy Scene ma dwa argumenty
        // TODO: czy argumenty to int

        this.scene = new Scene(
                (int) ((Expression) this.visitExpr(ctx.expr(0))).value,
                (int) ((Expression) this.visitExpr(ctx.expr(1))).value
        );

        return super.visitCreateScene(ctx);
    }

    @Override
    public Object visitCreateBox(AniLangParser.CreateBoxContext ctx) {
        // TODO: czy Box ma 9 argumentów
        // TODO: czy argumenty to int
        // TODO: czy scena powstala wczesniej

        this.scene.addShape(new Box(
                (int) ((Expression) this.visitExpr(ctx.expr(0))).value,
                (int) ((Expression) this.visitExpr(ctx.expr(1))).value,
                (int) ((Expression) this.visitExpr(ctx.expr(2))).value,
                (int) ((Expression) this.visitExpr(ctx.expr(3))).value,
                (int) ((Expression) this.visitExpr(ctx.expr(4))).value,
                (int) ((Expression) this.visitExpr(ctx.expr(5))).value,
                (int) ((Expression) this.visitExpr(ctx.expr(6))).value,
                (int) ((Expression) this.visitExpr(ctx.expr(7))).value,
                (int) ((Expression) this.visitExpr(ctx.expr(8))).value
        ));

        return super.visitCreateBox(ctx);
    }

    @Override
    public Object visitBuildScene(AniLangParser.BuildSceneContext ctx) {

        String filePath = "./result.html";
        String result = this.scene.build();
        FileWriter fw;
        try {
            File file = new File( filePath );
            fw = new FileWriter(file, false);

            fw.write(result);

            fw.flush();
            fw.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return super.visitBuildScene(ctx);
    }

    private Object visitOuterExpr(String id, int line) {
        Variable var = null;
        try {
            var = getCurrentScope().getOuterVariable(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if( var == null ) raiseError(
                String.format("Variable named %s is not defined in this scope", id),
                line
        );

        return new Expression(var.getType(), var.getValue());
    }

    @Override
    public Object visitDeclaration_stat(AniLangParser.Declaration_statContext ctx) {

        Variable result = new Variable(
                stringToType(ctx.Type().getText()),
                ctx.Id().getText()
        );

        try {
            getCurrentScope().declareVariable(result);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if( ctx.expr() != null ) {
            Expression assignment = (Expression) visitExpr(ctx.expr());

            try {
                result.assignValue(assignment);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return assignment;
        }

        return null;
    }

    @Override
    public Object visitAssignment_stat(AniLangParser.Assignment_statContext ctx) {
//        System.out.println("assignment for sure");

        Expression assignment = (Expression) visitExpr(ctx.expr());

        try {
            getCurrentScope().assignVariable(ctx.Id().getText(), assignment);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return assignment;
    }

    @Override
    public Object visitIf_stat(AniLangParser.If_statContext ctx) {
        //system.out.println("if for sure");

        Expression condition = (Expression) visitExpr(ctx.expr());
        if( condition.type != Type.boolType ) raiseError(
                "Condition is not a boolean expression",
                ctx.getStart().getLine()
        );

        currentEndContext = ctx.block().end();

        if( (Boolean) condition.value ) {
            super.visitBlock(ctx.block());
            return true;
        }

        if( ctx.else_if_stat() != null ) {
            for(AniLangParser.Else_if_statContext eisc : ctx.else_if_stat() ) {
                Boolean entered = (Boolean) this.visitElse_if_stat(eisc);

                if( entered ) return true;
            }
        }

        if( ctx.else_stat() != null )
            return this.visitElse_stat(ctx.else_stat());

        return false;
    }

    @Override
    public Object visitElse_if_stat(AniLangParser.Else_if_statContext ctx) {
        Expression condition = (Expression) visitExpr(ctx.expr());
        if( condition.type != Type.boolType ) raiseError("Condition is not a boolean expression", ctx.getStart().getLine());

        if( (Boolean) condition.value ) {
            super.visitBlock(ctx.block());
            return true;
        }

        return false;
    }

    @Override
    public Object visitElse_stat(AniLangParser.Else_statContext ctx) {
        super.visitBlock(ctx.block());
        return true;
    }

    @Override
    public Object visitFor_stat(AniLangParser.For_statContext ctx) {
//        System.out.println("for for sure");

        Scope forDeclarationScope = new Scope(getCurrentScope(), true);
        scopeStack.add(forDeclarationScope);

        if( ctx.assignment_stat() != null ) this.visitAssignment_stat(ctx.assignment_stat());
        else if( ctx.declaration_stat() != null ) this.visitDeclaration_stat(ctx.declaration_stat());

        Expression condition = (Expression) visitExpr(ctx.expr());
        if( condition.type != Type.boolType ) raiseError("Condition is not a boolean expression", ctx.getStart().getLine());

        while( (Boolean) condition.value ) {
            super.visitBlock(ctx.block());

            if( ctx.blockless_stat() != null ) this.visitBlockless_stat(ctx.blockless_stat());

            // evaluating the condition at the end
            condition = (Expression) visitExpr(ctx.expr());
        }

        scopeStack.remove(getCurrentScope());

        return null;//super.visitFor_stat(ctx);
    }

    @Override
    public Object visitWhile_stat(AniLangParser.While_statContext ctx) {
        //system.out.println("while for sure");
        Expression condition = (Expression) visitExpr(ctx.expr());
        if( condition.type != Type.boolType ) raiseError("Condition is not a boolean expression", ctx.getStart().getLine());

        while( (Boolean) condition.value ) {
            super.visitBlock(ctx.block());
            condition = (Expression) visitExpr(ctx.expr());
        }
        return null;
    }

    @Override
    public Object visitBlock_stat(AniLangParser.Block_statContext ctx) {
        return super.visitBlock_stat(ctx);
    }

    @Override
    public Object visitBlockless_stat(AniLangParser.Blockless_statContext ctx) {
        return super.visitBlockless_stat(ctx);
    }

    @Override
    public Object visitStat_with_semicolon(AniLangParser.Stat_with_semicolonContext ctx) {
        return super.visitStat_with_semicolon(ctx);
    }

    @Override
    public Object visitThen(AniLangParser.ThenContext ctx) {
        Scope childScope = new Scope(getCurrentScope());
        scopeStack.add(childScope);

        return super.visitThen(ctx);
    }

    @Override
    public Object visitEnd(AniLangParser.EndContext ctx) {
        scopeStack.remove(getCurrentScope());

        return super.visitEnd(ctx);
    }

    @Override
    public Object visitBlock(AniLangParser.BlockContext ctx) {
        return super.visitBlock(ctx);
    }

    private void raiseError(String error, int line) {
        System.err.println(String.format("line %d: ", line) + error);
        System.exit(1);
    }
//    private void raiseError(String error) {
//        System.err.println(error);
//        System.exit(1);
//    }
    private Scope getCurrentScope(){
        return scopeStack.get(scopeStack.size()-1);
    }
    private Type stringToType(TerminalNode type){
        return stringToType(type.getText());
    }
    private Type stringToType(String type){
        return switch (type) {
            case "bool" -> Type.boolType;
            case "int" -> Type.intType;
            case "double" -> Type.doubleType;
            default -> null;
        };
    }
    private List<Type> stringToType(List<TerminalNode> type){
        List<Type> res = new ArrayList<>();
        for(int i = 0 ; i < type.size() ; i++){
            res.add(stringToType(type.get(i)));
        }
        return res;
    }
}
