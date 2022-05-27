package practicaPrimerParcial.builder;

import builder.practice.Pizza;

public abstract class BuilderRestaurante {
    protected Restaurante restaurante;

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void createRestaurante() {
        this.restaurante = new Restaurante();
    }

    public abstract void buildTipoCarne();
    public abstract void buildSaborRefresco();
    public abstract void buildGuarniciones();

}
