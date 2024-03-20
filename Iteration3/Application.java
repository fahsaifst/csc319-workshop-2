public class Application {
    public static void main(String[] args) {
        // Create the expression: (2 + 3) + 4
        Expression addExpression = new AddExpression(
                new AddExpression(new NumberExpression(2), new NumberExpression(3)),
                new NumberExpression(4)
        );

        // Create the incremeant by 1 expression: 10++
        Expression plusExpression = new PlusPlusExpression( new NumberExpression(10));

        // Create the random number expression: random.nextInt(6) -> [0,5] [0,6)
        Expression randomExpression1 = new RandomExpression( new NumberExpression(6));
        // Create the random number expression: random.nextInt(3,6) -> [3,5] [3,6)
        Expression randomExpression2 = new RandomExpression( new NumberExpression(3), new NumberExpression(6));
        // Create the random number expression: random.nextInt() -> [0,max]
        Expression randomExpression3 = new RandomExpression();

        //Create the xor expression: (1 ^ 0) ^ (0 ^ 1)
        Expression XorExpression = new XorExpression(new XorExpression( new BooleanExpression(true), new BooleanExpression(false)),  
                                                     new XorExpression( new BooleanExpression(false), new BooleanExpression(true)));

        // Create the context, if needed        
        Context context = new Context();
        // Interpret the expression
        System.out.println("Result: " + addExpression.interpret(context)); // Output: Result: 9
        System.out.println("Increment Result: " + plusExpression.interpret(context)); // Output: Result: 11
        System.out.println("Random Result1 " + randomExpression1.interpret(context));
        System.out.println("Random Result2: " + randomExpression2.interpret(context));
        System.out.println("Random Result3: " + randomExpression3.interpret(context));
        System.out.println("XOR Result: " + XorExpression.interpret(context)); // Output: XOR Result: false

    }
}