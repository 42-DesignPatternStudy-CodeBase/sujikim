// concrete product
public class NYCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("일반 도우반죽을 넓게 핍니다.");
        System.out.println("토마토 소스를 두 스푼 바릅니다.");
        System.out.println("치즈를 세 번 퍼서 고루 뿌립니다.");
    }   
}
