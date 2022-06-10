package strategy.practice.tienda;

import java.util.List;

public class Verano implements ITienda{
    @Override
    public void ropa(List<Ropa> venta) {
        System.out.println("Coleccion de Verano");
        for (Ropa ropa:venta) {
            int montoRopa=ropa.getPrecio();
            int descuento = montoRopa*10/100;
            int total = montoRopa-descuento;
            ropa.setPrecio(total);
            ropa.info();
        }
    }
}
