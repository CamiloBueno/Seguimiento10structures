package model.structures;

public interface IQueue<T> {
    void enqueue(T data);

    T dequeue();

    boolean isEmpty();

    int size();

    T front();

    T rear();
}