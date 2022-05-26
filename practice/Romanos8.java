package interpreter.practice;

public class Romanos8 extends Convierte {

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("8")){
            context.output= context.output+" VIII ";
            context.input= context.input.substring(1);
        }
    }
}
