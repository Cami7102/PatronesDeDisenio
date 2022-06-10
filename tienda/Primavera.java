package strategy.practice.tienda;

import java.util.List;

public class Primavera implements ITienda {
        @Override
        public void ropa(List<Ropa> venta) {
            System.out.println("Coleccion de Primavera");
            for (Ropa ropa:venta) {
                ropa.info();
            }
        }
}
