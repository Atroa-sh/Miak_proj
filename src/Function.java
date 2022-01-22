import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

public class Function {
    private Type returnType;
    private String id;

    private List<Type> argTypes = new ArrayList();
    private List<String> argId = new ArrayList();
    private int paramCount;

    private AniLangParser.Function_declarationContext ctx;
    private Scope parentScope, currentScope;

    public Function(Type returnType, String id, List<Type> argTypes, List<TerminalNode> argId, AniLangParser.Function_declarationContext ctx, Scope parentScope) {
        this.returnType = returnType;
        this.parentScope = parentScope;
        this.id = id;

        for (int i=1; i<argId.size(); i++) this.argId.add(argId.get(i).getText());
//        argId.remove(0); // getting rid of function name

        this.argTypes = argTypes.subList(1, argTypes.size());
//        argTypes.remove(0);

        this.paramCount = this.argTypes.size();

        this.ctx = ctx;
    }

    public int getParamCount() {
        return paramCount;
    }

    public Type getReturnType() {
        return returnType;
    }

    public void setReturnType(Type returnType) {
        this.returnType = returnType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Scope getParentScope() {
        return this.parentScope;
    }

    public List<Type> getArgTypes() {
        return argTypes;
    }

    public List<String> getArgId() {
        return argId;
    }

    public AniLangParser.Function_declarationContext getCtx(){
        return ctx;
    }
}