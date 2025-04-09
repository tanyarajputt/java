import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter first number
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        // Prompt user to enter an operator
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        // Prompt user to enter second number
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Initialize the result variable
        double result;

        // Use switch statement to perform the operation
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                // Check for division by zero
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error! Division by zero.");
                }
                break;
            default:
                System.out.println("Invalid operator! Please use +, -, *, or /.");
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
