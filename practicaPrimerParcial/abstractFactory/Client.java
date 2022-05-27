package practicaPrimerParcial.abstractFactory;

public class Client {
    public static void main(String []args){
        Inscripcion inscripcion= FactoryInscripcion.make("Estudiante");
        inscripcion.showInfo();
        compilar(inscripcion);
        runTest(inscripcion);
        build(inscripcion);
        createImage(inscripcion);
        createArtefacto(inscripcion);
    }

    private static void compilar(Inscripcion ideEditor) {
    }
    private static void runTest(Inscripcion ideEditor) {
    }
    private static void build(Inscripcion ideEditor) {
    }
    private static void createImage(Inscripcion ideEditor) {
    }
    private static void createArtefacto(Inscripcion ideEditor) {
    }
}
