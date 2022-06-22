package proxy.practiceBanc;

public class CuentaBanco implements ICuenta {
    private String nombreBanco;
    private int monto;

    public CuentaBanco(String nombreBanco, int monto) {
        this.nombreBanco = nombreBanco;
        this.monto = monto;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    @Override
    public void sacarDinero(TarjetaDebito tarjetaDebito) {
        tarjetaDebito.showInfo();
        monto = monto - tarjetaDebito.getMonto();
        System.out.println("Tu saldo es de "+monto);
    }

    public TarjetaDebito cambiarMoneda (TarjetaDebito tarjetaDebito) {
        if(tarjetaDebito.getMoneda().equals("dolar")){
            String dolar = String.valueOf(tarjetaDebito.getMonto() * 6.96);
            System.out.println("Monto: "+dolar+ " en bolivianos");
        }else {
            System.out.println("Moneda invalida");
            return new TarjetaDebito("","",0,"bolivianos");
        }
        return tarjetaDebito;
    }
}
