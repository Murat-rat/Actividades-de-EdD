public class ContarChar {
    public static int contar(String palabra, char objetivo, int contador){
        if (palabra.isEmpty() || contador ==  palabra.length()) {
            return 0;
        } else if (palabra.charAt(contador) == objetivo) {
            return 1 + contar(palabra, objetivo, contador + 1);
        } else {
            return contar(palabra, objetivo, contador + 1);
        }
    }
}
