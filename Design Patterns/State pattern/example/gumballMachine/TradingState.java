public class TradingState implements MachineState {
    private GumballMachine machine;

    public TradingState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("검볼을 받으세요. 동전을 넣을 수 없습니다.");        
    }

    @Override
    public void ejectCoin() {
        System.out.println("검볼으로 교환되어 동전으로 반환받을 수 없습니다.");
        
    }

    @Override
    public void turnCrank() {
        System.out.println("이미 검볼이 나왔습니다. 검볼을 받으세요.");
    }

    @Override
    public void dispense() {
        machine.releaseBall();


        MachineState newState = machine.isEmpty() ? machine.soldOutState : machine.waitingCoinState;
        machine.setState(newState);        
    }
    
}
