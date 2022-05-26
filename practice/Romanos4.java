package interpreter.practice;

public class Romanos4 extends Convierte {

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("4")){
            context.output= context.output+" IV ";
            context.input= context.input.substring(1);
        }
    }
}
