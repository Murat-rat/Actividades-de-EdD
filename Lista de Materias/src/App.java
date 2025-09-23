public class App {
    public static void main(String[] args) throws Exception {
        ListaMaterias materias = new ListaMaterias();

        materias.agregar("Matemáticas");
        materias.agregar("Física");
        materias.agregar("Química");
        materias.agregar("Historia");
        materias.agregar("Programación");

        materias.imprimir();
        if (materias.contiene("Programación")) {
            System.out.println("Resultado: Materia encontrada");
        } else {
            System.out.println("Resultado: Materia no encontrada");
        }
    }
}
