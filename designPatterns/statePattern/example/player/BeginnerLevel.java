package statePattern.example.player;
public class BeginnerLevel implements PlayerLevel {

    protected Player player;

    BeginnerLevel(Player player) {
        this.player = player;
    }

    @Override
    public void jump() {
        System.out.println("Jump 할 줄 모르지롱.");
    }

    @Override
    public void run() {
        System.out.println("천천히 달립니다.");
    }

    @Override
    public void turn() {
        System.out.println("Turn 할 줄 모르지롱.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("System: 현재 레벨은 Beginner 입니다.");
    }

    @Override
    public void upgradeLevel() {
        System.out.println("System: 축하합니다! 고수가 되셨습니다!!");
        player.setLevel(new AdvancedLevel(player));
        
    }

}
