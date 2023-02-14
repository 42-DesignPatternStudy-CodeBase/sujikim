## 과제 
다음 코드를 참고하여 상태에 따른 객체의 변화를 구현하세요.

``` java
public class Player {
    public static final int BEGINNER_LEVEL = 1;
    public static final int ADVANCED_LEVEL = 2;
    public static final int SUPER_LEVEL = 3;
    int level;

    public Player() {
        level = BEGINNER_LEVEL; 
    }
    public void jump() {
        if(level == BEGINNER_LEVEL) {
            System.out.println("Jump 할 줄 모르지롱."); 
        }
        else if(level == ADVANCED_LEVEL) {
            System.out.println("높이 jump 합니다."); 
        }
        else if(level == SUPER_LEVEL) {
            System.out.println("아주 높이 jump 합니다."); 
        }
    }
    public void run() {
        if (level == BEGINNER_LEVEL) {
            System.out.println("천천히 달립니다.");
        }
        else if (level == ADVANCED_LEVEL) {
            System.out.println("빨리 달립니다."); 
        }
        else if(level == SUPER_LEVEL) {
            System.out.println("엄청 빨리 달립니다.");
        }
    }
    public void turn() {
        if(level == BEGINNER_LEVEL) {
            System.out.println("Turn 할 줄 모르지롱.");
        }
        else if(level == ADVANCED_LEVEL) {
            System.out.println("Turn 할 줄 모르지롱.");
        }
        else if(level == SUPER_LEVEL) {
            System.out.println("한 바퀴 돕니다.");
        }
    }
    public void play(int time) {
        run();
        for(int i =0; i<time; i++) {
            jump(); 
        }
        turn(); 
    }
    public void upgradeLevel(int level) {
        this.level = level;
    }
}

```

## 과제 해결
![Player 클래스 다이어그램](https://github.com/notusing11/java_design_pattern_study/blob/main/Design%20Patterns/statePattern/example/Player.jpg?raw=true)

- 스스로 상태가 변경되는 Player로 리팩토링함
- 똑같이 play 함수를 호출하지만 상태에 따라 다르게 동작하는 부분을 강조

### 과제에서 중점적으로 고민했던 부분
**상태변화를 진행하는 위치**
- 클라이언트가 레벨단계까지 알아야 할 필요가 없음
- Beginner에서 Super로 바로 레벨업하거나 Super에서 Beginner로 레벨업하는 등의 시도를 막을 수 없음

-> 특정 레벨에서 바로 다음 레벨을 명시하는 쪽으로 구현