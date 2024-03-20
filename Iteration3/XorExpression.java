public class XorExpression implements Expression {
    private Expression leftExpression;
    private Expression rightExpression;

    public XorExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public Object interpret(Context context) {
        return ((Boolean) leftExpression.interpret(context)) ^ ((Boolean) rightExpression.interpret(context));
    }
}
