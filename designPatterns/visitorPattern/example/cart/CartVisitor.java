package visitorPattern.example.cart;

public class CartVisitor implements Visitor {

    private double totalPrice;
    private int totalCount;

    public CartVisitor() {
        System.out.println("주문을 처리합니다.");
        totalPrice = 0;
        totalCount = 0;
    }

    @Override
    public void order(Visitable visitable) {
        if (visitable instanceof CartItem) {
            CartItem cart = (CartItem)visitable;
            
            System.out.println("==== 결제 완료 ====");
            cart.list();
            
            System.out.println("---- 누적 결제액 ----");
            totalCount += cart.getCount();
            totalPrice += cart.getPrice();
            System.out.print("총 " + totalCount + "개 상품, ");
            System.out.println("총 결제 금액 : " + totalPrice + "원 입니다.");
        } 
        else 
            System.out.println("잘못된 요청입니다.");   
    }
}
