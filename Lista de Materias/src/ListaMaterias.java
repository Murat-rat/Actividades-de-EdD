import java.util.ArrayList;

public class ListaMaterias {
    ArrayList<String> lista;

    ListaMaterias() {
        lista = new ArrayList<>();
    }

    void agregar(String materia) {
        lista.add(materia);
    }

    boolean contiene(String materia) {
        System.out.println("Busqueda: " + materia);
        return lista.contains(materia);
    }

    void imprimir() {
        System.out.println("Materias: " + lista);
    }
}