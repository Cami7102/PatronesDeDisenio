package interpreter.practice;

public class Client {
    public static void main (String[]args){
        String msg=" 1 5 ";
        Interpreter parser = new Interpreter(msg);
        System.out.println("msg interpretado: "+parser.evaluateMsg());
    }
}
