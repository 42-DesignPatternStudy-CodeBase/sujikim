public class Milk extends CodimentDecorator {

    public Milk(Coffee coffee) {
        super(coffee);
        this.name += " Adding Milk";
    }    
}
