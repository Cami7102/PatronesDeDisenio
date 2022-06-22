package proxy.practiceBanc;

public class Client {
    public static void main(String[] args) {

        ICuenta cuentaB = new CuentaBancoP();

        TarjetaDebito uno= new TarjetaDebito("Edgar","123456789", 700, "bolivianos");

        TarjetaDebito dos= new TarjetaDebito("Edgar","123456789", 300, "dolar");

        TarjetaDebito tres= new TarjetaDebito("Edgar","123456789", 100, "soles");

        cuentaB.sacarDinero(uno);
        cuentaB.sacarDinero(dos);
        cuentaB.sacarDinero(tres);
    }
}
