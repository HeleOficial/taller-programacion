import javax.swing.JOptionPane;

public class Calculator {
    public static void main(String[] args) {
        // Solicitar los números y la operación al usuario
        String enterNum1 = JOptionPane.showInputDialog("Enter first number: ");
        String operation = JOptionPane.showInputDialog("Enter operation: \n+ \n- \n* \n/ \n%");
        String enterNum2 = JOptionPane.showInputDialog("Enter second number: ");
        
        try {
            float num1 = Float.parseFloat(enterNum1);
            float num2 = Float.parseFloat(enterNum2);
            float result = 0;
            
            // Usar switch-case para manejar las operaciones
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
                        JOptionPane.showMessageDialog(null, "Error: Division by zero is not allowed.");
                        return;
                    }
                    break;
                case "%":
                    if (num2 != 0) {
                        result = num1 % num2;
                    } else {
                        JOptionPane.showMessageDialog(null, "Error: Modulo by zero is not allowed.");
                        return;
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid operation");
                    return;
            }
            
            // Mostrar el resultado
            JOptionPane.showMessageDialog(null, "The answer is: " + result);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Please enter valid numbers.");
        }
    }
}
