package Package2.Collections.QueueInterface;

import java.util.*;

public class CircularBuffer {

    private int[] buffer;
    private int size;
    private int front = 0;
    private int count = 0;

    public CircularBuffer(int size) {
        this.size = size;
        buffer = new int[size];
    }

    public void add(int value) {
        int index = (front + count) % size;

        buffer[index] = value;

        if (count == size) {
            front = (front + 1) % size;
        } else {
            count++;
        }
    }

    public void display() {
        for (int i = 0; i < count; i++) {
            System.out.print(buffer[(front + i) % size] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);

        cb.add(1);
        cb.add(2);
        cb.add(3);
        cb.display();

        cb.add(4);
        cb.display();
    }
}
