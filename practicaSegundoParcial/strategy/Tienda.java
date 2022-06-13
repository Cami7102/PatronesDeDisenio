package practicaSegundoParcial.strategy;

import java.util.ArrayList;
import java.util.List;

public class Tienda {
    private String name;
    private List<Celular> celularList= new ArrayList<>();
    private ITiendaC strategyCelular;

    public Tienda(String name){
        this.name=name;
    }

    public void addCelular(Celular celular){
        celularList.add(celular);
    }

    public ITiendaC getStrategyCelular() {
        return strategyCelular;
    }

    public void setStrategyCelular(ITiendaC strategyCelular) {
        this.strategyCelular = strategyCelular;
    }

    public void iniciarVenta(){
        strategyCelular.celular(celularList);
    }
}
