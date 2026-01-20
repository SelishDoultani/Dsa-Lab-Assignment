public class Q2_LinkedListQueue {
    private static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    private Node head;
    private Node tail;
    private int size;

    public void enqueue(int value) {
        Node n = new Node(value);
        if (tail == null) {
            head = tail = n;
        } else {
            tail.next = n;
            tail = n;
        }
        size++;
    }

    public Integer dequeue() {
        if (head == null) return null;
        int val = head.data;
        head = head.next;
        if (head == null) tail = null;
        size--;
        return val;
    }

    public Integer peek() {
        return (head == null) ? null : head.data;
    }

    public void display() {
        if (head == null) {
            System.out.println("(empty)");
            return;
        }
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data);
            if (cur.next != null) System.out.print(" -> ");
            cur = cur.next;
        }
        System.out.println();
    }

    public Integer findMin() {
        if (head == null) return null;
        int min = head.data;
        Node cur = head.next;
        while (cur != null) {
            if (cur.data < min) min = cur.data;
            cur = cur.next;
        }
        return min;
    }

    public Integer findMax() {
        if (head == null) return null;
        int max = head.data;
        Node cur = head.next;
        while (cur != null) {
            if (cur.data > max) max = cur.data;
            cur = cur.next;
        }
        return max;
    }

    public int size() {
        return size;
    }
}
