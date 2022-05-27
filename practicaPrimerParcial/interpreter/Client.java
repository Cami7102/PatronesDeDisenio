package practicaPrimerParcial.interpreter;

public class Client {
    public static void main (String[]args){
        String msg=" Como [ usuario ] ";
        practicaPrimerParcial.interpreter.Interpreter parser = new Interpreter(msg);
        System.out.println("msg interpretado: "+parser.evaluateMsg());
    }
}
