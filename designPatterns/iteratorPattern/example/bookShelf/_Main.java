package iteratorPattern.example.bookShelf;

public class _Main {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));
    
        Iterator it = bookShelf.createIterator();
        while (it.hasNext()) {
            Book book = (Book)it.next();
            System.out.println("" + book.getName());
        }
        System.out.println("=====================");
    
        Iterator rit = bookShelf.createReverseIterator();
        while (rit.hasNext()) {
            Book book = (Book)rit.next();
            System.out.println("" + book.getName());
        }
    
        System.out.println("=====================");
        BookShelfIteratorFactory bookFactory = new BookShelfIteratorFactory();
        Iterator it1 = bookFactory.create(bookShelf, BookShelfIteratorFactory.NORMAL);
        Iterator it2 = bookFactory.create(bookShelf, BookShelfIteratorFactory.REVERSE);
    
        while (it1.hasNext()) {
            Book book = (Book)it1.next();
            System.out.println("" + book.getName());
        }
    
        System.out.println("=====================");
    
        while (it2.hasNext()) {
            Book book = (Book)it2.next();
            System.out.println("" + book.getName());
        }
    }
}
