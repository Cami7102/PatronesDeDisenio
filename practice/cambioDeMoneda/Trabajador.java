package singleton.practice.cambioDeMoneda;

public class Trabajador {
    private static Trabajador trabajador;
    private int montoIni1;
    private int montoFin1;
    private int montoIni2;
    private int montoFin2;
    private int montoIni3;
    private int montoFin3;


    private Trabajador() {
        montoIni1 = 70;
        montoFin1 = 10;
        montoIni2 = 10;
        montoFin2 = 70;
        montoIni3 = 1;
        montoFin3 = 9;
    }

    private synchronized static void multiThreadControl() {
        if (trabajador == null)
            trabajador = new Trabajador();
    }

    public static Trabajador getInstance() {
        if (trabajador == null)
            multiThreadControl();
        return trabajador;
    }

    public synchronized void cambioDinero(int cantidad) {
        if (cantidad == montoIni1) {
            System.out.println("cambiar Bolivianos: [" + montoIni1 + "] a Dolar tengo[" + montoFin1 + "$]");
        }
        if (cantidad == montoIni2) {
            System.out.println("cambiar Dolar: [" + montoIni2 + "] a Bolivianos tengo[" + montoFin2 + "bs]");
        }
        if (cantidad == montoIni3) {
            System.out.println("cambiar Euro: [" + montoIni3 + "] a Bolivianos tengo[" + montoFin3 + "bs]");
        } else {
            System.out.println("Ya no tengo para cambiar :(");
        }
    }
}
