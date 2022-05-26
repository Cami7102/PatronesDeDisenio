package interpreter.practice;

public class Romanos1 extends Convierte {

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("1")){
            context.output= context.output+" I ";
            context.input= context.input.substring(1);
        }
    }
}
