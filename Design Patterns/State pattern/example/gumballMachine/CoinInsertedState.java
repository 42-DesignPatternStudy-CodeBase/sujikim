public class CoinInsertedState implements MachineState {
    private GumballMachine machine;

    public CoinInsertedState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("이미 동전을 넣으셨습니다.");
    }

    @Override
    public void ejectCoin() {
        System.out.println("동전이 반환됩니다.");
        machine.setState(machine.waitingCoinState);
    }

    @Override
    public void turnCrank() {
        System.out.println("손잡이를 돌리셨습니다.");
        machine.setState(machine.tradingState);
    }

    @Override
    public void dispense() {
        System.out.println("아무것도 나오지 않았습니다. 손잡이를 돌려주세요.");
    }
    
}
