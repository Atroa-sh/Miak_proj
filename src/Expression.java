import java.util.regex.Pattern;

public class Expression {
    Type type;
    Object value;

    public Expression(Type type, Object value) {
        this.type = type;
        this.value = value;
    }

    public String toString() {
        return this.value.toString();
    }

    public Expression(String value) {
        try {
            this.value = Integer.parseInt(value);
        } catch( NumberFormatException eInt ) {
            try {
                this.value = Double.parseDouble(value);
            } catch( NumberFormatException eDouble ) {

                if(value.equals("true") || value.equals("false")) {
                    this.value = Boolean.parseBoolean(value);

                    type = Type.boolType;
                    return;
                }

                this.value = value;
                return;
            }

            type = Type.doubleType;
            return;
        }

        type = Type.intType;
    }

    public Expression add(Expression right) throws Exception {

        if(
                this.type != Type.intType || this.type != Type.doubleType ||
                right.type != Type.intType || right.type != Type.doubleType
        ) throw new Exception(String.format("No viable operator + for types %s and %s", this.type.toString(), right.type.toString()));

        if(this.type == Type.doubleType && right.type == Type.intType){
            return new Expression(Type.doubleType, (Double)this.value + (Integer)right.value);
        }
        else if(this.type == Type.intType && right.type == Type.doubleType){
            return new Expression(Type.doubleType, (Integer)this.value + (Double)right.value);
        }
        else if(this.type == right.type && this.type == Type.doubleType){
            return new Expression(Type.doubleType, (Double)this.value + (Double)right.value);
        }
        else if(this.type == right.type && this.type == Type.intType){
            return new Expression(Type.intType, (Integer)this.value + (Integer) right.value);
        }

        return null;
    }
    public Expression mul(Expression right){

        if(this.type == Type.doubleType && right.type == Type.intType){
            return new Expression(Type.doubleType, (Double)this.value * (Integer)right.value);
        }
        else if(this.type == Type.intType && right.type == Type.doubleType){
            return new Expression(Type.doubleType, (Integer)this.value * (Double)right.value);
        }
        else if(this.type == right.type && this.type == Type.doubleType){
            return new Expression(Type.doubleType, (Double)this.value * (Double)right.value);
        }
        else if(this.type == right.type && this.type == Type.intType){
            return new Expression(Type.intType, (Integer)this.value * (Integer) right.value);
        }

        return null;
    }

    public Expression div(Expression right){

        if(this.type == Type.doubleType && right.type == Type.intType){
            return new Expression(Type.doubleType, (Double)this.value / (double) (Integer)right.value);
        }
        else if(this.type == Type.intType && right.type == Type.doubleType){
            return new Expression(Type.doubleType, (double) (Integer) this.value / (Double)right.value);
        }
        else if(this.type == right.type && this.type == Type.doubleType){
            return new Expression(Type.doubleType, (Double)this.value / (Double)right.value);
        }
        else if(this.type == right.type && this.type == Type.intType){
            return new Expression(Type.intType, (Integer)this.value / (Integer) right.value);
        }

        return null;
    }

    public Expression sub(Expression right){

        if(this.type == Type.doubleType && right.type == Type.intType){
            return new Expression(Type.doubleType, (Double)this.value - (Integer)right.value);
        }
        else if(this.type == Type.intType && right.type == Type.doubleType){
            return new Expression(Type.doubleType, (Integer)this.value - (Double)right.value);
        }
        else if(this.type == right.type && this.type == Type.doubleType){
            return new Expression(Type.doubleType, (Double)this.value - (Double)right.value);
        }
        else if(this.type == right.type && this.type == Type.intType){
            return new Expression(Type.intType, (Integer)this.value - (Integer) right.value);
        }

        return null;
    }

    public Expression pow(Expression right) {
        if(this.type == Type.doubleType && right.type == Type.intType){
            return new Expression(Type.doubleType, Math.pow((Double)this.value, (Integer)right.value))  ;
        }
        else if(this.type == Type.intType && right.type == Type.doubleType){
            return new Expression(Type.doubleType, Math.pow((Integer)this.value, (Double)right.value));
        }
        else if(this.type == right.type && this.type == Type.doubleType){
            return new Expression(Type.doubleType, Math.pow((Integer)this.value, (Double)right.value));
        }
        else if(this.type == right.type && this.type == Type.intType){
            return new Expression(Type.doubleType, Math.pow((Integer)this.value, (Integer)right.value));
        }

        return null;
    }

    public Expression neg(){
        if(this.type == Type.doubleType){
            return new Expression(Type.doubleType, -(Double)this.value);
        }
        if(this.type == Type.intType){
            return new Expression(Type.intType, -(Integer)this.value);
        }
        return null;
    }

    public Expression lesser(Expression right) {
        if(this.type == Type.doubleType && right.type == Type.intType){
            return new Expression(Type.boolType, (Double)this.value < (Integer)right.value);
        }
        else if(this.type == Type.intType && right.type == Type.doubleType){
            return new Expression(Type.boolType, (Integer)this.value < (Double)right.value);
        }
        else if(this.type == right.type && this.type == Type.doubleType){
            return new Expression(Type.boolType, (Double)this.value < (Double)right.value);
        }
        else if(this.type == right.type && this.type == Type.intType){
            return new Expression(Type.boolType, (Integer)this.value < (Integer) right.value);
        }

        return null;
    }

    public Expression greater(Expression right) {
        if(this.type == Type.doubleType && right.type == Type.intType){
            return new Expression(Type.boolType, (Double)this.value > (Integer)right.value);
        }
        else if(this.type == Type.intType && right.type == Type.doubleType){
            return new Expression(Type.boolType, (Integer)this.value > (Double)right.value);
        }
        else if(this.type == right.type && this.type == Type.doubleType){
            return new Expression(Type.boolType, (Double)this.value > (Double)right.value);
        }
        else if(this.type == right.type && this.type == Type.intType){
            return new Expression(Type.boolType, (Integer)this.value > (Integer) right.value);
        }

        return null;
    }

    public Expression leq(Expression right) {
        if(this.type == Type.doubleType && right.type == Type.intType){
            return new Expression(Type.boolType, (Double)this.value <= (Integer)right.value);
        }
        else if(this.type == Type.intType && right.type == Type.doubleType){
            return new Expression(Type.boolType, (Integer)this.value <= (Double)right.value);
        }
        else if(this.type == right.type && this.type == Type.doubleType){
            return new Expression(Type.boolType, (Double)this.value <= (Double)right.value);
        }
        else if(this.type == right.type && this.type == Type.intType){
            return new Expression(Type.boolType, (Integer)this.value <= (Integer) right.value);
        }

        return null;
    }

    public Expression geq(Expression right) {
        if(this.type == Type.doubleType && right.type == Type.intType){
            return new Expression(Type.boolType, (Double)this.value >= (Integer)right.value);
        }
        else if(this.type == Type.intType && right.type == Type.doubleType){
            return new Expression(Type.boolType, (Integer)this.value >= (Double)right.value);
        }
        else if(this.type == right.type && this.type == Type.doubleType){
            return new Expression(Type.boolType, (Double)this.value >= (Double)right.value);
        }
        else if(this.type == right.type && this.type == Type.intType){
            return new Expression(Type.boolType, (Integer)this.value >= (Integer) right.value);
        }

        return null;
    }

    public Expression eq(Expression right) {
        if(this.type == Type.doubleType && right.type == Type.intType){
            return new Expression(Type.boolType, (double) this.value - (int) right.value == 0);
        }
        else if(this.type == Type.intType && right.type == Type.doubleType){
            return new Expression(Type.boolType, (int) this.value - (double) right.value == 0);
        }
        else if(this.type == right.type && this.type == Type.doubleType){
            return new Expression(Type.boolType, (double) this.value - (double) right.value == 0);
        }
        else if(this.type == right.type && this.type == Type.intType){
            return new Expression(Type.boolType, (int) this.value - (int) right.value == 0);
        }

        return new Expression( Type.boolType , this.value.equals( right.value ) );
    }

    public Expression not() {
        if(this.type == Type.boolType) {
            return new Expression(Type.boolType, !(boolean) this.value);
        }
        return null;
    }

    public Expression and(Expression right) {
        if(this.type == Type.boolType && right.type == Type.boolType) {
            return new Expression(Type.boolType, (boolean) this.value && (boolean) right.value);
        }
        return null;
    }

    public Expression or(Expression right) {
        if(this.type == Type.boolType && right.type == Type.boolType) {
            return new Expression(Type.boolType, (boolean) this.value || (boolean) right.value);
        }
        return null;
    }
}
