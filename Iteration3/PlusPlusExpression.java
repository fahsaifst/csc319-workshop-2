class PlusPlusExpression implements Expression{
    private Expression operand;

    public PlusPlusExpression(Expression operand) {
        this.operand = operand;
    }

    @Override
    public Object interpret(Context context) {
        
        return (Integer) operand.interpret(context) + 1;
    }
}


