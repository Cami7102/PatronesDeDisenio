package practicaPrimerParcial.factoryMethod;

public class Client {
    public static void main (String []args){
        KitEscolar p1 = new CreatorKitEscolar().createKit();
        p1.showInfo();

        KitColegial p2 = new CreatorKitColegial().createKit();
        p2.showInfo();
    }
}
