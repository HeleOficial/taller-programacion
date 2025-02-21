import java.util.Scanner;

public class InvertirCadena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese una cadena de texto: ");
        String texto = scanner.nextLine();
        
        String textoInvertido = new StringBuilder(texto).reverse().toString();

        System.out.println("Cadena invertida: " + textoInvertido);
        
        scanner.close();
    }
}
