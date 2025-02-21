public class InvertiCadena {
    public static void main(String[] args) {
        String cadena = "Hola Mundo";
        String cadenaInvertida = new StringBuilder(cadena).reverse().toString();
        System.out.println("Cadena original: " + cadena);
        System.out.println("Cadena invertida: " + cadenaInvertida);
    }
}
