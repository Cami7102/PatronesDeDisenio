package interpreter.practice;

public class Romanos3 extends Convierte {

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("3")){
            context.output= context.output+" III ";
            context.input= context.input.substring(1);
        }
    }
}
