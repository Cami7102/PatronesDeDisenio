package factoryMethod.practice.pasajes;

public class Avion {
    private String marca;
    private String capacidad;
    private String numeroAsientos;
    private String modelo;

    public Avion(){}

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getNumeroAsientos() {
        return numeroAsientos;
    }

    public void setNumeroAsientos(String numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
