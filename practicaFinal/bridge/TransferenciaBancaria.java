package practicaFinal.bridge;

public class TransferenciaBancaria implements IPago{

    @Override
    public void pagar(int monto) {
        System.out.println("***Pagar por Tigo Money***");
        int descuento = (int) (monto - monto * 0.05);
        System.out.println("***Precio total: " +monto);
        System.out.println("***Precio con descuento: " +descuento);
    }
}
