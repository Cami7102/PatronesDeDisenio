package practicaSegundoParcial.strategy;

import strategy.practice.tienda.Invierno;
import strategy.practice.tienda.Ropa;
import strategy.practice.tienda.Tienda;

public class Client {
    public static void main(String []args){
        strategy.practice.tienda.Tienda tienda = new Tienda("Biografia");

        tienda.addRopa(new Ropa("Parcas",400));
        tienda.addRopa(new Ropa("Shorts jean",200));
        tienda.addRopa(new Ropa("Pantalon",350));
        tienda.addRopa(new Ropa("Vestido",230));

        tienda.setStrategyRopa(new Invierno());
        tienda.iniciarVenta();
    }
}
