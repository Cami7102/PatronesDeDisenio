package practicaPrimerParcial.builder;

public class Tira extends BuilderRestaurante {

    @Override
    public void buildTipoCarne() {
        this.restaurante.setTipoCarne("Tira");
    }

    @Override
    public void buildSaborRefresco() {
        this.restaurante.setSaborRefresco("Coca-Cola");
    }

    @Override
    public void buildGuarniciones() {
        this.restaurante.setGuarniciones("Fideo");
    }
}
