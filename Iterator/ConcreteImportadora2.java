package iterator.practice;

public class ConcreteImportadora2 implements Importadora {
    // logica de algun objeto que almacene objetos
    private int position;
    private String [] nameList;

    public ConcreteImportadora2(){
        nameList= new String[5];
    }

    public void add (String value){
        nameList[position]=value;
        position++;
    }

    @Override
    public ConcreteIterator2 createIterator() {
        return new ConcreteIterator2(nameList);
    }
}
