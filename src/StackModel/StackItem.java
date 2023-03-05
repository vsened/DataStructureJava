package StackModel;
/**
 * Корневой элемент для LinkedStack
 */
public class StackItem<T>{
    private T data;
    private StackItem<T> previous;

    public T getData() {
        return data;
    }

    public StackItem(T data) {
        this.data = data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setPrevious(StackItem<T> previous) {
        this.previous = previous;
    }

    public StackItem<T> getPrevious() {
        return previous;
    }
}
