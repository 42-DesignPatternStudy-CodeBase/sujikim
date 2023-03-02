## 주어진 과제

List는 선형 자료의 추상적인 개념으로 List 하위에 Stack과 Queue라는 개념이 있습니다.
List의 구현은 배열, 연결리스트 모두 가능한 점을 참고해서 브릿지 패턴을 완성하세요

```java
public class List<T>{

    AbstractList<T> impl;

    public List(AbstractList<T> list) {
        impl = list;
    }
    public  void add(T obj) {
        impl.addElement(obj);
    }
    public  T get(int i) {
        return impl.getElement(i);
    }
    public  T remove(int i) {
        return impl.deleteElement(i);
    }
    public  int getSize() {
        return impl.getElementSize();
    }
}

public class Queue<T> extends List<T> {
    public Queue(AbstractList<T> list) {
        super(list);
        System.out.println("Queue를 구현합니다.");
    }
    public void enQueue(T obj) {
        impl.addElement(obj);
    }
    public T deQueue() {
        return impl.deleteElement(0);
    }
}

public interface AbstractList<T> {
    public void addElement(T obj);
    public T deleteElement(int i);
    public int insertElement(T obj, int i);
    public T getElement(int i);
    public int getElementSize();
}

public class BridgeTest {

    public static void main(String[] args) {
        Queue<String> arrayQueue = new Queue<String>(new ArrayImpl<String>());
        arrayQueue.enQueue("aaa");
        arrayQueue.enQueue("bbb");
        arrayQueue.enQueue("ccc");
        System.out.println(arrayQueue.deQueue());
        System.out.println(arrayQueue.deQueue());
        System.out.println(arrayQueue.deQueue());
        System.out.println("=========================");
        Queue<String> linkedQueue = new Queue<String>(new LinkedListImpl<String>());
        linkedQueue.enQueue("aaa");
        linkedQueue.enQueue("bbb");
        linkedQueue.enQueue("ccc");
        System.out.println(linkedQueue.deQueue());
        System.out.println(linkedQueue.deQueue());
        System.out.println(linkedQueue.deQueue());
        System.out.println("=========================");
        Stack<String> arrayStack = new Stack<String>(new ArrayImpl<String>());
        arrayStack.push("aaa");
        arrayStack.push("bbb");
        arrayStack.push("ccc");
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println(arrayStack.pop());
        System.out.println("=========================");
        Stack<String> linkedStack = new Stack<String>(new LinkedListImpl<String>());
        linkedStack.push("aaa");
        linkedStack.push("bbb");
        linkedStack.push("ccc");
        System.out.println(linkedStack.pop());
        System.out.println(linkedStack.pop());
        System.out.println(linkedStack.pop());
        System.out.println("=========================");
    }
}
```

## 과제 해결
- 브릿지 패턴이 이미 주어진 코드에서 잘 나와 있음
