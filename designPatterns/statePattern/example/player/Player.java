package statePattern.example.player;
public class Player {
    private PlayerLevel currentLevel;

    public Player() {
        currentLevel = new BeginnerLevel(this);
    }

    public void jump() {
        currentLevel.jump();
    }
    public void turn() {
        currentLevel.turn();
    }
    public void run() {
        currentLevel.run();
    }
    public void showLevelMessage() {
        currentLevel.showLevelMessage();
    }

    public PlayerLevel getLevel() {
        return currentLevel;
    }
    public void setLevel(PlayerLevel playerLevel) {
        currentLevel = playerLevel;
    }

    public void play() {
        showLevelMessage();
        jump();
        run();
        turn();
        currentLevel.upgradeLevel();
    }
}
