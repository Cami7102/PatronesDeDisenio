package practicaFinal.adapter;

public class Client {
    public static void main(String []args) throws InterruptedException {
        IAplicacionesMoviles android = new Android("Androides");
        android.showInfoMov();

        IAplicacionesMoviles ios = new Android("Iosa");
        ios.showInfoMov();

        IAplicacionesMoviles winPhone = new Android("Winners");
        winPhone.showInfoMov();

        IAplicacionesWeb escri = new Escritorio("Netfaek");
        escri.showInfoWeb();
    }
}
