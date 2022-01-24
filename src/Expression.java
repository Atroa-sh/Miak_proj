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

        // incompatible types error
        if(
                (
                        this.type  != Type.intType      &&
                        this.type  != Type.doubleType
                )                                       ||
                (
                        right.type != Type.intType      &&
                        right.type != Type.doubleType
                )
        ) throw new Exception(String.format("No viable operator + for types %s and %s", this.type.toString(), right.type.toString()));

        if(this.type == Type.doubleType && right.type == Type.intType){
            return new Expression(Type.doubleType, (Double)this.value + (Integer)right.value);
        }
        else if(this.type == Type.intType && right.type == Type.doubleType){
            return new Expression(Type.doubleType, (Integer)this.value + (Double)right.value);
        }
        else if(this.type == Type.doubleType){
            return new Expression(Type.doubleType, (Double)this.value + (Double)right.value);
        }
        return new Expression(Type.intType, (Integer)this.value + (Integer) right.value);
    }

    public Expression mul(Expression right) throws Exception {

        // incompatible types error
        if(
                (
                        this.type  != Type.intType      &&
                        this.type  != Type.doubleType
                )                                       ||
                (
                        right.type != Type.intType      &&
                        right.type != Type.doubleType
                )
        ) throw new Exception(String.format("No viable operator * for types %s and %s", this.type.toString(), right.type.toString()));

        if(this.type == Type.doubleType && right.type == Type.intType){
            return new Expression(Type.doubleType, (Double)this.value * (Integer)right.value);
        }
        else if(this.type == Type.intType && right.type == Type.doubleType){
            return new Expression(Type.doubleType, (Integer)this.value * (Double)right.value);
        }
        else if(this.type == Type.doubleType){
            return new Expression(Type.doubleType, (Double)this.value * (Double)right.value);
        }
        return new Expression(Type.intType, (Integer)this.value * (Integer) right.value);
    }

    public Expression div(Expression right) throws Exception {

        // incompatible types error
        if(
                (
                        this.type  != Type.intType      &&
                        this.type  != Type.doubleType
                )                                       ||
                (
                        right.type != Type.intType      &&
                        right.type != Type.doubleType
                )
        ) throw new Exception(String.format("No viable operator / for types %s and %s", this.type.toString(), right.type.toString()));

        // dividing by 0
        if(
                (right.type == Type.intType    && (Integer) right.value == 0) ||
                (right.type == Type.doubleType && (Double)  right.value == 0.)
        ) throw new Exception("Cannot divide by 0");

        if(this.type == Type.doubleType && right.type == Type.intType){
            return new Expression(Type.doubleType, (Double)this.value / (double) (Integer)right.value);
        }
        else if(this.type == Type.intType && right.type == Type.doubleType){
            return new Expression(Type.doubleType, (double) (Integer) this.value / (Double)right.value);
        }
        else if(this.type == Type.doubleType){
            return new Expression(Type.doubleType, (Double)this.value / (Double)right.value);
        }
        return new Expression(Type.intType, (Integer)this.value / (Integer) right.value);
    }

    public Expression sub(Expression right) throws Exception {

        // incompatible types error
        if(
                (
                        this.type  != Type.intType      &&
                        this.type  != Type.doubleType
                )                                       ||
                (
                        right.type != Type.intType      &&
                        right.type != Type.doubleType
                )
        ) throw new Exception(String.format("No viable operator - for types %s and %s", this.type.toString(), right.type.toString()));

        if(this.type == Type.doubleType && right.type == Type.intType){
            return new Expression(Type.doubleType, (Double)this.value - (Integer)right.value);
        }
        else if(this.type == Type.intType && right.type == Type.doubleType){
            return new Expression(Type.doubleType, (Integer)this.value - (Double)right.value);
        }
        else if(this.type == Type.doubleType){
            return new Expression(Type.doubleType, (Double)this.value - (Double)right.value);
        }
        return new Expression(Type.intType, (Integer)this.value - (Integer) right.value);
    }

    public Expression pow(Expression right) throws Exception {

        // incompatible types error
        if(
                (
                        this.type  != Type.intType      &&
                        this.type  != Type.doubleType
                )                                       ||
                (
                        right.type != Type.intType      &&
                        right.type != Type.doubleType
                )
        ) throw new Exception(String.format("No viable operator ** for types %s and %s", this.type.toString(), right.type.toString()));

        if(this.type == Type.doubleType && right.type == Type.intType){
            return new Expression(Type.doubleType, Math.pow((Double)this.value, (Integer)right.value))  ;
        }
        else if(this.type == Type.intType && right.type == Type.doubleType){
            return new Expression(Type.doubleType, Math.pow((Integer)this.value, (Double)right.value));
        }
        else if(this.type == Type.doubleType) {
            return new Expression(Type.doubleType, Math.pow((Integer) this.value, (Double) right.value));
        }
        return new Expression(Type.doubleType, Math.pow((Integer)this.value, (Integer)right.value));
    }

    public Expression neg() throws Exception {
        // incompatible type error
        if(
                this.type  != Type.intType      &&
                this.type  != Type.doubleType
        ) throw new Exception(String.format("No viable operator - for type %s", this.type.toString()));

        if(this.type == Type.doubleType){
            return new Expression(Type.doubleType, -(Double)this.value);
        }
        return new Expression(Type.intType, -(Integer)this.value);
    }

    public Expression lesser(Expression right) throws Exception {

        // incompatible types error
        if(
                (
                        this.type  != Type.intType      &&
                        this.type  != Type.doubleType
                )                                       ||
                (
                        right.type != Type.intType      &&
                        right.type != Type.doubleType
                )
        ) throw new Exception(String.format("No viable operator < for types %s and %s", this.type.toString(), right.type.toString()));


        if(this.type == Type.doubleType && right.type == Type.intType){
            return new Expression(Type.boolType, (Double)this.value < (Integer)right.value);
        }
        else if(this.type == Type.intType && right.type == Type.doubleType){
            return new Expression(Type.boolType, (Integer)this.value < (Double)right.value);
        }
        else if(this.type == Type.doubleType){
            return new Expression(Type.boolType, (Double)this.value < (Double)right.value);
        }
        return new Expression(Type.boolType, (Integer)this.value < (Integer) right.value);
    }

    public Expression greater(Expression right) throws Exception {
        // incompatible types error
        if(
                (
                        this.type  != Type.intType      &&
                        this.type  != Type.doubleType
                )                                       ||
                (
                        right.type != Type.intType      &&
                        right.type != Type.doubleType
                )
        ) throw new Exception(String.format("No viable operator > for types %s and %s", this.type.toString(), right.type.toString()));

        if(this.type == Type.doubleType && right.type == Type.intType){
            return new Expression(Type.boolType, (Double)this.value > (Integer)right.value);
        }
        else if(this.type == Type.intType && right.type == Type.doubleType){
            return new Expression(Type.boolType, (Integer)this.value > (Double)right.value);
        }
        else if(this.type == Type.doubleType){
            return new Expression(Type.boolType, (Double)this.value > (Double)right.value);
        }
        return new Expression(Type.boolType, (Integer)this.value > (Integer) right.value);
    }

    public Expression leq(Expression right) throws Exception {

        // incompatible types error
        if(
                (
                        this.type  != Type.intType      &&
                        this.type  != Type.doubleType
                )                                       ||
                (
                        right.type != Type.intType      &&
                        right.type != Type.doubleType
                )
        ) throw new Exception(String.format("No viable operator <= for types %s and %s", this.type.toString(), right.type.toString()));

        if(this.type == Type.doubleType && right.type == Type.intType){
            return new Expression(Type.boolType, (Double)this.value <= (Integer)right.value);
        }
        else if(this.type == Type.intType && right.type == Type.doubleType){
            return new Expression(Type.boolType, (Integer)this.value <= (Double)right.value);
        }
        else if(this.type == Type.doubleType){
            return new Expression(Type.boolType, (Double)this.value <= (Double)right.value);
        }
        return new Expression(Type.boolType, (Integer)this.value <= (Integer) right.value);
    }

    public Expression geq(Expression right) throws Exception {

        // incompatible types error
        if(
                (
                        this.type  != Type.intType      &&
                        this.type  != Type.doubleType
                )                                       ||
                (
                        right.type != Type.intType      &&
                        right.type != Type.doubleType
                )
        ) throw new Exception(String.format("No viable operator >= for types %s and %s", this.type.toString(), right.type.toString()));

        if(this.type == Type.doubleType && right.type == Type.intType){
            return new Expression(Type.boolType, (Double)this.value >= (Integer)right.value);
        }
        else if(this.type == Type.intType && right.type == Type.doubleType){
            return new Expression(Type.boolType, (Integer)this.value >= (Double)right.value);
        }
        else if(this.type == Type.doubleType){
            return new Expression(Type.boolType, (Double)this.value >= (Double)right.value);
        }
        return new Expression(Type.boolType, (Integer)this.value >= (Integer) right.value);
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

    public Expression not() throws Exception {
        // incompatible type error
        if(
                this.type  != Type.boolType
        ) throw new Exception(String.format("No viable operator 'not' for type %s", this.type.toString()));

        return new Expression(Type.boolType, !(boolean) this.value);
    }

    public Expression and(Expression right) throws Exception {
        // incompatible type error
        if(
                this.type   != Type.boolType ||
                right.type  != Type.boolType
        ) throw new Exception(String.format("No viable operator 'and' for types %s and %s", this.type.toString(), right.type.toString()));

        return new Expression(Type.boolType, (boolean) this.value && (boolean) right.value);
    }

    public Expression or(Expression right) throws Exception {
        // incompatible type error
        if(
                this.type   != Type.boolType ||
                        right.type  != Type.boolType
        ) throw new Exception(String.format("No viable operator 'or' for types %s and %s", this.type.toString(), right.type.toString()));

        return new Expression(Type.boolType, (boolean) this.value || (boolean) right.value);
    }
}
