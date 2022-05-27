package practicaPrimerParcial.factoryMethod;

public class CreatorKitColegial extends Creator {

    @Override
    public KitColegial createKit() {
        Mochila mochila = new Mochila();
        mochila.setNumeroBolsillos("3");
        mochila.setTamanio("Grande");
        Libros libros= new Libros();
        libros.setTipo("Romantico");
        libros.setAutor("Maria Luisa");
        Computadora computadora = new Computadora();
        computadora.setMarca("Lenovo");
        computadora.setOs("Windows");
        KitColegial kit = new KitColegial(mochila, libros, computadora);
        return kit;
    }
}
