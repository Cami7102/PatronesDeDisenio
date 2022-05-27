package practicaPrimerParcial.singleton;

public class Cajero {
    private String codigo;
    private String name;

    public Cajero(String codigo, String name){
        this.codigo=codigo;
        this.name=name;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
