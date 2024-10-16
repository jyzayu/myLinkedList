package com.example.mylinkedlist.no1;

public interface MyLinkedListInterface<T> {
    void add(T value);
    T get(int idx);
    void delete(int idx);
    int size();
}
