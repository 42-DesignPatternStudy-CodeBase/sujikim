package iteratorPattern.example.bookShelf;

public class BookShelfIteratorFactory extends Factory {
    public static final int NORMAL = 0;
    public static final int REVERSE = 1;

    protected Iterator createProduct(Aggregate list, int type) {
        return type == NORMAL ? list.createIterator() : list.createReverseIterator();
    }

}