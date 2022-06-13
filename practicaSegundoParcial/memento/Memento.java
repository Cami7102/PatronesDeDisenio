package practicaSegundoParcial.memento;

public class Memento {
    private Version state;

    public Memento(Version version){
        state=version;
    }

    public Version getState() {
        return state;
    }
}
