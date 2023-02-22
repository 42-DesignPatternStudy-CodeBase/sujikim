package iteratorPattern.example.menu;

import java.util.ArrayList;

public class PancakeMenuIterator implements ClassicIterator {

    private ArrayList<MenuItem> items;
    private int position = 0;

    public PancakeMenuIterator(ArrayList<MenuItem> items) {
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
        return position >= items.size();
    }

    @Override
    public MenuItem currentItem() {
        return items.get(position);
    }
    
}
