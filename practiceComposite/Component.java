package composite.practiceComposite;

public abstract class Component {
    private String venta;
    private int precio;

    public Component(String venta, int precio) {
        this.venta = venta;
        this.precio = precio;
    }

    public String getVenta() {
        return venta;
    }

    public void setVenta(String venta) {
        this.venta = venta;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void showInfo(){
        System.out.println("Tipo de venta: "+ venta);
        System.out.println("Precio: ");
    }


}

