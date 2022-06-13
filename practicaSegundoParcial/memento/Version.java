package practicaSegundoParcial.memento;

public class Version {
    private String titulo;
    private String hojas;

    public Version (String titulo,String hojas){
        this.titulo=titulo;
        this.hojas=hojas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getHojas() {
        return hojas;
    }

    public void setHojas(String hojas) {
        this.hojas = hojas;
    }

    public void showInfo() {
        System.out.println("Titulo: "+titulo);
        System.out.println("Cantidada de hojas: "+hojas);
    }
}
