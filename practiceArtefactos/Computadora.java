package adapter.practiceArtefactos;

public class Computadora implements IElectronico{
    private int precio;
    private int tiempoDeVida;

    public Computadora(int precio, int tiempoDeVida) {
        this.precio = precio;
        this.tiempoDeVida = tiempoDeVida;
    }

    @Override
    public void showInfo() {
        System.out.println("Precio: " + precio);
        System.out.println("Tiempo de Vida: "+ tiempoDeVida);
    }
}
