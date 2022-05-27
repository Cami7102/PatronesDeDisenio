package practicaPrimerParcial.singleton;

public class Client {
    public static void main(String[] args) {
        Colegio UEE = new Colegio();
        UEE.setCajero(new Cajero("Mil323", "Milton"));

        UEE.pagar(100, new Estudiante("Carlos"));
        UEE.pagar(50, new Estudiante("Ana"));
        UEE.pagar(150, new Estudiante("Marco"));
        UEE.pagar(200, new Estudiante("Edgar"));
        UEE.pagar(100, new Estudiante("Rebeca"));
    }
}
