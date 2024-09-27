package org.example.exlist;

public class SteckStretegy<T> implements ListStretegy<T> {
    @Override
    public MyNode<T> add(MyNode<T> head, MyNode<T> newNode) {
        newNode.setNext(head);
        return newNode;
    }

    public MyNode<T> remove(MyNode<T> head) {


        MyNode<T> newHead = head.next;
        head.setNext(null);
        head.setValue(null);
        return newHead;
    }

}

