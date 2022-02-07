import static java.lang.Math.floor;
import static java.lang.Math.round;

public class Variable {

    private Type type;
    private String id;
    private Object value;

    public Variable(Type type, String id) {
        this.type = type;
        this.id = id;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getValue() {
        return value;
    }

    public void assignValue(Expression exp) throws Exception {
        if( this.type == exp.type ) {
            this.value = exp.value;
        }
        else if(this.type == Type.doubleType && exp.type == Type.intType){
            this.value = 1. * ( Integer ) exp.value;
        }
        else if(this.type == Type.intType && exp.type == Type.doubleType){
            this.value = round(floor( Double.parseDouble(exp.value.toString()) ));
        }
        else throw new Exception(String.format("Invalid type. Expected %s, got %s", this.type, exp.type));
    }
}
