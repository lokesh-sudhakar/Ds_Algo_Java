package data_structure;

/**LIFO - Last In First Out
 * List with restriction where elements can be added or removed
 * from one and one element at a time
 *
 *
 * */
public class MyStack {

    private int top =-1;
    int[] array;
    int maxSize;

    public MyStack(int size) {
        this.maxSize = size;
        array = new int[maxSize];
    }

    public void push(int x) {
        if (top == maxSize-1)  {

        } else {
            top+=1;
            array[top] = x;
        }
    }

    public int pop(){
        int popedElement = array[top];
        top-=1;
        return popedElement;
    }

    public int top() {
        return array[top];
    }

    public boolean isEmpty() {
        return top ==-1;
    }

    public int size() {
        return top+1;
    }
}
