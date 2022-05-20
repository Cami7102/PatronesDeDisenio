package singleton.practice.cambioDeMoneda;


public class CasaDeCambio {
    private String nameCasa;
    private Persona persona;

    public CasaDeCambio(Persona persona, String name){
        this.persona=persona;
        this.nameCasa=name;
    }

    public void cambiarDinero(int cantidad){
        Trabajador.getInstance().cambioDinero(cantidad);
    }
}
