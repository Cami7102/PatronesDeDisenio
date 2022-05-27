package practicaPrimerParcial.interpreter;

public class Espanol3 extends Traductor {

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("Para [valor de la story]")){
            context.output= context.output+" Then [value story] ";
            context.input= context.input.substring(1);
        }
    }
}
