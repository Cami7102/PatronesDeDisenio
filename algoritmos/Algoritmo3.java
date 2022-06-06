package chainOfResponsability.practice.algoritmos;

import mediator.example.Profesional;
import mediator.example.Slack;

import java.net.PortUnreachableException;
import java.util.Arrays;

public class Algoritmo3 implements IEdad {
    private IEdad next;

    int[] Personita = new int[100];

    @Override
    public void setNext(IEdad edad) {
        next=edad;
    }
/*
    public Algoritmo3 addPersona(Persona persona) {
        Personita.add(persona);
        return this;
    }
*/
    @Override
    public void criterioEdad(Persona persona) {
            if (persona.getEdad() == Personita.length) {
                next.criterioEdad(persona);
            } else {
                System.out.println("***********Algoritmo indicado!************");
                System.out.println(Personita);
                //System.out.println("Nombre: " + persona.getNombre()+ "CI: " + persona.getCi() + "Edad: " + persona.getEdad());
            }
    }


    @Override
    public IEdad next() {
        return next;
    }
}
