package statePattern.example.player;
public class AdvancedLevel implements PlayerLevel {

    protected Player player;

    AdvancedLevel(Player player) {
        this.player = player;
    }

    @Override
    public void jump() {
        System.out.println("높이 jump 합니다."); 
    }

    @Override
    public void run() {
        System.out.println("빨리 달립니다."); 
    }

    @Override
    public void turn() {
        System.out.println("Turn 할 줄 모르지롱.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("System: 현재 레벨은 Advanced Player 입니다.");
    }

    @Override
    public void upgradeLevel() {
        System.out.println("System: 축하합니다! 최대 경지에 도달하셨습니다!");
        player.setLevel(new SuperLevel());
    }
}
