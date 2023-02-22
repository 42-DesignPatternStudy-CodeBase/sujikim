package templateMethodPattern.example.car;

public abstract class Car {

  public final void run() {
    startCar();
    drive();
    if (checkHandle()) {
      handle();
    }
    stop();
    turnOff();
  }

  public abstract void drive();
  public abstract void stop();
  public abstract void handle();

  boolean checkHandle() {
    return true;
  }

  private void startCar() {
    System.out.println("시동을 켭니다.");
  }

  private void turnOff() {
    System.out.println("시동을 끕니다.");
  }
}
