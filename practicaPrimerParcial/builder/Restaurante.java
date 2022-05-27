package practicaPrimerParcial.builder;

public class Restaurante {
    private String tipoCarne;
    private String saborRefresco;
    private String guarniciones;

    public Restaurante(){}

    public String getTipoCarne() {
        return tipoCarne;
    }

    public void setTipoCarne(String tipoCarne) {
        this.tipoCarne = tipoCarne;
    }

    public String getSaborRefresco() {
        return saborRefresco;
    }

    public void setSaborRefresco(String saborRefresco) {
        this.saborRefresco = saborRefresco;
    }

    public String getGuarniciones() {
        return guarniciones;
    }

    public void setGuarniciones(String guarniciones) {
        this.guarniciones = guarniciones;
    }

    public void showInfo() {
        System.out.println("Tipo de carne: "+tipoCarne);
        System.out.println("Sabor del refresco: "+saborRefresco);
        System.out.println("Guarniciones: "+guarniciones);
    }
}
