package model.structures;

public interface IStack<T> {
    void push(T data);
    boolean isEmpty();
    int size();
    T peek();
    T pop();
}
