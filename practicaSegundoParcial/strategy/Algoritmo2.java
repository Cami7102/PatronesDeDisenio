package practicaSegundoParcial.strategy;

import java.util.List;

public class Algoritmo2 implements ITiendaC {
    @Override
    public void celular(List<Celular> venta) {
        System.out.println("Cantidad de celulares relativamente alta");
        for (Celular celular:venta) {
            int value = 100;
            if (celular.getCantidadCelulares() >= value) {
                celular.info();
            }
        }
    }
}
