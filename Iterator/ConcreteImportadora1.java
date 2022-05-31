package iterator.practice;

import java.util.ArrayList;

public class ConcreteImportadora1 implements Importadora {
    // logica de algun objeto que almacene objetos
    private ArrayList nameArray;

    public ConcreteImportadora1(){
        nameArray= new ArrayList();
    }

    public void add (String value){
        nameArray.add(value);
    }

    @Override
    public ConcreteIterator1 createIterator() {
        return new ConcreteIterator1(nameArray);
    }
}
