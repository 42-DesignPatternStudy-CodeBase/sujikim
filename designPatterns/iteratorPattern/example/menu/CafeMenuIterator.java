package iteratorPattern.example.menu;

import java.util.Iterator;
import java.util.Map;

public class CafeMenuIterator implements ClassicIterator {
    private Map<String, MenuItem> items;
    private MenuItem current;
    private Iterator<MenuItem> iterator;
    private Iterator<MenuItem> nextIterator;
    
    public CafeMenuIterator(Map<String, MenuItem> items) {
        this.items = items;
        first();
    }

    @Override
    public void first() {
        iterator = nextIterator = items.values().iterator();
        current = nextIterator.next();
    }

    @Override
    public void next() {
        iterator.next();
        // try {
            current = nextIterator.next();
        // } catch(Exception e) { }
    }

    @Override
    public boolean isDone() {
        return !iterator.hasNext();
    }

    @Override
    public MenuItem currentItem() {
        return current;
    }
    
    
}
