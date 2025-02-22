public class Main {
    public static void main(String[] args) {
        String cadena = "Pin pom es un muñeco muy guapo y de carton";
        String cadenaInvertida = new StringBuilder(cadena).reverse().toString();
        System.out.println("Cadena original: " + cadena);
        System.out.println("Cadena invertida: " + cadenaInvertida);
    }
}
