## 과제

다음 코드를 참고하여 상태에 반응하는 옵저버들을 구현하세요

```java
public abstract class NumberGenerator {
    private List<Observer> observers = new ArrayList<Observer>();
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }
    public void notifyObservers() {
        // ToDo
    }
    public abstract int getNumber();
    public abstract void execute();
}

public class RandomNumberGenerator extends NumberGenerator {
    private Random random = new Random();
    private int number;
    public int getNumber() {
        return number;
    }
    public void execute() {
        //ToDo
    }
}

public interface Observer {
    public abstract void update(NumberGenerator generator);
}

public class Main {
    public static void main(String[] args) {
        NumberGenerator generator = new RandomNumberGenerator();
        Observer observer1 = new DigitObserver();
        Observer observer2 = new GraphObserver();
        // ToDo
    }
}
```

## 과제 해결
![Player 클래스 다이어그램](https://github.com/notusing11/java_design_pattern_study/blob/main/designPatterns/observerPattern/example/Number.jpg?raw=true)

- 새로운 숫자가 생성되면 옵저버 리스트를 순회하면서 update() 함수를 호출
- 각 옵저버들은 새로 통지받은 숫자를 각각의 방식으로 표현하도록

### 과제에서 중점적으로 고민했던 부분

**과제 코드는 push일까 pull일까**
- push pull의 개념이 잡히지 않았을 때 최소한의 정보만 통지하는게 pull방식으로 오해했었음
- 코드리뷰 및 토론 시간때 개념을 다시 확인할 수 있었음
