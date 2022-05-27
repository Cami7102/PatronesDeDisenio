package practicaPrimerParcial.builder;

public class Owner {
    private BuilderRestaurante builder;

    public Restaurante getComidaLista() {
        return builder.getRestaurante();
    }

    public void setBuilder(BuilderRestaurante builder) {
        this.builder = builder;
    }

    public void prepararComida(){
        this.builder.createRestaurante();
        this.builder.buildTipoCarne();
        this.builder.buildSaborRefresco();
        this.builder.buildGuarniciones();
    }
}
