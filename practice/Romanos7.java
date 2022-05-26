package interpreter.practice;

public class Romanos7 extends Convierte {

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("7")){
            context.output= context.output+" VII ";
            context.input= context.input.substring(1);
        }
    }
}
