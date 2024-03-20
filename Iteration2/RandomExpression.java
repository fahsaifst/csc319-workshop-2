import java.util.Random;

public class RandomExpression implements Expression{
    private Expression smallerValue;
    private Expression biggerValue;

    public RandomExpression(Expression smallerValue, Expression biggerValue) {
        this.smallerValue = smallerValue;
        this.biggerValue = biggerValue;
    }

    public RandomExpression(Expression biggerValue) {
        this(new NumberExpression(0), biggerValue);
    }

    public RandomExpression() {
        this(new NumberExpression(0), new NumberExpression(Integer.MAX_VALUE));
    }

    @Override
    public int interpret(Context context) {
        Random random = new Random(); 
        int operand = smallerValue.interpret(context);

        return operand + random.nextInt(biggerValue.interpret(context) - operand);

    }
}
