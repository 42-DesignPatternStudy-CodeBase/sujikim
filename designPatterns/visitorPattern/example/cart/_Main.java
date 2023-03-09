package visitorPattern.example.cart;

public class _Main {
    public static void main(String[] args) {
        CartItem apple = new CartItem("사과",4, 2000);
        CartItem milk = new CartItem("우유", 1, 1200);

        CartVisitor customer = new CartVisitor();

        customer.order(apple);
        customer.order(milk);
    }
}
