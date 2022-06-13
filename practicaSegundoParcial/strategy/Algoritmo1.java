package practicaSegundoParcial.strategy;

import java.util.List;

public class Algoritmo1 implements ITiendaC {
    @Override
    public void celular(List<Celular> venta) {
        System.out.println("Cantidad de celulares relativamente poca");
        for (Celular celular:venta) {
            int value1 = 100;
            if (celular.getCantidadCelulares().equals(value1 || < value1)) {
                celular.info();
                break;
            }
        }
    }
}
