package com.example.mylinkedlist;

import com.example.mylinkedlist.no3.MyLinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListForEachTest {

    private MyLinkedList<Integer> list;

    @BeforeEach
    void setUp() {
        list = new MyLinkedList<>();
        list.add(1);  // Assuming add() method adds an element to the list
        list.add(2);
        list.add(3);
    }

    @Test
    void testForEachLoop() {
        // Array to hold the expected elements
        int[] expected = {1, 2, 3};
        int index = 0;

        // Use a for-each loop to iterate through the list
        for (Integer value : list) {
            // Check that the current element matches the expected element
            assertEquals(expected[index], value);
            index++;
        }

        // Ensure that all elements have been iterated
        assertEquals(expected.length, index);
    }

    @Test
    void testForEachOnEmptyList() {
        // Create an empty list
        MyLinkedList<Integer> emptyList = new MyLinkedList<>();

        // Use a for-each loop on an empty list
        for (Integer value : emptyList) {
            // This block should never be entered for an empty list
            fail("The for-each loop should not iterate over an empty list.");
        }
    }
}