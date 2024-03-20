class PlusPlusExpression implements Expression{
    private Expression operand;

    public PlusPlusExpression(Expression operand) {
        this.operand = operand;
    }

    @Override
    public int interpret(Context context) {
        
        return operand.interpret(context) + 1;
    }
}


