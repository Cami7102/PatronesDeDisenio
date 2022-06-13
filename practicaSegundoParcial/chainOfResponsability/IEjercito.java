package practicaSegundoParcial.chainOfResponsability;

public interface IEjercito {
    void setNext(IEjercito ejercito);
    void criterioEjercito(Ordenes ordenes);
    IEjercito next();
}
