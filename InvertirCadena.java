import java.util.Scanner;

public class InvertirCadena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar la cadena al usuario
        System.out.print("Ingrese una cadena de texto: ");
        String texto = scanner.nextLine();
        
        // Invertir la cadena usando un StringBuilder
        String textoInvertido = new StringBuilder(texto).reverse().toString();

        // Mostrar la cadena invertida
        System.out.println("Cadena invertida: " + textoInvertido);
        
        scanner.close();
    }
}