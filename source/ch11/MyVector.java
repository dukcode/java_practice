import java.util.List;
import java.lang.Exception;

class MyVector implements List {
    private Object[] data = null;
    private int capacity = 0;
    private int size = 0;

    public MyVector() {
        this(10);
    }

    public MyVector(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("유효하지 않은 값입니다. : " + capacity);
        }

        this.capacity = capacity;
        data = new Object[capacity];
    }

    public void clear() {
        for (int i = 0; i < size; ++i) {
            data[i] = null;
        }
        size = 0;
    }

    public Object get(int idx) {
        if (idx < 0 || size <= idx) {
            throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
        }
        return data[idx];
    }

    public Object remove(int idx) {
        Object oldObj = null;

        if (idx < 0 || size <= idx) {
            throw new IndexOutOfBoundsException("범위를 벗어났습니다.");
        }

        oldObj = data[idx];

        if (idx != size - 1) {
            System.arraycopy(data, idx + 1, data, idx, size - idx - 1);
        }

        data[size - 1] = null;
        --size;
        return oldObj;
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity > data.length) {
            setCapacity(minCapacity);
        }
    }

    public void setCapacity(int capacity) {
        if (this.capacity == capacity) {
            return;
        }

        Object[] tmp = new Object[capacity];
        System.arraycopy(data, 0, tmp, 0, size);
        data = tmp;
        this.capacity = capacity;
    }

    public void trimToSize() {
        setCapacity(size);
    }

    public boolean remove(Object obj) {
        for (int i = 0; i < size; ++i) {
            if (obj.equals(data[i])) {
                remove(i);
                return true;
            }
        }

        return false;
    }

    public Object[] toArray() {
        Object[] array = new Object[size];
        System.arraycopy(data, 0, array, 0, size);
        return array;
    }

    public boolean add(Object obj) {
        if (size == capacity) {
            ensureCapacity(size + 5);
        }
        data[size++] = obj;
        return true;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int capacity() {
        return capacity;
    }

    public int size() {
        return size;
    }
}
