public class BooleanExpression implements Expression<Boolean> {
    private boolean booleanValue;

    public BooleanExpression(Boolean booleanValue) {
        this.booleanValue = booleanValue;
    }

    @Override
    public Boolean interpret(Context context) {
        if(context.isReverse() == ContextType.REVERSE) {
            return !booleanValue;
        }
        return booleanValue;
    }

}
