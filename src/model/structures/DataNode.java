package model.structures;

public class DataNode<T> {
    private T data;
    private DataNode<T> next;

    public DataNode(T data) {
        this.data = data;
        next = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public DataNode<T> getNext() {
        return next;
    }

    public void setNext(DataNode<T> next) {
        this.next = next;
    }
}
