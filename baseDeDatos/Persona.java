package memento.practice.baseDeDatos;

public class Persona {
    private String name;
    private String ci;
    private String edad;
    private Backups state;

    public void setBackupsMes(Backups state){
        this.state=state;
    }

    public Memento createBackupsMes(){
        return  new Memento(state);
    }

    public Backups getState() {
        return state;
    }

    public void setState(Backups state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public Backups restoreBackupsMes(Memento m){
        System.out.println("***** Backups por mes ****");
        this.state= m.getState();
        return this.state;
    }
}
