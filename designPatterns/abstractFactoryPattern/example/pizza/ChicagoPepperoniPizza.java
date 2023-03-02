package abstractFactoryPattern.example.pizza;

public class ChicagoPepperoniPizza extends Pizza {

    @Override
    public void displayMakingProcess() {

        System.out.println("아주 두꺼운 크러스트 도우반죽을 그릇모양으로 구웁니다.");
        System.out.println("특제 토마토 소스를 네 스푼 담습니다.");
        System.out.println("치즈를 다섯 번 퍼서 담습니다.");
        System.out.println("페페로니 5장을 올려 마무리합니다.");
    }
    
}
