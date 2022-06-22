package proxy.practiceBanc;

public class CuentaBancoP implements ICuenta {
    private CuentaBanco cuentaBanco;

    public CuentaBancoP(){
        cuentaBanco = new CuentaBanco("BNB", 1000);
    }

    @Override
    public void sacarDinero(TarjetaDebito tarjetaDebito) {
        if(tarjetaDebito.getMoneda().equals("bolivianos")){
            cuentaBanco.sacarDinero(tarjetaDebito);
        }else if(tarjetaDebito.getMonto()>cuentaBanco.getMonto()){
            System.out.println("Saldo insuficiente");
        }else {
            cuentaBanco.sacarDinero(cuentaBanco.cambiarMoneda(tarjetaDebito));
        }
    }
}
