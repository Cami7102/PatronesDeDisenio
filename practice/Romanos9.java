package interpreter.practice;

public class Romanos9 extends Convierte {

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("1")){
            context.output= context.output+" IX ";
            context.input= context.input.substring(1);
        }
    }
}
