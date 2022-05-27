package practicaPrimerParcial.interpreter;

public class Espanol2 extends Traductor {

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("Quiero [accciones]")){
            context.output= context.output+" When [actions] ";
            context.input= context.input.substring(1);
        }
    }

}
