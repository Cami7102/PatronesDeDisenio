package memento.practice.baseDeDatos;

public class Memento {
    private Backups state;

    public Memento(Backups backups){
        state=backups;
    }

    public Backups getState() {
        return state;
    }
}
