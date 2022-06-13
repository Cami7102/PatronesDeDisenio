package practicaSegundoParcial.memento;

import java.util.HashMap;
import java.util.Map;

public class Tesis {
    private Map<String, Memento> versiones= new HashMap<>();

    public void createVersion(String vr, Memento m){
        versiones.put(vr,m);
    }

    public Memento getVersion(String vr){
        return versiones.get(vr);
    }
}
