import java.util.ArrayDeque;
import java.util.Deque;

public class Historial {
    Deque<String> acciones;
    Deque<String> rehacer;

    Historial() {
        acciones = new ArrayDeque<String>();
        rehacer = new ArrayDeque<String>();
    }

    void hacer(String accion){
        acciones.push(accion);
    }

    String deshacer(){
        rehacer.push(acciones.getFirst());
        return acciones.pollFirst();
    }

    String rehacer(){
        acciones.push(rehacer.getFirst());
        return rehacer.pollFirst();
    }
    
}