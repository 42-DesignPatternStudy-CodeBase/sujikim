## 주어진 과제
다음 코드를 참고해서 Iterator 인터페이스를 구현한 BookShelfIterator를 만들기

### 추가 과제
- 역순으로 순회하는 ReverseIterator 만들기
- 다양한 Iterator가 만들어 지는 Factory를 만들어 적용해보기

``` java
public interface Iterator {
  public abstract boolean hasNext();
    public abstract Object next();
}

public interface Aggregate {
   public abstract Iterator iterator();
   public int getLength();
}

public class Book {
  private String name;
  public Book(String name) {
    this.name = name;
  }
  public String getName() {
    return name;
  } 
}

public static void main(String[] args) {
  BookShelf bookShelf = new BookShelf(4);
  bookShelf.appendBook(new Book("Around the World in 80 Days"));
  bookShelf.appendBook(new Book("Bible"));
  bookShelf.appendBook(new Book("Cinderella"));
  bookShelf.appendBook(new Book("Daddy-Long-Legs"));
  Iterator it = bookShelf.iterator();
  while (it.hasNext()) {
    Book book = (Book)it.next();
    System.out.println("" + book.getName());
  }
}

public abstract class Factory {
  public final Iterator create(Aggregate list, int type) {
    Iterator p = createProduct(list, type);
    return p;
}
  protected abstract Iterator createProduct(Aggregate list, int type);
}
```

## 과제 해결
![bookShelf 클래스 다이어그램](https://github.com/notusing11/java_design_pattern_study/blob/main/Design%20Patterns/iteratorPattern/example/BookShelf.jpg?raw=true)
- 자료구조에 따라 달라질 수 있는 순회방식에 대한 내용은 구현체에서 세부 설명

### 과제에서 중점적으로 고민했던 부분
- ReverseIterator를 Interator 처럼 별도의 인터페이스로 두어야 하는지? 
    - 순회방식이 다른 클래스 일뿐 별도의 메소드를 가지지 않았음
    - Iterator를 상속한 별개의 클래스로 처리