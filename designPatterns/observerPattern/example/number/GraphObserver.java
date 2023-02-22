package observerPattern.example.number;

public class GraphObserver implements Observer {

    private int num;

    @Override
    public void update(NumberGenerator generator) {
        num = generator.getNumber();
        display();
    }

    public void display() {
        System.out.print("그래프 옵저버 : ");
        for(int i = 0; i < 10; i++)
        {
            for (int j = i; j < num; j++) {
                System.out.print("◼︎");
                i++;
            }
            System.out.print("◻︎");
        
        }
        System.out.println();
    }

}