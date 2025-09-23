public class App {
    public static void main(String[] args) throws Exception {
        Historial historial = new Historial();

        historial.hacer("Escribir Hola");
        historial.hacer("Borrar palabra");
        historial.hacer("Escribir Mundo");
        historial.hacer("delete Hi");

        System.out.println("Se deshizo la acción: " + historial.deshacer());
        System.out.println("Se deshizo la acción: " + historial.deshacer());

        System.out.println("Se rehizo la acción: " + historial.rehacer());

        System.out.println("Lista de acciones: " + historial.acciones);
    }
}
