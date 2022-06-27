package decorator.practice.cuentaBanco;

public interface ICuentaBasica {
    void showInformation();
    void setMonto(int monto);
    int getMonto();
    void setBancaInternet(boolean bancaInternet);
}
