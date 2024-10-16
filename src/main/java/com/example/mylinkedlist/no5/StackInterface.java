package com.example.mylinkedlist.no5;

public interface StackInterface<T> {
    T peek();
    boolean isEmpty();
    int size();
    void push(T element);
    T pop();
}
