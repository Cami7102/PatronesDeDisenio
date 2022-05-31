package iterator.practice;

import java.util.ArrayList;

public class ConcreteIterator1 implements Iterator {
    private int position;
    private ArrayList nameArray;

    public ConcreteIterator1( ArrayList nameArray){
        this.nameArray=nameArray;
    }

    @Override
    public Object next() {
        return nameArray.get(position++);
    }

    @Override
    public boolean hasNext() {
        return nameArray.size() != 0 && position < nameArray.size();
    }
}
