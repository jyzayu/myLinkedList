package com.example.mylinkedlist.no3;

public interface LinkedListIterableInterface<T> extends Iterable<T> {
    void add(T value);
    T get(int idx);
    void delete(int idx);
    int size();
}
