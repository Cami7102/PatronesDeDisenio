package decorator.practice.cuentaBanco;

import java.util.Random;

public class Promocion extends CuentaBasica{

    public Promocion(ICuentaBasica cuentaBasica) {
        super(cuentaBasica);
    }

    @Override
    public void showInformation(){
        int numRandom = new Random().nextInt();
        if(numRandom % 2 == 0){
            System.out.println("Promociones para ti!!");
            int actual = 2 * cuentaBasica.getMonto();
            cuentaBasica.setMonto(actual);
            super.showInformation();
        }else{
            super.showInformation();
        }
    }
}
