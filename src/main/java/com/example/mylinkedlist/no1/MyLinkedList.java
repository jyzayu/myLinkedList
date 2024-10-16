package com.example.mylinkedlist.no1;

import com.example.mylinkedlist.common.Node;

import java.util.ArrayList;
import java.util.List;

// 링크 리스트는 끝에 집어넣을 때도 빨라야 하는데 헤드만 구연하게 되면 끝에 넣을 때 느려지기 때문에 보통 테일까지 같이 구현합니다
public class MyLinkedList<T> implements MyLinkedListInterface<T>
{
    private Node<T> head;
    private Node<T> tail;
    private int size;

    @Override
    public void add(T data) {
        if (head == null) {
            addIfEmpty(data);
            size++;
            return;
        }
        addIfNotEmpty(data);
        size++;
    }

    @Override
    public T get(int targetIdx) {
        if (isNotValidBound(targetIdx)) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> current = head;
        int currentIdx = 0;
        while (currentIdx < targetIdx) {
            current = current.getNext();
            currentIdx++;
        }
        return current.getData();
    }

    public boolean isNotValidBound(int targetIdx) {
        return  (targetIdx < 0 || targetIdx >= size);
    }

    @Override
    public void delete(int targetIdx) {
        if (isNotValidBound(targetIdx)) {
            throw new IndexOutOfBoundsException();
        }
        if (targetIdx == 0) {
            deleteIfTargetIndexIsZero();
            return;
        }
        deleteIfTargetIndexIsNotZero(targetIdx);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        List<String> result = new ArrayList<>();
        Node<T> current = head;
        while (current != null) {
            result.add(current.getData().toString());
            current = current.getNext();
        }
        return String.join(" -> ", result);
    }

    public void addIfEmpty(T data) {
        head = tail = new Node<>(data);
    }
    public void addIfNotEmpty(T data) {
        tail.setNext(new Node<>(data));
        tail = tail.getNext();
    }

    public void deleteIfTargetIndexIsZero() {
        head = head.getNext();
        size--;
    }

    public void deleteIfTargetIndexIsNotZero(int targetIdx) {
        Node<T> current = head;
        int currentIdx = 0;
        while (currentIdx < targetIdx - 1) {
            current = current.getNext();
            currentIdx++;
        }
        if (current.getNext().getNext() == null) {
            tail = current.getNext();
        }
        current.setNext(current.getNext().getNext());
        size--;
    }

}

