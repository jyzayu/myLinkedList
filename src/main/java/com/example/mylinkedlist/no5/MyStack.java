package com.example.mylinkedlist.no5;

import com.example.mylinkedlist.no3.MyLinkedList;

import java.util.Stack;

public class MyStack<T> implements StackInterface<T> {
    MyLinkedList<T> list = new MyLinkedList<>();

    @Override
    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return list.getTail();
    }

    @Override
    public boolean isEmpty() {
        return list.size() == 0;
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void push(T element) {
        list.add(element);
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            return null;
        }
        T data = list.getTail();
        list.delete(list.size() - 1);
        return data;
    }
}
