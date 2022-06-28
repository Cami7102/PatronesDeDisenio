package practicaFinal.bridge;

public class Client {
    public static void  main(String[] args){
        IPago ae = new AplicacionEmpresa();
        IPago tm = new TigoMoney();
        IPago tb = new TransferenciaBancaria();

        InstalacionAgua instalacionAgua = new InstalacionAgua(70);
        instalacionAgua.setPago(ae);
        instalacionAgua.instalar();

        InstalacionAlcantarillado instalacionAlcantarillado = new InstalacionAlcantarillado(30);
        instalacionAlcantarillado.setPago(tm);
        instalacionAlcantarillado.instalar();

        InstalacionElectrica instalacionElectrica = new InstalacionElectrica(70);
        instalacionAgua.setPago(tb);
        instalacionAgua.instalar();
    }
}
