package chainOfResponsability.practice.algoritmos;

public class Algoritmo1 implements IEdad {
    private IEdad next;
    private int[] Personita = new int[20];

    @Override
    public void setNext(IEdad edad) {
        next=edad;
    }
/*
    public Algoritmo1 addPersona(Persona persona) {
        Personita.add(persona);
        return this;
    }
*/
    @Override
    public void criterioEdad(Persona persona) {
        if(persona.getEdad()>=Personita.length && persona.getEdad()<=Personita.length){
            System.out.println("***********Algoritmo indicado!************");
            System.out.println(Personita);
            //System.out.println("Nombre: " + persona.getNombre()+ "CI: " + persona.getCi() + "Edad: " + persona.getEdad());
        }else{
            next.criterioEdad(persona);
        }
    }

    @Override
    public IEdad next() {
        return next;
    }
}
