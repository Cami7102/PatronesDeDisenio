package practicaSegundoParcial.mediator;

public class PersonaEspecifica extends Persona {

    public PersonaEspecifica(ICanalComu canalComu) {
        super(canalComu);
    }

    @Override
    public void send(String msg) {
        canalComu.send(msg,this);
    }

    @Override
    public void received(String msg) {
        System.out.println("**********USUARIO1**************");
        System.out.println("INFO> name: "+getName() +" dato: "+getDato());

        System.out.println("**********USUARIO2**************");
        System.out.println("INFO> name: "+getName() +" dato: "+getDato());

        System.out.println("**********USUARIO3**************");
        System.out.println("INFO> name: "+getName() +" dato: "+getDato());

        System.out.println("**********USUARIO4**************");
        System.out.println("INFO> name: "+getName() +" dato: "+getDato());

        System.out.println("**********USUARIO5**************");
        System.out.println("INFO> name: "+getName() +" dato: "+getDato());

        System.out.println("**********USUARIO6**************");
        System.out.println("INFO> name: "+getName() +" dato: "+getDato());

        System.out.println("**********USUARIO7**************");
        System.out.println("INFO> name: "+getName() +" dato: "+getDato());

        System.out.println("**********USUARIO8**************");
        System.out.println("INFO> name: "+getName() +" dato: "+getDato());

        System.out.println("**********USUARIO9**************");
        System.out.println("INFO> name: "+getName() +" dato: "+getDato());

        System.out.println("**********USUARIO10**************");
        System.out.println("INFO> name: "+getName() +" dato: "+getDato());

        System.out.println("Mensaje recibido "+msg);
    }
}
