public class Application {
    public static void main(String[] args) {
        // Create the expression: (2 + 3) + 4
        Expression expression = new AddExpression(
                new AddExpression(new NumberExpression(2), new NumberExpression(3)),
                new NumberExpression(4)
        );
        // Create the context, if needed
        Context context = new Context();
        // Interpret the expression
        int result = expression.interpret(context);
        System.out.println("Result: " + result); // Output: Result: 9
    }
}