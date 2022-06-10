package strategy.practice.tienda;

public class Client {
    public static void main(String []args){
        Tienda tienda = new Tienda("Biografia");

        tienda.addRopa(new Ropa("Parcas",400));
        tienda.setStrategyRopa(new Invierno());
/*
        tienda.addRopa(new Ropa("Shorts jean",200));
        tienda.setStrategyRopa(new Primavera());

        tienda.addRopa(new Ropa("Pantalon",350));
        tienda.setStrategyRopa(new Otono());

        tienda.addRopa(new Ropa("Vestido",230));
        tienda.setStrategyRopa(new Verano());
*/
        tienda.iniciarVenta();
    }
}
