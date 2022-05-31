package iterator.practice;

import java.util.Stack;

public class ConcreteIterator4 implements Iterator {
    private int position;
    private Stack<String> nameStack;

    public ConcreteIterator4( Stack<String> nameStack){
        this.nameStack=nameStack;
    }

    @Override
    public Object next() {
        return nameStack.get(position++);
    }

    @Override
    public boolean hasNext() {
        return nameStack.size() != 0 && position < nameStack.size();
    }
}
