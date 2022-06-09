package state.practice.computadora;

public class Apagado implements IStateCompu {

    @Override
    public void resourceManager(Computadora computadora) throws InterruptedException {
        System.out.println("INFO> Estado Apagado: ");
        computadora.getProgramasAbiertos().setCantidad("0");
        computadora.getMemoria().setCapacidad(0);
        computadora.getCpu().setCapacidad(0);
        computadora.getProgramasAbiertos().showInfo();
        computadora.getMemoria().showInfo();
        computadora.getCpu().showInfo();
    }
}
