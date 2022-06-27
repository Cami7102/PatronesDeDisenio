package decorator.practice.cuentaBanco;

public class BancaInternet extends CuentaBasica{
    protected ICuentaBasica cuentaBasica;

    public BancaInternet(ICuentaBasica cuentaBasica) {
        super(cuentaBasica);
    }

    public void showInformation(){
        System.out.println("Banca por internet");
        super.setBancaInternet(true);
        cuentaBasica.showInformation();
    }
}
