public class App {
    public static void main(String[] args) throws Exception {
        String cadena = "Estrellas";
        reves(cadena.length() - 1, cadena);
    }

    static void reves(int index, String cadena) {
        if(index < 0) {
            return;
        }
        System.out.print(cadena.charAt(index));
        reves(index - 1, cadena);
    }
}
