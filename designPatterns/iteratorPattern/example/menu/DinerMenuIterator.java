package iteratorPattern.example.menu;

public class DinerMenuIterator implements ClassicIterator {

    private MenuItem[] items;
    private int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public void first() {
        position = 0;
    }

    @Override
    public void next() {
        position++;
    }

    @Override
    public boolean isDone() {
        return position >= items.length || items[position] == null;
    }

    @Override
    public MenuItem currentItem() {
        return items[position];
    }   
}
