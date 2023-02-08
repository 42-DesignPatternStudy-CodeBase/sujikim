package decoratorPattern.example.coffee;

public class WhippedCream extends CodimentDecorator {

    public WhippedCream(Coffee coffee) {
        super(coffee);
        this.name += " Adding WhippedCream";
    }    
}
