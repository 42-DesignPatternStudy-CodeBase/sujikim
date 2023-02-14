package statePattern.example.player;

public class _Main {
    public static void main(String[] args) {
        Player player = new Player();

        player.play();
        player.play();
        player.play();
    }

    /*
        [출력 결과]
        System: 현재 레벨은 Beginner 입니다.
        Jump 할 줄 모르지롱.
        천천히 달립니다.
        Turn 할 줄 모르지롱.
        System: 축하합니다! 고수가 되셨습니다!!
        System: 현재 레벨은 Advanced Player 입니다.
        높이 jump 합니다.
        빨리 달립니다.
        Turn 할 줄 모르지롱.
        System: 축하합니다! 최대 경지에 도달하셨습니다!
        System: 현재 레벨은 Super Player 입니다.
        아주 높이 jump 합니다.
        엄청 빨리 달립니다.
        한 바퀴 돕니다.
        System: 이미 최대레벨입니다. 더이상 레벨업할 수 없습니다.
     */
}
