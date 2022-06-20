package adapter.practiceArtefactos;

public class Televisor implements IElectrodomesticos{
    private int precio;
    private int tiempoDeGarantia;

    public Televisor(int precio, int tiempoDeGarantia) {
        this.precio = precio;
        this.tiempoDeGarantia = tiempoDeGarantia;
    }

    @Override
    public void showInfoElec() {
        System.out.println("Precio: " + precio);
        System.out.println("Tiempo de Garantia: " + tiempoDeGarantia);
    }
}
