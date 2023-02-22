package iteratorPattern.example.bookShelf;

public class BookShelfReverseIterator implements Iterator {
    
    private BookShelf bookshelf;
    private int index;

    public BookShelfReverseIterator(BookShelf bookshelf) {
        this.bookshelf = bookshelf;
        this.index = bookshelf.getLength() - 1;
    }

    @Override
    public boolean hasNext() {
        return (index >= 0);
    }

    @Override
    public Object next() {
        Book book = bookshelf.getBook(index);
        index--;
        return book;
    }
}

