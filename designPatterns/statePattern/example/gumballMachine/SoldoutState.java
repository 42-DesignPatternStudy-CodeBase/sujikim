package statePattern.example.gumballMachine;

public class SoldoutState implements MachineState {

    public SoldoutState(GumballMachine machine) { }
    
    @Override
    public void insertCoin() {
        System.out.println("품절되었습니다. 동전을 넣을 수 없습니다.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("반환받을 동전이 없습니다. 디음에 이용해주세요.");
    }

    @Override
    public void turnCrank() {
        System.out.println("품절되었습니다. 손잡이를 돌려도 아무 일도 일어나지 않습니다.");
    }

    @Override
    public void dispense() {
        System.out.println("아무것도 나오지 않았습니다. 다음에 이용해주세요.");
    }
}
