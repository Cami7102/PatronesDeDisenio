package mediator.practice;

public class Profesional extends Persona {

    public Profesional(ICanalDeComunicacion canalDeComunication) {
        super(canalDeComunication);
    }

    @Override
    public void send(String msg) {
        canalDeComunicacion.send(msg,this);
    }

    @Override
    public void received(String msg) {
        System.out.println("INFO> cargo: "+getCargo()+ " ci: "+getCi()+" name: "+getName() +" grado: "+getGrado()+" lenguaje: "
                +getLenguaje()+" certificaciones: "+getCertificaciones());

        System.out.println("INFO> received "+msg);
    }
}
