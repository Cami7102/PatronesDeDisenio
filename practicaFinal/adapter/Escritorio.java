package practicaFinal.adapter;

public class Escritorio implements IAplicacionesWeb{
    private String nombre;

    public Escritorio(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void showInfoWeb() {
        System.out.println("***Aplicacion Web***");
    }

    public void iniciarSesión() {
        System.out.println("***Iniciando sesion a la aplicacion web***");
        System.out.println("Nombre de la aplicacion web: " + nombre);
    }

    public void cerrarSesión() {
        System.out.println("***Cerrando sesion de la aplicacion web***");
        System.out.println("Nombre de la aplicacion web: " + nombre);
    }

    public void generandoDatos() {
        System.out.println("***Generando datos en la aplicacion web***");
        System.out.println("Nombre de la aplicacion web: " + nombre);
    }
}
