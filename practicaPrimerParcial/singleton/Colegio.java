package practicaPrimerParcial.singleton;

public class Colegio {
    private String name;
    private Cajero cajero;

    public Colegio(){
        this.cajero = new Cajero("", "");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cajero getCajero() {
        return cajero;
    }

    public void setCajero(Cajero cajero) {
        this.cajero = cajero;
    }

    public void pagar(int cantidad, Estudiante estudiante){
        Ventanilla.getInstance(this.cajero).pagar(cantidad, estudiante);
    }
}
