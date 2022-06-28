package practicaFinal.bridge;

public class InstalacionAgua implements IEmpresa{
    private IPago pago;
    private int precio;

    public InstalacionAgua(int precio) {
        //this.pago = pago;
        this.precio = precio;
    }

    public IPago getPago() {
        return pago;
    }

    public void setPago(IPago pago) {
        this.pago = pago;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public void instalar() {
        System.out.println("Instalacion de agua completo");
        pago.pagar(precio);
    }
}
