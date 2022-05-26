package interpreter.practice;

public class Romanos10 extends Convierte {

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("10")){
            context.output= context.output+" X ";
            context.input= context.input.substring(1);
        }
    }
}
