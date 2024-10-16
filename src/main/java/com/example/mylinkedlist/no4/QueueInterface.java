package com.example.mylinkedlist.no4;

public interface QueueInterface<T> {
    T peek();
    boolean isEmpty();
    int size();
    void push(T element);
    T pop();
}
