package data_structure;


/**
 * Add elements to rear side
 * delete elements from front side of array
 * */
public class MyQueue {

    private int[] array;
    private int maxSize;
    private int rear =-1;
    private int front =-1;

    public MyQueue(int size) {
        this.maxSize = size;
        this.array = new int[maxSize];
    }

    public void enQueue(int value) {
        if (isFull()) {
            return;
        }else if (isEmpty()) {
            front = rear =0;
        } else {
            rear +=1;
        }
        array[rear] = value;

    }

    public void deQueue() {
        if (isEmpty()) {
            return;
        }if (front == rear) {
            front = rear =-1;
        } else {
            front+=1;
        }
    }

    public int front() {
        return array[front];
    }

    public int rear() {
        return array[rear];
    }

    public boolean isFull() {
        if (rear == maxSize-1) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (front ==-1 && rear ==-1) {
            return true;
        }
        return false;
    }
}
