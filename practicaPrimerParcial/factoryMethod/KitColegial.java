package practicaPrimerParcial.factoryMethod;

public class KitColegial implements IKitUtiles{

    private Mochila mochila;
    private Libros libros;
    private Computadora computadora;

    public KitColegial(Mochila mochila, Libros libros, Computadora computadora) {
        this.mochila = mochila;
        this.libros = libros;
        this.computadora = computadora;
    }

    @Override
    public void showInfo() {
        System.out.println("******************KIT COLEGIAL***********************");
        System.out.println("Mochila -> Numero de bolsillos: " + mochila.getNumeroBolsillos());
        System.out.println("Mochila -> Tamanio: " + mochila.getTamanio());
        System.out.println("Libros -> Tipo: " + libros.getTipo());
        System.out.println("Libros -> Autor: " + libros.getAutor());
        System.out.println("Computadora -> Marca: " + computadora.getMarca());
        System.out.println("Computadora -> OS: " + computadora.getOs());
    }
}
