package singleton.practice.cambioDeMoneda;

public class Cliente {
    public static void main(String [] args){

        /*
        B <--- 70bs ----> 10$
        CC <--- 70bs ----> 10$
        LC <--- 70bs ----> 10$

        B <--- 70bs ----> 10$
        CC <--- 10$ ----> 70bs
        LC <--- 1E ----> 9bs
         */

        Thread hilo1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Banco banco = new Banco(new Persona("Carla"),"BNB");
                banco.cambiarDinero(70);
            }
        });


        Thread hilo2 = new Thread(new Runnable() {
            @Override
            public void run() {
                CasaDeCambio casaDeCambio = new CasaDeCambio(new Persona("Gustavo"), "Money Extrange");
                casaDeCambio.cambiarDinero(10);
            }
        });

        Thread hilo3 = new Thread(new Runnable() {
            @Override
            public void run() {
                LibreCambistas libreCambistas = new LibreCambistas(new Persona("Johara"), "Camacho");
                libreCambistas.cambiarDinero(1);
            }
        });

        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}
