public class Application {
    public static void main(String[] args) {
        // Create the expression: (2 + 3) + 4
        Expression<Integer> addExpression = new AddExpression(
                new AddExpression(new NumberExpression(2), new NumberExpression(3)),
                new NumberExpression(4)
        );

        // Create the incremeant by 1 expression: 10++
        Expression<Integer> plusExpression = new PlusPlusExpression( new NumberExpression(10));

        // Create the random number expression: random.nextInt(6) -> [0,5] [0,6)
        Expression<Integer> randomExpression1 = new RandomExpression( new NumberExpression(6));
        // Create the random number expression: random.nextInt(3,6) -> [3,5] [3,6)
        Expression<Integer> randomExpression2 = new RandomExpression( new NumberExpression(3), new NumberExpression(6));
        // Create the random number expression: random.nextInt() -> [0,max]
        Expression<Integer> randomExpression3 = new RandomExpression();

        //Create the xor expression: (1 ^ 0) ^ (0 ^ 1)
        Expression<Boolean> XorExpression = new XorExpression(new XorExpression( new BooleanExpression(true), new BooleanExpression(false)),  
                                                     new XorExpression( new BooleanExpression(false), new BooleanExpression(true)));

        // Create the context, if needed        
        Context context = new Context();
        // Interpret the expression
        System.out.println("Result: " + addExpression.interpret(context)); // Output: Result: 9
        System.out.println("Increment Result: " + plusExpression.interpret(context)); // Output: Result: 11
        System.out.println("Random Result1 " + randomExpression1.interpret(context)); // [0.5]
        System.out.println("Random Result2: " + randomExpression2.interpret(context)); // [3,5]
        System.out.println("Random Result3: " + randomExpression3.interpret(context)); 
        System.out.println("XOR Result: " + XorExpression.interpret(context)); // Output: XOR Result: false

        System.out.println();

        Context reverseContext = new Context(ContextType.REVERSE);
         // Interpret the expression
         System.out.println("Result: " + addExpression.interpret(reverseContext)); // Output: Result: -9
         System.out.println("Increment Result: " + plusExpression.interpret(reverseContext)); // Output: Result: -11
         System.out.println("Random Result1 " + randomExpression1.interpret(reverseContext)); // [-6,-1]
         System.out.println("Random Result2: " + randomExpression2.interpret(reverseContext)); // [-6,-2]
         System.out.println("Random Result3: " + randomExpression3.interpret(reverseContext));
         System.out.println("XOR Result: " + XorExpression.interpret(reverseContext)); // Output: XOR Result: false

    }
}