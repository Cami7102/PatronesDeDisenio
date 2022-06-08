package observer.practice.telefonia;

public class Notificaciones {
    String preciosLlamadas;
    String promociones;
    String premios;
    String noticia;

    public Notificaciones(String preciosLlamadas, String promociones, String premios, String noticia) {
        this.preciosLlamadas = preciosLlamadas;
        this.promociones = promociones;
        this.premios = premios;
        this.noticia = noticia;
    }

    public String getPreciosLlamadas() {
        return preciosLlamadas;
    }

    public void setPreciosLlamadas(String preciosLlamadas) {
        this.preciosLlamadas = preciosLlamadas;
    }

    public String getPromociones() {
        return promociones;
    }

    public void setPromociones(String promociones) {
        this.promociones = promociones;
    }

    public String getPremios() {
        return premios;
    }

    public void setPremios(String premios) {
        this.premios = premios;
    }

    public String getNoticia() {
        return noticia;
    }

    public void setNoticia(String noticia) {
        this.noticia = noticia;
    }

    public void showInfo() {
        System.out.println("*****- Informacion de las notificaciones -*****");
        System.out.println("Precio llamadas: "+preciosLlamadas);
        System.out.println("Promociones: "+promociones);
        System.out.println("Premios: "+premios);
        System.out.println("Noticia: "+noticia);
    }
}
