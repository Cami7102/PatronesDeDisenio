package decorator.practice.cuentaBanco;

public class CuentaBancoBasica implements ICuentaBasica {

    private String nombrePropietario;
    private int monto;
    private boolean bancaInternet;

    public CuentaBancoBasica(String nombrePropietario, int monto, boolean bancaInternet) {
        this.nombrePropietario = nombrePropietario;
        this.monto = monto;
        this.bancaInternet = bancaInternet;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    @Override
    public void setBancaInternet(boolean bancaInternet) {
    }

    @Override
    public void showInformation() {
        System.out.println("***CUENTA DE BANCO BASICA***");
        System.out.println("Nombre del propietario: "+nombrePropietario);
        System.out.println("Monto: "+monto);
        System.out.println("Banca por Internet: "+bancaInternet);
    }
}
