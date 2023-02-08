package decoratorPattern.example.coffee;

public class _Main {
    public static void main(String[] args) {
        Bean kenya = new Bean("Kenya");
        Bean etiopia = new Bean("Etiopia");

        Americano order1 = new Americano(kenya);
        System.out.println(order1.getName());

        Americano order2 = new Milk(order1);
        System.out.println(order2.getName());

        Americano order3 = new MochaSyrup(order2);
        System.out.println(order3.getName());
        
        Americano order4 = new Americano(etiopia);
        order4 = new Milk(order4);
        order4 = new MochaSyrup(order4);
        order4 = new WhippedCream(order4);
        System.out.println(order4.getName());
    }
}
