package adapter.practiceArtefactos;

public class Client {
    public static void main(String []args) throws InterruptedException {
       IElectronico cel = new Celular(3800, 10);
       cel.showInfo();

        IElectronico compu = new Computadora(7000, 10);
        compu.showInfo();

        IElectronico tab = new Tablet(4500, 10);
        tab.showInfo();

        IElectrodomesticos lav = new Lavadora(6800, 2);
        lav.showInfoElec();

        IElectrodomesticos ref = new Refrigerador(8000, 6);
        ref.showInfoElec();

        IElectrodomesticos tel = new Televisor(5400, 4);
        tel.showInfoElec();
    }
}
