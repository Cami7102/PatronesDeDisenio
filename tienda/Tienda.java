package strategy.practice.tienda;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private String name;
    private List<Ropa> ropaList= new ArrayList<>();
    private ITienda strategyRopa;

    public Tienda(String name){
        this.name=name;
    }

    public void addRopa(Ropa ropa){
        ropaList.add(ropa);
    }

    public ITienda getStrategyRopa() {
        return strategyRopa;
    }

    public void setStrategyRopa(ITienda strategyRopa) {
        this.strategyRopa = strategyRopa;
    }

    public void iniciarVenta(){
        strategyRopa.ropa(ropaList);
    }
}
