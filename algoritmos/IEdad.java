package chainOfResponsability.practice.algoritmos;

public interface IEdad {
    void setNext(IEdad edad);
    void criterioEdad(Persona persona);
    IEdad next();
}
