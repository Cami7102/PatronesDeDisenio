package practicaPrimerParcial.factoryMethod;

public class KitEscolar implements IKitUtiles{

    private Mochila mochila;
    private Deportivo deportivo;
    private Cuadernos cuadernos;

    public KitEscolar(Mochila mochila, Deportivo deportivo, Cuadernos cuadernos) {
        this.mochila = mochila;
        this.deportivo = deportivo;
        this.cuadernos = cuadernos;
    }

    @Override
    public void showInfo() {
        System.out.println("******************KIT ESCOLAR***********************");
        System.out.println("Mochila -> Numero de bolsillos: " + mochila.getNumeroBolsillos());
        System.out.println("Mochila -> Tamanio: " + mochila.getTamanio());
        System.out.println("Deportivo -> Talla: " + deportivo.getTalla());
        System.out.println("Deportivo -> Color: " + deportivo.getColor());
        System.out.println("Deportivo -> Numero de prendas: " + deportivo.getNumPrendas());
        System.out.println("Cuaderno -> Tipo: " + cuadernos.getTipo());
        System.out.println("Cuaderno -> Numero de hojas: " + cuadernos.getNumHojas());
    }
}
