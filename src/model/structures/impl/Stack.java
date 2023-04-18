package model.structures.impl;

import model.structures.DataNode;
import model.structures.IStack;

import java.util.NoSuchElementException;

public class Stack<T> implements IStack<T> {
    private DataNode<T> top;
    private int size;

    public Stack() {
        top = null;
        size = 0;
    }

    @Override
    public void push(T data) {
        DataNode<T> element = new DataNode<>(data);
        element.setNext(top);
        top = element;
        size++;
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
    public T peek() {
        validateEmptyStack();
        return top.getData();
    }

    @Override
    public T pop() {
        if(isEmpty()){
            return null;
        }
        validateEmptyStack();
        DataNode<T> temp = top;
        top = top.getNext();
        size--;
        return temp.getData();
    }

    private void validateEmptyStack() {
        if (isEmpty())
            throw new NoSuchElementException("The stack is empty");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        DataNode<T> head = top;
        while (head != null) {
            sb.append(top.getData()).append(" ");
            head = head.getNext();
        }
        return "[" + sb.toString().trim() + "]";
    }
}
