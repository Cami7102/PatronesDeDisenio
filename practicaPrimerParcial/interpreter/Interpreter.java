package practicaPrimerParcial.interpreter;

import java.util.ArrayList;
import java.util.List;

public class Interpreter extends Traductor{
    private List<Traductor> grammar = new ArrayList<>();
    private Context context;

    public Interpreter(String msgToInterpreter){
        context = new Context(msgToInterpreter.replace(" ",""));
        for ( String charOriginal :  msgToInterpreter.split(" ")) {
            switch (charOriginal){
                case "Como [ usuario ]":
                    grammar.add(new Espanol1());
                    break;
                case "Quiero [accciones]":
                    grammar.add(new Espanol2());
                    break;
                case "Para [valor de la story]":
                    grammar.add(new Espanol3());
                    break;
                default:
                    break;
            }
        }
    }

    public String evaluateMsg(){
        for (Traductor expression:grammar) {
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
