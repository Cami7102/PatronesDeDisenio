package composite.practiceComposite;

public class Computadora extends Component{

    public Computadora(String venta, int precio){
        super(venta, precio);
    }

    @Override
    public void showInfo() {
        super.showInfo();
    }

    public void add (Component ca) { }

    public void remove (Component cr) { }
}
