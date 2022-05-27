package practicaPrimerParcial.factoryMethod;

public class CreatorKitEscolar extends Creator {

    @Override
    public KitEscolar createKit() {
        Mochila mochila = new Mochila();
        mochila.setNumeroBolsillos("3");
        mochila.setTamanio("Grande");
        Deportivo deportivo= new Deportivo();
        deportivo.setTalla("M");
        deportivo.setColor("Azul");
        deportivo.setNumPrendas("4");
        Cuadernos cuadernos = new Cuadernos();
        cuadernos.setTipo("Anillado");
        cuadernos.setNumHojas("300");
        KitEscolar kit = new KitEscolar(mochila, deportivo, cuadernos);
        return kit;
    }
}
