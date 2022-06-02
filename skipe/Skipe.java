package mediator.practice;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class Skipe implements ICanalDeComunicacion {

    Map<String, Profesional> profesionalChat = new Map<>() {

        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean containsKey(Object key) {
            return false;
        }

        @Override
        public boolean containsValue(Object value) {
            return false;
        }

        @Override
        public Profesional get(Object key) {
            return null;
        }

        @Override
        public Profesional put(String key, Profesional value) {
            return null;
        }

        @Override
        public Profesional remove(Object key) {
            return null;
        }

        @Override
        public void putAll(Map<? extends String, ? extends Profesional> m) {

        }

        @Override
        public void clear() {

        }

        @Override
        public Set<String> keySet() {
            return null;
        }

        @Override
        public Collection<Profesional> values() {
            return null;
        }

        @Override
        public Set<Entry<String, Profesional>> entrySet() {
            return null;
        }
    };
    
     public Skipe putProfesionalChat(Profesional profesional) {   
            profesionalChat.put("yuju", profesional);
        return this;
     }    
     
     @Override
        public void send(String msg, Persona persona) {
         Profesional emisor = (Profesional) persona;
         Persona profesional = null;
         if (!emisor.getCi().equals(profesional.getCi())) {
             if (emisor.getCargo().equals("QA") && profesional.getCargo().equals("QA") && profesional.getGrado().equals("QA")) {
                 profesional.received(msg);
             } else if (emisor.getCargo().equals("DEV") && profesional.getCargo().equals("DEV") && profesional.getLenguaje().equals("DEV")) {
                 profesional.received(msg);
             } else if (emisor.getCargo().equals("SM") && profesional.getCargo().equals("SM") && profesional.getCertificaciones().equals("SM")) {
                 profesional.received(msg);
             }
         }
     }
}