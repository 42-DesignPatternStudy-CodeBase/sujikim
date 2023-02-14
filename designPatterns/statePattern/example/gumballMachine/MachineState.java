package statePattern.example.gumballMachine;

public interface MachineState {
    public void insertCoin();
    public void ejectCoin();
    public void turnCrank();
    public void dispense();
}
