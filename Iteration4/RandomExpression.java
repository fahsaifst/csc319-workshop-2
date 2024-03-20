import java.util.Random;

public class RandomExpression implements Expression<Integer>{
    private Expression<Integer> smallerValue;
    private Expression<Integer> biggerValue;

    public RandomExpression(Expression<Integer> smallerValue, Expression<Integer> biggerValue) {
        this.smallerValue = smallerValue;
        this.biggerValue = biggerValue;
    }

    public RandomExpression(Expression<Integer> biggerValue) {
        this(new NumberExpression(0), biggerValue);
    }

    public RandomExpression() {
        this(new NumberExpression(0), new NumberExpression(Integer.MAX_VALUE));
    }

    @Override
    public Integer interpret(Context context) {
        Random random = new Random(); 
        int leftValue = smallerValue.interpret(context);
        int rightValue = biggerValue.interpret(context);
        int minValue = Math.min(leftValue, rightValue);
        int maxValue = Math.max(leftValue, rightValue);

        return (minValue + random.nextInt(maxValue - minValue));

    }
}
