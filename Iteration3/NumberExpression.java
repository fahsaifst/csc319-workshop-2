class NumberExpression implements Expression {
    private int number;
    public NumberExpression(int number) {
        this.number = number;
    }
    @Override
    public Object interpret(Context context) {
        return number;
    }
}