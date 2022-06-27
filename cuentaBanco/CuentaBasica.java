package decorator.practice.cuentaBanco;

public class CuentaBasica implements ICuentaBasica{
    protected ICuentaBasica cuentaBasica;


    public CuentaBasica(ICuentaBasica cuentaBasica) {
        this.cuentaBasica = cuentaBasica;
    }

    @Override
    public void showInformation() {
        cuentaBasica.showInformation();
    }

    @Override
    public int getMonto() {
        return cuentaBasica.getMonto();
    }

    @Override
    public void setMonto(int monto) {
        cuentaBasica.setMonto(monto);
    }

    @Override
    public void setBancaInternet(boolean bancaInternet) {}
}
