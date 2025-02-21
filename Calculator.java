import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        String enterNum1 = scanner.nextLine();
        System.out.print("Enter operation (+, -, *, /, %): ");
        String operation = scanner.nextLine();
        System.out.print("Enter second number: ");
        String enterNum2 = scanner.nextLine();

        try {
            float num1 = Float.parseFloat(enterNum1);
            float num2 = Float.parseFloat(enterNum2);
            float result = 0;
            
            switch (operation) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                        return;
                    }
                    break;
                case "%":
                    if (num2 != 0) {
                        result = num1 % num2;
                    } else {
                        System.out.println("Error: Modulo by zero is not allowed.");
                        return;
                    }
                    break;
                default:
                    System.out.println("Invalid operation");
                    return;
            }

            System.out.println("The answer is: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter valid numbers.");
        }

        scanner.close();
    }
}
