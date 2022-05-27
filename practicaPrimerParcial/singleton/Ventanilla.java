package practicaPrimerParcial.singleton;

public class Ventanilla {
    private static Ventanilla ventanilla;
    private Cajero cajero;
    private int monto;

    public static Ventanilla getVentanilla() {
        return ventanilla;
    }

    public static void setVentanilla(Ventanilla ventanilla) {
        Ventanilla.ventanilla = ventanilla;
    }

    public Cajero getCajero() {
        return cajero;
    }

    public void setCajero(Cajero cajero) {
        this.cajero = cajero;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    private Ventanilla(Cajero cajero) {
        this.cajero = cajero;
        this.monto = 0;
    }

    public static Ventanilla getInstance(Cajero cajero) {
        if (ventanilla == null)
            ventanilla = new Ventanilla(cajero);
        return ventanilla;
    }

    public synchronized void pagar(int cantidad, Estudiante estudiante) {
        monto = monto + cantidad;
        System.out.println("Cajero codigo: [" + this.cajero.getCodigo() + "\n Nombre: " + this.cajero.getName());
        System.out.println("Estudiante: " + estudiante.getName());
    }

    public Integer getMonto(){
        System.out.println("Monto total: " + this.monto);
        return this.monto;
    }
}
