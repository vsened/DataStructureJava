package StackModel;

import java.util.ArrayList;
/**
 * Простая реализация стека с использованием ArrayList
 */
public class EasyStack<T> {
    private final ArrayList<T> items = new ArrayList<>();
    /**
     * Возвращает количество элементов в очереди
     */
    public int size() {
        return items.size();
    }
    /**
     * Возращает true если стек пуст
     */
    public boolean isEmpty() {
        return items.isEmpty();
    }
    /**
     * Добавляет элемент в стек
     */
    public void push(T elem) {
        items.add(elem);
    }
    /**
     * Возращает и удаляет из стека верхний элемент.
     * Если стек пуст, то бросает исключение NullPointerException.
     */
    public T pop() {
        if (items.size() != 0) {
            int lastIndex = items.size() - 1;
            T elem = items.get(lastIndex);
            items.remove(lastIndex);
            return elem;
        } else {
            throw new NullPointerException("Stack is empty");
        }
    }
    /**
     * Возращает верхний элемент в стеке.
     * Если стек пуст, то бросает исключение NullPointerException.
     */
    public T peek() {
        if (items.size() != 0) {
            int lastIndex = items.size() - 1;
            return items.get(lastIndex);
        } else {
            throw new NullPointerException("Stack is empty");
        }
    }
    /**
     * Удаляет все элементы из стека.
     */
    public void clear() {
        items.clear();
    }
    /**
     * Возращает смещение элемента от вершины стека.
     * Если стек пуст, то бросает исключение NullPointerException.
     */
    public int searchPosition(T elem) {
        if (items.size() != 0) {
            int elemIndex = items.indexOf(elem);
            return items.size() - elemIndex;
        } else {
            throw new NullPointerException("Stack is empty");
        }
    }

    @Override
    public String toString() {
        return String.format("Stack | Count elements: %d", items.size());
    }
}
