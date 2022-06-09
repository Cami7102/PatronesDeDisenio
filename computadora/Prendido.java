package state.practice.computadora;

import java.util.Random;

public class Prendido implements IStateCompu {

    @Override
    public void resourceManager(Computadora computadora) throws InterruptedException {
        System.out.println("INFO> Estado Prendido: ");
        double currentValue=computadora.getCpu().getCapacidad();
        double progAbi = new Random().nextInt(10);
        computadora.getProgramasAbiertos().setCantidad(String.valueOf(progAbi));
        while (computadora.getCpu().getCapacidad()<100) {
            computadora.getProgramasAbiertos().showInfo();
            computadora.getMemoria().showInfo();
            computadora.getCpu().showInfo();
            Thread.sleep(3000);
            currentValue = (currentValue + (progAbi * 5 / 100));
            computadora.getCpu().setCapacidad(currentValue);
        }
        computadora.getCpu().setCapacidad(20);
    }
}
