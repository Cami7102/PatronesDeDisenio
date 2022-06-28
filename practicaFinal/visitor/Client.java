package practicaFinal.visitor;

public class Client {
    public static void main(String[] args){
        Aplicacion app = new Aplicacion();

        Celular ce = new Celular("Samsung", "1234567890");
        Computadora com = new Computadora("HP", "8GB");
        Televisor tel = new Televisor("LG Prime", "24 PULGADAS");

        app.mantCelular(ce);
        app.mantComputadora(com);
        app.mantTelevisor(tel);
    }
}
