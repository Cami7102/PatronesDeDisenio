package iterator.practice;

import java.util.Vector;

public class ConcreteImportadora3 implements Importadora {
    // logica de algun objeto que almacene objetos
    private Vector<String> nameList;

    public ConcreteImportadora3(){
        nameList= new Vector<>();
    }

    public void add (String value){
        nameList.add(value);
    }

    @Override
    public ConcreteIterator3 createIterator() {
        return new ConcreteIterator3(nameList);
    }
}
