public class SimpleCalculator {
    public static void main(String[] args) {
        int num1 = 10, num2 = 5; // Example input
        char operator = '+'; // Example operator

        switch (operator) {
            case '+': System.out.println("Sum: " + (num1 + num2)); break;
            case '-': System.out.println("Difference: " + (num1 - num2)); break;
            case '*': System.out.println("Product: " + (num1 * num2)); break;
            case '/': System.out.println("Quotient: " + (num1 / num2)); break;
            default: System.out.println("Invalid operator");
        }
    }
}
