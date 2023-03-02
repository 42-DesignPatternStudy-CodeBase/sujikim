package bridgePattern.example.list;

import java.util.ArrayList;

public class ArrayImpl<T> implements AbstractList<T> {

	private ArrayList<T> list;

    public ArrayImpl() {
        list = new ArrayList<T>();
    }
	
	@Override
	public void addElement(T obj) {
        list.add(obj);
	}

	@Override
	public T deleteElement(int i) {
		T element = getElement(i);
        list.remove(element);
        return element;
	}

	@Override
	public int insertElement(T obj, int i) {
		try {
			list.add(i, obj);
			return i;
		} catch(Exception e) {
			return -1;
		}
	}

	@Override
	public T getElement(int i) {
		return list.get(i);
	}

	@Override
	public int getElementSize() {
		return list.size();
	}
	
}
