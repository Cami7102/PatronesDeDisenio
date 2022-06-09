package state.practice.computadora;

public class Client {
    public static void main (String[]args) throws InterruptedException {
        Computadora compu = new Computadora();
        compu.setStateCompu(new Prendido());
        compu.resourceManager();
    }
}
