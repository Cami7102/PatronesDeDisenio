package visitor.practice.librecambista;

public class Brasil implements IPais {
    private String moneda;
    private double cantidad;

    public Brasil(){}

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.cambioMoneda(this);
    }


    @Override
    public void setCambio(String moneda, double cantidad) {
        this.moneda = moneda;
        this.cantidad = cantidad;
    }

    public void showInfo(){
        System.out.println("Cambio de Moneda");
        System.out.println("moneda: "+moneda);
        System.out.println("cantidad: "+cantidad);
    }
}
