package proxy.practiceBanc;

public class TarjetaDebito {
    private String nombreApoderado;
    private String numeroCuenta;
    private int monto;
    private String moneda;

    public TarjetaDebito(String nombreApoderado, String numeroCuenta, int monto, String moneda) {
        this.nombreApoderado = nombreApoderado;
        this.numeroCuenta = numeroCuenta;
        this.monto = monto;
        this.moneda = moneda;
    }

    public String getNombreApoderado() {
        return nombreApoderado;
    }

    public void setNombreApoderado(String nombreApoderado) {
        this.nombreApoderado = nombreApoderado;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public void showInfo(){
        System.out.println("Nombre del apoderado de la tarjeta: "+nombreApoderado);
        System.out.println("Numero de cuenta: "+numeroCuenta);
        System.out.println("Monto en la  cuenta: "+monto);
        System.out.println("Tipo de moneda: "+moneda);
    }
}
