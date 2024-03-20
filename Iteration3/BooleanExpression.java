public class BooleanExpression implements Expression {
    private boolean booleanValue;

    public BooleanExpression(boolean booleanValue) {
        this.booleanValue = booleanValue;
    }

    @Override
    public Object interpret(Context context) {
        return Boolean.valueOf(booleanValue);
    }

}
