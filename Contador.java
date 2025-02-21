 import java.util.Scanner;
 
 public class Contador {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         
         System.out.print("Ingrese una palabra en minúsculas: ");
         String palabra = scanner.nextLine();
         
         int vocales = 0, consonantes = 0;
 
         String vocalesStr = "aeiou";
 
         for (char letra : palabra.toCharArray()) {
             if (vocalesStr.indexOf(letra) != -1) {
                 vocales++;
             } else {
                 consonantes++;
             }
         }
 
         System.out.println("Número de vocales: " + vocales);
         System.out.println("Número de consonantes: " + consonantes);
 
         scanner.close();
     }
 }
 
