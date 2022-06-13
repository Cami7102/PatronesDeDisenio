package practicaSegundoParcial.chainOfResponsability;

public class Manager implements IEjercito {

    private IEjercito next;

    @Override
    public void setNext(IEjercito ejercito) {
        next=ejercito;
    }

    @Override
    public void criterioEjercito(Ordenes ordenes) {
        General uno= new General();
        this.setNext(uno);

        Teniente dos= new Teniente();
        uno.setNext(dos);

        Coronel tres= new Coronel();
        dos.setNext(tres);

        Cabo respFinal = new Cabo();
        tres.setNext(respFinal);

        this.next.criterioEjercito(ordenes);
    }

    @Override
    public IEjercito next() {
        return next;
    }
}
