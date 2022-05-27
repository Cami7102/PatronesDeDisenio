package practicaPrimerParcial.builder;

public class Bife extends BuilderRestaurante {

    @Override
    public void buildTipoCarne() {
        this.restaurante.setTipoCarne("Bife");
    }

    @Override
    public void buildSaborRefresco() {
        this.restaurante.setSaborRefresco("Coca-Cola");
    }

    @Override
    public void buildGuarniciones() {
        this.restaurante.setGuarniciones("PapasFritas");
    }
}
