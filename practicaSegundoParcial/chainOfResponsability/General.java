package practicaSegundoParcial.chainOfResponsability;

public class General implements IEjercito {
    private IEjercito next;

    @Override
    public void setNext(IEjercito ejercito) {
        next=ejercito;
    }

    @Override
    public void criterioEjercito(Ordenes ordenes) {
        if (ordenes.getEntrevistas()){
            System.out.println("Debo ir a una entrevista");
        }else{
            next.criterioEjercito(ordenes);
        }
    }

    @Override
    public IEjercito next() {
        return next;
    }
}
