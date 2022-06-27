package decorator.practice.cuentaBanco;

public class Seguro extends CuentaBasica{

    public Seguro(ICuentaBasica cuentaBasica){
        super(cuentaBasica);
    }

    @Override
    public void showInformation(){
        System.out.println("Pagar Seguro");
        int actual = cuentaBasica.getMonto() - 100;
        cuentaBasica.setMonto(actual);
        super.showInformation();
    }
}
