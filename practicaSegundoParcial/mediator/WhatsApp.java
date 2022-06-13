package practicaSegundoParcial.mediator;

import java.util.HashMap;
import java.util.Map;

public class WhatsApp implements ICanalComu {

    Map<PersonaEspecifica, String> map = new HashMap<PersonaEspecifica, String>();

    public void putChat(PersonaEspecifica personaEspecifica) {
        map.put(personaEspecifica, personaEspecifica.getDato());
    }

    @Override
    public void send(String msg, PersonaEspecifica personaEspecifica) {
        PersonaEspecifica emisor = (PersonaEspecifica) personaEspecifica;
        for(Persona c : map.keySet()){
            if (!emisor.getName().equals(c.getName())) {
                if (emisor.getDato().equals("Me comunico con el usuario 2") && c.getDato().equals("usuario 1")){
                    c.received(msg);
                } else if (emisor.getDato().equals("Me comunico con el usuario 3") && c.getDato().equals("usuario 2")) {
                    c.received(msg);
                } else if (emisor.getDato().equals("Me comunico con el usuario 4") && c.getDato().equals("usuario 3")) {
                    c.received(msg);
                } else if (emisor.getDato().equals("Me comunico con el usuario 5") && c.getDato().equals("usuario 4")) {
                    c.received(msg);
                }  else if (emisor.getDato().equals("Me comunico con el usuario 6") && c.getDato().equals("usuario 5")) {
                    c.received(msg);
                } else if (emisor.getDato().equals("Me comunico con el usuario 7") && c.getDato().equals("usuario 6")) {
                    c.received(msg);
                } else if (emisor.getDato().equals("Me comunico con el usuario 8") && c.getDato().equals("usuario 7")) {
                    c.received(msg);
                } else if (emisor.getDato().equals("Me comunico con el usuario 9") && c.getDato().equals("usuario 8")) {
                    c.received(msg);
                } else if (emisor.getDato().equals("Me comunico con el usuario 10") && c.getDato().equals("usuario 9")) {
                    c.received(msg);
                } else if (emisor.getDato().equals("Me comunico con el usuario 1") && c.getDato().equals("usuario 10")) {
                    c.received(msg);
                }
            }
        }
    }
}
