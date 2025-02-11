 import java.util.Scanner;
 
 public class Contador {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         
         // Solicitar palabra al usuario
         System.out.print("Ingrese una palabra en minúsculas: ");
         String palabra = scanner.nextLine();
         
         int vocales = 0, consonantes = 0;
 
         // Definir conjunto de vocales
         String vocalesStr = "aeiou";
 
         // Recorrer la palabra letra por letra
         for (char letra : palabra.toCharArray()) {
             if (vocalesStr.indexOf(letra) != -1) {
                 vocales++;
             } else {
                 consonantes++;
             }
         }
 
         // Mostrar resultados
         System.out.println("Número de vocales: " + vocales);
         System.out.println("Número de consonantes: " + consonantes);
 
         scanner.close();
     }
 }
 