package practicaPrimerParcial.abstractFactory;

public class FactoryInscripcion {
    public static Inscripcion make(String type){
        Inscripcion inscripcion;
        switch (type){
            case"Matematicas":
                inscripcion = new Matematicas();
                break;
            case"Lenguaje":
                inscripcion= new Lenguaje();
                break;
            case"Historia":
                inscripcion= new Historia();
                break;
            case"Ingles":
                inscripcion= new Ingles();
                break;
            default:
                inscripcion= new Estudiante();
                break;
        }
        return inscripcion;
    }
}
