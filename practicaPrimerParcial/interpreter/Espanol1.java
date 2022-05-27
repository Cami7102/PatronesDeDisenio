package practicaPrimerParcial.interpreter;

public class Espanol1 extends Traductor {

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("Como [ usuario ]")){
            context.output= context.output+" Given [user] ";
            context.input= context.input.substring(1);
        }
    }
}
