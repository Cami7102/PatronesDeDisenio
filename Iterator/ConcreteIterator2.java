package iterator.practice;

public class ConcreteIterator2 implements Iterator {
    private int position;
    private String [] nameList;

    public ConcreteIterator2( String [] nameList){
        this.nameList=nameList;
    }

    @Override
    public Object next() {
        return nameList[position++];
    }

    @Override
    public boolean hasNext() {
        return nameList.length != 0 && position < nameList.length;
    }
}
