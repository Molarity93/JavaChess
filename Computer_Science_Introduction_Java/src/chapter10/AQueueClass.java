package chapter10;

public class AQueueClass {
	
	private int[] elements;
    private int size;
    private int capacity;

    public AQueueClass(int capacity) {
        this.capacity = capacity;
        elements = new int[capacity];
    }

    public AQueueClass() {
        this(8);
    }

    public void enqueue(int v) {
        if (size >= elements.length) {
            int[] temp = new int[size * 2];
            System.arraycopy(elements, 0, temp, 0, size);
            elements = temp;
        }
        elements[size++] = v;

    }

    public int dequeue() {
        int v = elements[0];
        size--;
        for (int i = 0; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        return v;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
