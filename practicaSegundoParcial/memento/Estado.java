package practicaSegundoParcial.memento;

public class Estado {
    private Version state;

    public void setVersion(Version state){
        this.state=state;
    }

    public Memento createVersion(){
        return  new Memento(state);
    }

    public Version restoreVersion(Memento m){
        System.out.println("***** restaurando ****");
        this.state= m.getState();
        return this.state;
    }
}
