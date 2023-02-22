package iteratorPattern.example.menu;

public class DinerMenuVendor implements MenuVendor {
    public static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private MenuItem[] menuItems;

    public DinerMenuVendor() {
        menuItems = new MenuItem[MAX_ITEMS];

        addMenuItem("채식주의자용 BLT", "통밀 위에 콩고기 베이컨, 상추, 토마토를 얹은 메뉴", true, 2.99);
        addMenuItem("BLT", "통밀 위에 베이컨, 상추, 토마토를 얹은 메뉴", false, 2.99);
        addMenuItem("오늘의 스프", "감자 샐러드를 곁들인 오늘의 스프", false, 3.29);
        addMenuItem("핫도그", "사워크라우트, 갖은 양념, 양파, 치즈가 곁들여진 핫도그", false, 3.05);
    }
    
    public void addMenuItem(String name, String description, boolean vegetarian, double price) {
        MenuItem newItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= 6) {
            System.out.println("메뉴가 꽉 차 더이상 추가하실 수 없습니다.");
        } else {
            menuItems[numberOfItems] = newItem;
            numberOfItems++;
        }
    }
    
    public ClassicIterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
