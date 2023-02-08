package decoratorPattern.example.coffee;

public class Americano extends Coffee {

    public Americano(Bean bean) {
        super(bean);
        name = "Americano";
    }
}
