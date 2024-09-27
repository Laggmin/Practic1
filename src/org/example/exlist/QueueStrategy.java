package org.example.exlist;

public class QueueStrategy<T>  {
    public MyNode<T> remove(MyNode<T> head) {


        MyNode<T> current = head;
        while (current != null)
        {

            current = current.next;
            head = current;
            return head;
        }

        return head;
    }

    public MyNode<T> add(MyNode<T> head, MyNode<T> newNode) {
        if (head == null) {
            head = newNode;
        } else {
            MyNode<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        return head;
    }
}
