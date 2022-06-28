package practicaFinal.proxy;

public class Usuario {
    private String nombre;
    private int numero;

    public Usuario(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void showInfo(){
        System.out.println("**Informacion**");
        System.out.println("Username: " + nombre);
        System.out.println("User number: " + numero);
    }
}
