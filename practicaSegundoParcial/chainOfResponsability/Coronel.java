package practicaSegundoParcial.chainOfResponsability;

public class Coronel implements IEjercito {
    private IEjercito next;

    @Override
    public void setNext(IEjercito ejercito) {
        next=ejercito;
    }

    @Override
    public void criterioEjercito(Ordenes ordenes) {
        if (ordenes.getDesbloqueosManifestaciones()){
            System.out.println("Debes ir a desbloquear las calles");
        }else{
            next.criterioEjercito(ordenes);
        }
    }

    @Override
    public IEjercito next() {
        return next;
    }
}
