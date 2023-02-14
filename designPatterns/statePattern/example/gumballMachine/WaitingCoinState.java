package statePattern.example.gumballMachine;

public class WaitingCoinState implements MachineState {

    private GumballMachine machine;

    public WaitingCoinState(GumballMachine machine) { 
        this.machine = machine;
    }
    
    @Override
    public void insertCoin() {
        System.out.println("동전을 넣으셨습니다.");
        machine.setState(machine.coinInsertedState);
    }

    @Override
    public void ejectCoin() {
        System.out.println("반환받을 동전이 없습니다. 먼저 동전을 넣어주세요.");        
    }

    @Override
    public void turnCrank() {        
        System.out.println("아무 일도 일어나지 않습니다. 먼저 동전을 넣어주세요.");

        
    }

    @Override
    public void dispense() {
        System.out.println("아무것도 나오지 않았습니다. 먼저 동전을 넣어주세요.");
    }
    
}
