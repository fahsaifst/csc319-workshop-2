class AddExpression implements Expression {
    private Expression leftExpression;
    private Expression rightExpression;
    public AddExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }
    @Override
    public Object interpret(Context context) {
        return (Integer) leftExpression.interpret(context) + (Integer) rightExpression.interpret(context);
    }
}