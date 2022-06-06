package chainOfResponsability.practice.algoritmos;

public class Manager implements IEdad {

    private IEdad next;

    @Override
    public void setNext(IEdad edad) {
        next=edad;
    }

    @Override
    public void criterioEdad(Persona persona) {
        Algoritmo1 uno= new Algoritmo1();
        this.setNext(uno);

        Algoritmo2 dos= new Algoritmo2();
        uno.setNext(dos);

        Algoritmo3 respFinal = new Algoritmo3();
        dos.setNext(respFinal);

        this.next.criterioEdad(persona);
    }

    @Override
    public IEdad next() {
        return next;
    }
}
