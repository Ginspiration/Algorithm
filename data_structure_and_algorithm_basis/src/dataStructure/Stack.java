package dataStructure;

public class Stack {
    private int[] data;
    private int capacity;
    private int size;

    public Stack(int capacity) {
        data = new int[capacity];
        this.capacity = capacity;
    }

    public Stack() {
        this(10);
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(int e) {
        data[getSize()] = e;
        size++;
    }

    public int pop() {
        int e = data[getSize() - 1];
        size--;
        return e;
    }

    public int peek() {
        return data[getSize() - 1];
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder(size);
        str.append("[");
        for (int i = 0; i < getSize(); i++) {
            str.append(data[i]).append(",");
        }
        str.delete(str.length() - 1, str.length());
        str.append("]");
        return str.toString();
    }
}
