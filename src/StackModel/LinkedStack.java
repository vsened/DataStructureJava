package StackModel;
/**
 * Реализация стека на основе LinkedList
 */
public class LinkedStack<T> {
    public StackItem<T> head;

    public int size;

    public int getSize() {
        return size;
    }

    public LinkedStack() {
        head = null;
        size = 0;
    }

    public LinkedStack(T data) {
        head = new StackItem<T>(data);
        size = 1;
    }

    public LinkedStack(StackItem<T> item) {
        head = item;
        size = 1;
    }

    public void push(StackItem<T> item) {
        item.setPrevious(head);
        head = item;
        size++;
    }

    public void push(T data) {
        StackItem<T> item = new StackItem<>(data);
        item.setPrevious(head);
        head = item;
        size++;
    }

    public StackItem<T> pop() {
        if (size > 0) {
            var item = head;
            head = item.getPrevious();
            size--;
            return  item;
        } else {
            throw new NullPointerException("Stack is empty!");
        }
    }

    public StackItem<T> peek() {
        if (size > 0) {
            return head;
        } else {
            throw new NullPointerException("Stack is empty!");
        }
    }

    
}
