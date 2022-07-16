package dataStructure;

public class Array {
    private int[] data;//储存空间
    private int capacity;//初始化容量
    private int size = 0;//有多少个元素

    public Array(int capacity) {
        data = new int[capacity];
        this.capacity = capacity-1;
    }

    public Array(){
       this(10);
    }

    public int getSize() {
        return size;
    }

    public void add(int e){
        if (getSize()>capacity) {
            throw new RuntimeException("容量不足");
        }
        data[size] = e;
        size++;
    }
    public void del(int index){
        for (int i = index; i < getSize()-1; i++) {
            data[i] = data[i+1];
        }
        size--;
    }
    public void set(int index,int e){
        data[index] = e;
    }
    public int get(int index){
        return data[index];
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder(size);
        str.append("[");
        for (int i = 0; i < getSize(); i++) {
            str.append(data[i]).append(",");
        }
        str.delete(str.length()-1,str.length());
        str.append("]");
        return str.toString();
    }
}
