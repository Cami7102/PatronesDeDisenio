package practicaSegundoParcial.mediator;

import mediator.practice.ICanalDeComunicacion;

public abstract class Persona {
    protected ICanalComu canalComu;
    private String name;
    private String dato;

    public Persona(ICanalComu canalComu){
        this.canalComu=canalComu;
    }

    public ICanalComu getCanalComu() {
        return canalComu;
    }

    public void setCanalComu(ICanalComu canalComu) {
        this.canalComu = canalComu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public abstract void send(String msg);
    public abstract void received(String msg);
}
