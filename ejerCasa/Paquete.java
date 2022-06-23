package bridge.practice.ejerCasa;

public class Paquete {
    private String nombre;
    private int precio;

    public Paquete(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void showInfo(){
        System.out.println("Nombre del paquete: "+ nombre);
        System.out.println("Precio del paquete: "+ precio);
    }
}
