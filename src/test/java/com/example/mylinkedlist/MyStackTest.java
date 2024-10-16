package com.example.mylinkedlist;
import com.example.mylinkedlist.no3.MyLinkedList;
import com.example.mylinkedlist.no5.MyStack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackTest {

    private MyStack<Integer> stack;

    @BeforeEach
    void setUp() {
        stack = new MyStack<>();
    }

    @Test
    void testIsEmptyInitially() {
        // Stack should be empty initially
        assertTrue(stack.isEmpty());
    }

    @Test
    void testPushAndSize() {
        // Push elements and check size
        stack.push(10);
        assertEquals(1, stack.size());

        stack.push(20);
        assertEquals(2, stack.size());
    }

    @Test
    void testPeek() {
        // Push elements and peek the top of the stack
        stack.push(10);
        stack.push(20);
        assertEquals(20, stack.peek());  // Should return the last pushed element

        stack.push(30);
        assertEquals(30, stack.peek());  // Now it should return the new top element
    }

    @Test
    void testPop() {
        // Push elements and pop them, checking values and size
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Pop elements and check their values
        assertEquals(30, stack.pop());  // Last in, first out
        assertEquals(2, stack.size());  // Size should decrease

        assertEquals(20, stack.pop());  // Pop again
        assertEquals(1, stack.size());

        assertEquals(10, stack.pop());  // Pop the last element
        assertTrue(stack.isEmpty());    // Stack should be empty now
    }

    @Test
    void testPopOnEmptyStack() {
        // Popping an empty stack should return null or throw an exception depending on your implementation
        assertTrue(stack.isEmpty());
        assertNull(stack.pop());  // Assuming pop() returns null when empty, modify if exception is thrown instead
    }

    @Test
    void testPeekOnEmptyStack() {
        // Peeking an empty stack should return null or throw an exception depending on your implementation
        assertTrue(stack.isEmpty());
        assertNull(stack.peek());  // Assuming peek() returns null when empty, modify if exception is thrown instead
    }
}
