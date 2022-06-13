package practicaSegundoParcial.mediator;

public class Client {
    public static void main (String []args){
        WhatsApp whatsApp= new WhatsApp();

        PersonaEspecifica p1 = new PersonaEspecifica(whatsApp);
        p1.setName("Carlos");
        p1.setDato("1");

        PersonaEspecifica p2 = new PersonaEspecifica(whatsApp);
        p2.setName("Carlos");
        p2.setDato("2");

        PersonaEspecifica p3 = new PersonaEspecifica(whatsApp);
        p3.setName("Carlos");
        p3.setDato("3");

        PersonaEspecifica p4 = new PersonaEspecifica(whatsApp);
        p4.setName("Carlos");
        p4.setDato("4");

        PersonaEspecifica p5 = new PersonaEspecifica(whatsApp);
        p5.setName("Carlos");
        p5.setDato("5");

        PersonaEspecifica p6 = new PersonaEspecifica(whatsApp);
        p6.setName("Carlos");
        p6.setDato("6");

        PersonaEspecifica p7 = new PersonaEspecifica(whatsApp);
        p7.setName("Carlos");
        p7.setDato("7");

        PersonaEspecifica p8 = new PersonaEspecifica(whatsApp);
        p8.setName("Carlos");
        p8.setDato("8");

        PersonaEspecifica p9 = new PersonaEspecifica(whatsApp);
        p9.setName("Carlos");
        p9.setDato("9");

        PersonaEspecifica p10 = new PersonaEspecifica(whatsApp);
        p10.setName("Carlos");
        p10.setDato("10");

        whatsApp.putChat(p1);
        whatsApp.putChat(p2);
        whatsApp.putChat(p3);
        whatsApp.putChat(p4);
        whatsApp.putChat(p5);
        whatsApp.putChat(p6);
        whatsApp.putChat(p7);
        whatsApp.putChat(p8);
        whatsApp.putChat(p9);
        whatsApp.putChat(p10);

        p1.send("Persona 1");
        p2.send("Persona 2");
        p3.send("Persona 3");
        p4.send("Persona 4");
        p5.send("Persona 5");
        p6.send("Persona 6");
        p7.send("Persona 7");
        p8.send("Persona 8");
        p9.send("Persona 9");
        p10.send("Persona 10");
    }
}
