package statePattern.example.player;
public class SuperLevel implements PlayerLevel {

    @Override
    public void jump() {
        System.out.println("아주 높이 jump 합니다.");        
    }

    @Override
    public void run() {
        System.out.println("엄청 빨리 달립니다.");
    }

    @Override
    public void turn() {
        System.out.println("한 바퀴 돕니다.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("System: 현재 레벨은 Super Player 입니다.");        
    }

    @Override
    public void upgradeLevel() {
        System.out.println("System: 이미 최대레벨입니다. 더이상 레벨업할 수 없습니다.");   
    }
    
}
