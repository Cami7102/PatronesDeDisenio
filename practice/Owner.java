package builder.practice;

public class Owner {
    private BuilderPizza builder;

    public Pizza getPizzaLista() {
        return builder.getServicio();
    }

    public void setBuilder(BuilderPizza builder) {
        this.builder = builder;
    }

    public void prepararPizza(){
        this.builder.createPizza();
        this.builder.buildIngredientes();
        this.builder.buildTipoMasa();
        this.builder.buildTipoQueso();
    }
}
