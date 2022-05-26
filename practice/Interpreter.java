package interpreter.practice;

import java.util.ArrayList;
import java.util.List;

public class Interpreter extends Convierte{
    private List<Convierte> grammar = new ArrayList<>();
    private Context context;

    public Interpreter(String msgToInterpreter){
        context = new Context(msgToInterpreter.replace(" ",""));
        for ( String charOriginal :  msgToInterpreter.split(" ")) {
            switch (charOriginal){
                case "1":
                    grammar.add(new Romanos1());
                    break;
                case "2":
                    grammar.add(new Romanos2());
                    break;
                case "3":
                    grammar.add(new Romanos3());
                    break;
                case "4":
                    grammar.add(new Romanos4());
                    break;
                case "5":
                    grammar.add(new Romanos5());
                    break;
                case "6":
                    grammar.add(new Romanos6());
                    break;
                case "7":
                    grammar.add(new Romanos7());
                    break;
                case "8":
                    grammar.add(new Romanos8());
                    break;
                case "9":
                    grammar.add(new Romanos9());
                    break;
                case "10":
                    grammar.add(new Romanos10());
                    break;
                default:
                    break;
            }
        }
    }

    public String evaluateMsg(){
        for (Convierte expression:grammar) {
            expression.interpreter(context);
        }
        return context.output;
    }

    @Override
    public void interpreter(Context context) {
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
