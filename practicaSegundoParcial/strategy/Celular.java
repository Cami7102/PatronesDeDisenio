package practicaSegundoParcial.strategy;

public class Celular {
    String modelo;
    String marca;
    String gama;
    String precio;
    String cantidadCelulares;

    public Celular(String modelo, String marca, String gama, String precio, String cantidadCelulares) {
        this.modelo = modelo;
        this.marca = marca;
        this.gama = gama;
        this.precio = precio;
        this.cantidadCelulares = cantidadCelulares;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getGama() {
        return gama;
    }

    public void setGama(String gama) {
        this.gama = gama;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getCantidadCelulares() {
        return cantidadCelulares;
    }

    public void setCantidadCelulares(String cantidadCelulares) {
        this.cantidadCelulares = cantidadCelulares;
    }

    public void info(){
        System.out.println("Modelo: "+modelo);
        System.out.println("Marca: "+marca);
        System.out.println("Gama: "+gama);
        System.out.println("Precio: "+precio);
    }
}
