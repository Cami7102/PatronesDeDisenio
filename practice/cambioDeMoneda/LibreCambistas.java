package singleton.practice.cambioDeMoneda;

public class LibreCambistas {
    private String nameCambista;
    private Persona persona;

    public LibreCambistas(Persona persona, String name){
        this.persona=persona;
        this.nameCambista=name;
    }

    public void cambiarDinero(int cantidad){
        Trabajador.getInstance().cambioDinero(cantidad);
    }
}
