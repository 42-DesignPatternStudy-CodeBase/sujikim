package visitorPattern.example.cart;

public class CartItem implements Visitable {
    
    private String name;
    private int count, price;
    
    public CartItem(String name, int count, int price) {
        this.name = name;
        this.count = count;
        this.price = price;
    }
    
    @Override
    public void accept(Visitor visitor) {
        visitor.order(this);
    }

    public int getCount() {
        return count;
    }

    public int getPrice() {
        return price;
    }
    
    public void list() {
        System.out.print(name);
        System.out.print(", 수량 : " + count);
        System.out.println(", 가격 : " + price);
    }

}
