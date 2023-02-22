package iteratorPattern.example.bookShelf;

public class BookShelfIterator implements Iterator {

    private BookShelf bookshelf;
    private int index;

    public BookShelfIterator(BookShelf bookshelf) {
        this.bookshelf = bookshelf;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return (index < bookshelf.getLength());
    }

    @Override
    public Object next() {
        Book book = bookshelf.getBook(index);
        index++;
        return book;
    }
  
}
