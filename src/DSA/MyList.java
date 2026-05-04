package DSA;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    // Thêm phần tử vào cuối
    public boolean add(E e) {
        ensureCapacity(size + 1);
        elements[size++] = e;
        return true;
    }

    // Thêm vào vị trí index
    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        ensureCapacity(size + 1);

        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }

        elements[index] = element;
        size++;
    }

    // Xoá phần tử
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        E removed = (E) elements[index];

        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }

        elements[--size] = null;
        return removed;
    }

    // Lấy phần tử
    public E get(int i) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (E) elements[i];
    }

    // Số phần tử
    public int size() {
        return size;
    }

    // Xoá tất cả
    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    // Kiểm tra tồn tại
    public boolean contains(E o) {
        return indexOf(o) != -1;
    }

    // Tìm index
    public int indexOf(E o) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    // Clone list
    public MyList<E> clone() {
        MyList<E> newList = new MyList<>(elements.length);
        for (int i = 0; i < size; i++) {
            newList.add((E) elements[i]);
        }
        return newList;
    }

    // Tăng kích thước mảng
    private void ensureCapacity(int minCapacity) {
        if (minCapacity > elements.length) {
            int newCapacity = elements.length * 2;
            Object[] newArr = new Object[newCapacity];

            for (int i = 0; i < size; i++) {
                newArr[i] = elements[i];
            }

            elements = newArr;
        }
    }
}

