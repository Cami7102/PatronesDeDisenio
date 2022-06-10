package strategy.practice.tienda;

public class Ropa {
    String tipo;
    int precio;

    public Ropa(String tipo, int precio) {
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void info(){
        System.out.println("Tipo de ropa: "+tipo);
        System.out.println("Precio de la prenda: "+precio);
    }
}
