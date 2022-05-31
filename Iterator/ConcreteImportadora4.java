package iterator.practice;

import java.util.Stack;

public class ConcreteImportadora4 implements Importadora {
    // logica de algun objeto que almacene objetos
    private Stack<String> nameStack;

    public ConcreteImportadora4(){
        nameStack= new Stack<>();
    }

    public void add (String value){
        nameStack.add(value);
    }

    @Override
    public ConcreteIterator4 createIterator() {
        return new ConcreteIterator4(nameStack);
    }
}
