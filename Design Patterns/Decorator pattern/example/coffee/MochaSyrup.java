public class MochaSyrup extends CodimentDecorator{

    public MochaSyrup(Coffee coffee) {
        super(coffee);
        this.name += " Adding Mocha Syrup";
    }
    
}
