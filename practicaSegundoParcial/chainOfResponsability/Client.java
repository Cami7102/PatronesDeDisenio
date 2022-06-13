package practicaSegundoParcial.chainOfResponsability;

public class Client {
    public static void main(String[] args) {

        Manager manager = new Manager();
        manager.criterioEjercito(new Ordenes("General", true, false, false, false));
        //manager.criterioEjercito(new Ordenes("Teniente", false, true, false, false));
        //manager.criterioEjercito(new Ordenes("Coronel", false, false, true, false));
        //manager.criterioEjercito(new Ordenes("Cabo", false, false, false, true));
    }
}
