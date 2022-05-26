package interpreter.practice;

public class Romanos2 extends Convierte {

    @Override
    public void interpreter(Context context) {
        if (context.input.startsWith("2")){
            context.output= context.output+" II ";
            context.input= context.input.substring(1);
        }
    }
}
