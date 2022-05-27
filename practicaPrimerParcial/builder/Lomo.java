package practicaPrimerParcial.builder;

public class Lomo extends BuilderRestaurante {

    @Override
    public void buildTipoCarne() {
        this.restaurante.setTipoCarne("Lomo");
    }

    @Override
    public void buildSaborRefresco() {
        this.restaurante.setSaborRefresco("Pepsi");
    }

    @Override
    public void buildGuarniciones() {
        this.restaurante.setGuarniciones("Arroz");
    }
}
