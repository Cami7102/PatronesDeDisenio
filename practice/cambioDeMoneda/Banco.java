package singleton.practice.cambioDeMoneda;


public class Banco {
    private String name;
    private Persona persona;

    public Banco(Persona persona, String name){
        this.persona=persona;
        this.name=name;
    }

    public void cambiarDinero(int cantidad){
        Trabajador.getInstance().cambioDinero(cantidad);
    }
}
