package iterator.practice;

import java.util.Vector;

public class ConcreteIterator3 implements Iterator {

    private Vector<String> nameVector;
    private int position;

    public ConcreteIterator3(Vector<String> nameVector){
        this.nameVector =nameVector;
        position=0;
    }

    @Override
    public Object next() {
        return nameVector.get(position++);
    }

    @Override
    public boolean hasNext() {
        return nameVector.size() != 0 && position < nameVector.size();
    }
}
