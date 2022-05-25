package builder.practice;

public class PizzaClasica {
    @Override
    public void buildIngredientes() {
        this.pizza.setIngredientes("I9Alto 45");
    }

    @Override
    public void buildTipoMasa() {
        this.pizza.setTipoMasa("I9Alto luminos");
    }

    @Override
    public void buildTipoQueso() {
        this.pizza.setTipoQueso("I9Alto gamer");
    }
}
