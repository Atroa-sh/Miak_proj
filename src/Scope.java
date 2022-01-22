import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Scope {

    private Map<String, Function> functionMap = new HashMap<>();

    private Map<String, Variable> variableMap = new HashMap<>();

    private Scope parentScope;

    private Boolean ignorableAsParent = false;

    public Scope(Scope parentScope) {
        this.parentScope = parentScope;
    }

    public Scope(Map<String, Variable> upperVariableMap, Scope parentScope) {
        this.parentScope = parentScope;
    }

    public Scope(Scope parentScope, Boolean ignorableAsParent) {
        this.parentScope = parentScope;
        this.ignorableAsParent = ignorableAsParent;
    }

    public Scope(Map<String, Variable> upperVariableMap, Scope parentScope, Boolean ignorableAsParent) {
        this.parentScope = parentScope;
        this.ignorableAsParent = ignorableAsParent;
    }

    public Variable getVariable(String id) throws Exception {
        Variable res;

        if( this.parentScope==null || this.variableMap.containsKey(id) )
            res = this.variableMap.get(id);
        else
            res = this.parentScope.getVariable(id);

        if (res == null) throw new Exception(String.format("No variable named %s in this scope", id));
        return res;
    }


    public Variable getOuterVariable(String id) throws Exception {
        if( this.parentScope==null ) throw new Exception("Outer keyword used in top scope");
        Variable res = this.parentScope.getOuterVariableRec(id);
        if (res == null) throw new Exception(String.format("No variable named %s in this scope", id));
        return res;
    }
    private Variable getOuterVariableRec(String id) {
        if( this.variableMap.containsKey(id) && !ignorableAsParent)  return this.variableMap.get(id);

        Variable res = this.parentScope.getOuterVariableRec(id);

        return res;
    }
    public Boolean containsVariable(String id) {
        if( this.parentScope==null )            return this.variableMap.containsKey(id);
        if( this.variableMap.containsKey(id) )  return this.variableMap.containsKey(id);

        return this.parentScope.containsVariable(id);
    }

    public Function getFunction(String id) throws Exception {
            Function res;
        if( this.parentScope==null || this.functionMap.containsKey(id))   res = this.functionMap.get(id);
        else
                     res = this.parentScope.getFunction(id);

        if ( res == null ) throw new Exception(String.format("No function named %s in this scope", id));
        return res;
    }

    public Boolean containsFunction(String id) {
        if( this.parentScope==null )            return this.functionMap.containsKey(id);
        if( this.functionMap.containsKey(id) )  return this.functionMap.containsKey(id);

        return this.parentScope.containsFunction(id);
    }


    public void declareVariable(Variable var) throws Exception {
        if( this.containsFunction(var.getId()) ) throw new Exception(String.format("a function with name %s already exists", var.getId()));

        if(!variableMap.containsKey(var.getId()))
            variableMap.put(var.getId(), var);

        else throw new Exception(String.format("Variable with id %s already declared in this scope", var.getId()));
    }

    public void assignVariable(String id, Expression exp) throws Exception {
        if(this.containsFunction(id) ) throw new Exception(String.format("assignment to function %s", id));

        Variable found = this.getVariable(id);
        if(found != null)
            found.assignValue(exp);

        else throw new Exception(String.format("Variable with id %s not declared in this scope", id));
    }

    public void declareFunction(String id, Type returnType, List<Type> argTypes, List<TerminalNode> argId, AniLangParser.Function_declarationContext ctx) throws Exception {
        if( this.containsVariable(id) ) throw new Exception(String.format("a variable with name %s already exists", id));

        if(!functionMap.containsKey(id))
            functionMap.put(id, new Function(returnType, id, argTypes, argId, ctx, this));

        else throw new Exception(String.format("Function with id %s already declared in this scope", id));
    }

//    public Function getFunction(String id) throws Exception {
//        if( this.functionMap.containsKey(id) ) return this.functionMap.get(id);
//        else throw new Exception(String.format("No function named %s in this scope", id));
//    }
}
