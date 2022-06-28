package practicaFinal.adapter;

public class IOS implements IAplicacionesMoviles {
    private String nombre;

    public IOS(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void showInfoMov() {
        System.out.println("Nombre: " + nombre);
    }

    public void login(){
        System.out.println("***En login***");
        System.out.println("Nombre: " + nombre);
    }

    public void logout(){
        System.out.println("***En logout***");
        System.out.println("Nombre: " + nombre);
    }

    public void reportes(){
        System.out.println("***Reportes***");
        System.out.println("Nombre: " + nombre);
    }
}
