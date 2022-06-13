package practicaSegundoParcial.chainOfResponsability;

public class Teniente implements IEjercito {
    private IEjercito next;

    @Override
    public void setNext(IEjercito ejercito) {
        next=ejercito;
    }

    @Override
    public void criterioEjercito(Ordenes ordenes) {
        if (ordenes.getDisciplina()){
            System.out.println("Debes controlar la disciplina en las instalaciones");
        }else{
            next.criterioEjercito(ordenes);
        }
    }

    @Override
    public IEjercito next() {
        return next;
    }
}
