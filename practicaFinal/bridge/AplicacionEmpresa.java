package practicaFinal.bridge;

public class AplicacionEmpresa implements IPago{
    @Override
    public void pagar(int monto) {
        System.out.println("***Pagar por Tigo Money***");
        int descuento = (int) (monto - monto * 0.10);
        System.out.println("***Precio total: " +monto);
        System.out.println("***Precio con descuento: " +descuento);
    }
}
