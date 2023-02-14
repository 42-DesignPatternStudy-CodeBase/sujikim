package statePattern.example.gumballMachine;

public class _Main {
    public static void main(String[] args) {
        GumballMachine machine = new GumballMachine(1);

        machine.dispense(); 
    
        machine.insertCoin();
        machine.dispense(); 
        
        machine.turnCrank();
        machine.dispense(); 

        machine.dispense(); 

        /*
            [출력결과]
            아무것도 나오지 않았습니다. 먼저 동전을 넣어주세요.
            동전을 넣으셨습니다.
            아무것도 나오지 않았습니다. 손잡이를 돌려주세요.
            손잡이를 돌리셨습니다.
            검볼을 받으셨습니다!! 축하합니다!
            아무것도 나오지 않았습니다. 다음에 이용해주세요.
        */
    }
    
}
