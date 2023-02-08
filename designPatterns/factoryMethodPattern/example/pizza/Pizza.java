package factoryMethodPattern.example.pizza;
// product
public abstract class Pizza {
    public abstract void prepare();

    public void makePizza() {
        this.prepare();   
    }
}