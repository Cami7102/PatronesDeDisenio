package practicaFinal.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{
    private List<Component> comList = new ArrayList<>();
    int palabras = 0;

    public Composite(String tipo) {
        super(tipo);
    }

    @Override
    public void numPalabras() {
        System.out.println("COMPOSITE");

    }

    @Override
    public void add(Component component) {
        comList.add(component);
    }

    @Override
    public void remove(Component component) {
    	comList.remove(component);
    }


}
