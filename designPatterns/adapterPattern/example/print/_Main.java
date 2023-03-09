package adapterPattern.example.print;

public class _Main {

    public static void main(String[] args) {
        Print p1 = new PrintBannerInheritance("Hello");
        p1.printWeak();
        p1.printStrong();

        Print p2 = new PrintBannerComposition("Hello");
        p2.printWeak();
        p2.printStrong();
    }
}
