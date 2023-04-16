package model.structures.impl;

import model.structures.IQueue;
import model.structures.DataNode;

import java.util.NoSuchElementException;

public class Queue<T> implements IQueue<T> {
    private DataNode<T> front;
    private DataNode<T> rear;
    private int size;

    public Queue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    @Override
    public void enqueue(T data) {
        DataNode<T> element = new DataNode<>(data);
        if (front == null)
            rear = front = element;
        else {
            rear.setNext(element);
            rear = element;
        }
        size++;
    }

    @Override
    public T dequeue() {
        validateEmptyQueue();
        DataNode<T> temp = front;
        if (front == rear)
            front = rear = null;
        else
            front = front.getNext();
        size--;
        return temp.getData();
    }

    private void validateEmptyQueue() {
        if (isEmpty())
            throw new NoSuchElementException("The queue is empty");
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T front() {
        return front.getData();
    }

    @Override
    public T rear() {
        return rear.getData();
    }
}
