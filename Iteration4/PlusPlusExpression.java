class PlusPlusExpression implements Expression<Integer>{
    private Expression<Integer> operand;

    public PlusPlusExpression(Expression<Integer> operand) {
        this.operand = operand;
    }

    @Override
    public Integer interpret(Context context) {
        if(context.isReverse() == ContextType.REVERSE) {
            return operand.interpret(context) - 1;
        }
        return operand.interpret(context) + 1;
    }
}


