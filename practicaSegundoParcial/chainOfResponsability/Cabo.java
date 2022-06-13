package practicaSegundoParcial.chainOfResponsability;

public class Cabo implements IEjercito {
    private IEjercito next;

    @Override
    public void setNext(IEjercito ejercito) {
        next=ejercito;
    }

    @Override
    public void criterioEjercito(Ordenes ordenes) {
        if (ordenes.getLimpiezas()){
            System.out.println("Debes hacer la limpieza de todas las instalaciones");
        }else{
            next.criterioEjercito(ordenes);
        }
    }

    @Override
    public IEjercito next() {
        return next;
    }
}
