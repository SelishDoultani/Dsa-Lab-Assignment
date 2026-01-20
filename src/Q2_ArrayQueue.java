public class Q2_ArrayQueue {
    private int[] data;
    private int head;
    private int tail;
    private int size;

    public Q2_ArrayQueue(int initialCapacity) {
        if (initialCapacity <= 0) initialCapacity = 1;
        data = new int[initialCapacity];
        head = 0;
        tail = 0;
        size = 0;
    }

    public void enqueue(int value) {
        if (size == data.length) {
            resize(data.length * 2);
        }
        data[tail] = value;
        tail = (tail + 1) % data.length;
        size++;
    }

    public Integer dequeue() {
        if (size == 0) return null;
        int val = data[head];
        head = (head + 1) % data.length;
        size--;
        return val;
    }

    public Integer peek() {
        if (size == 0) return null;
        return data[head];
    }

    public void display() {
        if (size == 0) {
            System.out.println("(empty)");
            return;
        }
        for (int i = 0; i < size; i++) {
            int idx = (head + i) % data.length;
            System.out.print(data[idx]);
            if (i != size - 1) System.out.print(" -> ");
        }
        System.out.println("  (capacity=" + data.length + ")");
    }

    public Integer findMin() {
        if (size == 0) return null;
        int min = data[head];
        for (int i = 1; i < size; i++) {
            int idx = (head + i) % data.length;
            if (data[idx] < min) min = data[idx];
        }
        return min;
    }

    public Integer findMax() {
        if (size == 0) return null;
        int max = data[head];
        for (int i = 1; i < size; i++) {
            int idx = (head + i) % data.length;
            if (data[idx] > max) max = data[idx];
        }
        return max;
    }

    private void resize(int newCapacity) {
        System.out.println("Resizing array queue: " + data.length + " -> " + newCapacity);
        int[] newData = new int[newCapacity];

        for (int i = 0; i < size; i++) {
            int oldIdx = (head + i) % data.length;
            newData[i] = data[oldIdx];
        }

        data = newData;
        head = 0;
        tail = size;
    }
}
