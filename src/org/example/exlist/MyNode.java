package org.example.exlist;

public class MyNode<T> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void setNext(MyNode<T> next) {
        this.next = next;
    }

    MyNode<T> next;
    public MyNode(T value){
        this.value = value;
    }
}
