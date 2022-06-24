package composite.practiceComposite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component{
    private List<Component> com = new ArrayList<Component>();

    public Composite(String venta, int precio) {
        super(venta, precio);
    }

    @Override
    public void showInfo() {
        super.showInfo();
    }

    public void add (Component ca){
        com.add(ca);
    }

    public void remove (Component cr){
        com.remove(cr);
    }
}
