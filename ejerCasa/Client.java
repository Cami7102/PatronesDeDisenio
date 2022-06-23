package bridge.practice.ejerCasa;

public class Client {
    public static void main (String[] args){
        IEnvio mar = new Mar();
        IEnvio aire = new Aire();
        IEnvio tierra = new Tierra();

        SA uno = new SA();
        uno.setEnvio(mar);
        uno.empacar(new Paquete("Maleta", 50));
        uno.setEnvio(aire);
        uno.empacar(new Paquete("Comida", 10));
        uno.setEnvio(tierra);
        uno.empacar(new Paquete("Cajas", 30));

        SRL dos = new SRL();
        dos.setEnvio(mar);
        dos.empacar(new Paquete("Maleta", 50));
        dos.empacar(new Paquete("Comida", 10));
        dos.empacar(new Paquete("Cajas", 30));
    }
}
