package mediator.practice;

public class Client {
    public static void main (String []args){
        Skipe skipe= new Skipe();

        Profesional sm1 = new Profesional(skipe);
        sm1.setCargo("SM").setCi("1111").setName("jose1").setGrado("dfg1");
        Profesional sm2 = new Profesional(skipe);
        sm2.setCargo("SM").setCi("1234").setName("jose2").setGrado("dfg2");
        Profesional sm3 = new Profesional(skipe);
        sm3.setCargo("SM").setCi("12345").setName("jose2").setGrado("dfg3");

        Profesional dev1 = new Profesional(skipe);
        dev1.setCargo("DEV").setCi("4444").setName("maria1").setLenguaje("eacb1");
        Profesional dev2 = new Profesional(skipe);
        dev2.setCargo("DEV").setCi("5555").setName("maria2").setLenguaje("eacb2");
        Profesional dev3 = new Profesional(skipe);
        dev3.setCargo("DEV").setCi("6666").setName("maria3").setLenguaje("eacb3");

        Profesional qa1 = new Profesional(skipe);
        qa1.setCargo("QA").setCi("888").setName("ana1").setCertificado("omnuhnj1");
        Profesional qa2 = new Profesional(skipe);
        qa2.setCargo("QA").setCi("999").setName("ana2").setCertificado("omnuhnj2");
        Profesional qa3 = new Profesional(skipe);
        qa3.setCargo("QA").setCi("987").setName("ana3").setCertificado("omnuhnj3");

        skipe.putProfesionalChat(sm1)
                .putProfesionalChat(sm2)
                .putProfesionalChat(sm3)
                .putProfesionalChat(dev1)
                .putProfesionalChat(dev2)
                .putProfesionalChat(dev3)
                .putProfesionalChat(qa1)
                .putProfesionalChat(qa2)
                .putProfesionalChat(qa3);

        sm1.send("esto es para todos");
        dev2.send("esto es para el dev1 y dev3");
        qa3.send("error encontrado, verificar qa1,qa2");
    }
}
