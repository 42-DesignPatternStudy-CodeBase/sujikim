public abstract class CodimentDecorator extends Coffee {

    private Coffee coffee;

    public CodimentDecorator(Coffee coffee) {
        super(coffee.bean);
        this.coffee = coffee;
        this.name = coffee.name;
    }
}
