package iteratorPattern.example.bookShelf;

public class BookShelf implements Aggregate {

    private Book[] books;
    private int num = 0;

    public BookShelf(int num) {
        this.books = new Book[num];
    }

    public void appendBook(Book book) {
        this.books[num] = book;
        num++;
    }

    public Book getBook(int index) {
        return books[index];
    }

    @Override
    public Iterator createIterator() {
        return new BookShelfIterator(this);
    }

    @Override
    public Iterator createReverseIterator() {
        return new BookShelfReverseIterator(this);
    }

    @Override
    public int getLength() {
        return num;
    }
}
