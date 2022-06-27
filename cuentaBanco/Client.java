package decorator.practice.cuentaBanco;

public class Client {
    public static void main(String[] args){
        ICuentaBasica cuentaBasica = new CuentaBancoBasica("Mateo", 700, true);
        cuentaBasica.showInformation();

        cuentaBasica = new BancaInternet(cuentaBasica);
        cuentaBasica = new Promocion(cuentaBasica);
        cuentaBasica = new Seguro(cuentaBasica);

        cuentaBasica.showInformation();
    }
}
