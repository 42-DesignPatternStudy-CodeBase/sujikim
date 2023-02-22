package iteratorPattern.example.bookShelf;

public interface Aggregate {
    public Iterator createIterator();
    public Iterator createReverseIterator();
    public int getLength();
}
