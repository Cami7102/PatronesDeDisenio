package practicaPrimerParcial.builder;

public class Client {
    public static void main(String[] args) {
        practicaPrimerParcial.builder.Owner pedro = new Owner();
        BuilderRestaurante bife = new Bife();
        BuilderRestaurante lomo = new Lomo();
        BuilderRestaurante tira = new Tira();

        System.out.println("················BIFE··················");
        pedro.setBuilder(bife);
        pedro.prepararComida();
        Restaurante restaurante1 = pedro.getComidaLista();
        restaurante1.showInfo();

        System.out.println("················LOMO··················");
        pedro.setBuilder(lomo);
        pedro.prepararComida();
        Restaurante restaurante2 = pedro.getComidaLista();
        restaurante2.showInfo();

        System.out.println("················TIRA··················");
        pedro.setBuilder(tira);
        pedro.prepararComida();
        Restaurante restaurante3 = pedro.getComidaLista();
        restaurante3.showInfo();
    }
}
