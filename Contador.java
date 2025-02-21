public class contador {

    public static void main(String[] args) {
        String texto = "Hola mundo, este es un texto de prueba.";
        int contadorVocales = 0;
        int contadorConsonantes = 0;
        for (char caracter : texto.toCharArray()) {
            if (Character.isLetter(caracter)) {
                caracter = Character.toLowerCase(caracter);
                if ("aeiou".indexOf(caracter) != -1) {
                    contadorVocales++;
                } else {
                    contadorConsonantes++;
                }
            }
        }
        System.out.println("Número de vocales: " + contadorVocales);
        System.out.println("Número de consonantes: " + contadorConsonantes);
    }
}
