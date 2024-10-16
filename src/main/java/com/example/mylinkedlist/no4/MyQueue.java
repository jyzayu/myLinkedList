package com.example.mylinkedlist.no4;

import com.example.mylinkedlist.no3.MyLinkedList;

import java.util.Queue;

public class MyQueue<T> implements QueueInterface<T> {
    private MyLinkedList<T> list = new MyLinkedList<>();
    @Override
    public T peek() {
        return list.get(0);
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
        T data = list.get(0);
        list.delete(0);
        return data;
    }
}
