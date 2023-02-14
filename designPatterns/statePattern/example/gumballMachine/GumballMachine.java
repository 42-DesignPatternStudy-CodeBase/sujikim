package statePattern.example.gumballMachine;

public class GumballMachine {
    public MachineState soldOutState;
    public MachineState waitingCoinState;
    public MachineState coinInsertedState;
    public MachineState tradingState;

    private MachineState state;
    private int numberGumballs;

    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldoutState(this);
        waitingCoinState = new WaitingCoinState(this);
        coinInsertedState = new CoinInsertedState(this);
        tradingState = new TradingState(this);
        this.numberGumballs = numberGumballs;

        state = numberGumballs > 0 ? waitingCoinState : soldOutState;
    }

    public void setState(MachineState state) {
        this.state = state;
    }

    public void releaseBall() {
        System.out.println("검볼을 받으셨습니다!! 축하합니다!");
        if (numberGumballs > 0) { 
            numberGumballs -= 1;
        }
    }
    
    public boolean isEmpty() {
        return numberGumballs == 0;
    }

    public void insertCoin(){
        state.insertCoin();
    }
    public void ejectCoin() {
        state.ejectCoin();
    }
    public void turnCrank() {
        state.turnCrank();
    }
    public void dispense() {
        state.dispense();
    }
}
