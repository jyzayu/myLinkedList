package com.example.mylinkedlist;

import com.example.mylinkedlist.common.Node;
import com.example.mylinkedlist.no1.MyLinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class MyLinkedListTest1 {

        private MyLinkedList<Integer> list;

        @BeforeEach
        public void setup() {
            list = new MyLinkedList<>();
        }

        @Test
        public void testAddToEmptyList() {
            // Test adding to an empty list
            list.add(10);
            assertEquals(1, list.size());
            assertEquals(10, list.get(0));
        }

        @Test
        public void testAddMultipleElements() {
            list.add(10);
            list.add(20);
            list.add(30);

            assertEquals(3, list.size());
            assertEquals(10, list.get(0));
            assertEquals(20, list.get(1));
            assertEquals(30, list.get(2));
        }

        @Test
        public void testDeleteHead() {
            list.add(10);
            list.add(20);
            list.add(30);

            list.delete(0);  // Deleting the head
            assertEquals(2, list.size());
            assertEquals(20, list.get(0));  // Now 20 should be the new head
            assertEquals(30, list.get(1));
        }

        @Test
        public void testDeleteMiddle() {
            list.add(10);
            list.add(20);
            list.add(30);

            list.delete(1);  // Deleting the element at index 1
            assertEquals(2, list.size());
            assertEquals(10, list.get(0));
            assertEquals(30, list.get(1));  // 30 should shift up after deletion
        }

        @Test
        public void testDeleteTail() {
            list.add(10);
            list.add(20);
            list.add(30);

            list.delete(2);  // Deleting the tail
            list.add(40);
//            assertEquals(2, list.size());
//            assertEquals(10, list.get(0));
//            assertEquals(20, list.get(1));  // Tail should now be 20
            assertEquals("10 -> 20 -> 40", list.toString());
        }

        @Test
        public void testDeleteFromSingleElementList() {
            list.add(10);
            list.delete(0);  // Deleting the only element in the list

            assertEquals(0, list.size());
            assertThrows(IndexOutOfBoundsException.class, () -> list.get(0));  // List should be empty
        }

        @Test
        public void testIndexOutOfBounds() {
            list.add(10);

            assertThrows(IndexOutOfBoundsException.class, () -> list.get(1));  // Accessing invalid index
            assertThrows(IndexOutOfBoundsException.class, () -> list.delete(2));  // Deleting invalid index
        }

        @Test
        public void testToString() {
            list.add(10);
            list.add(20);
            list.add(30);

            String expectedString = "10 -> 20 -> 30";
            assertEquals(expectedString, list.toString());
        }

        @Test
        public void testAddToEndOfList() {
            list.add(10);
            list.add(20);
            list.add(30);
            list.add(40);  // Adding at the end

            assertEquals(4, list.size());
            assertEquals(40, list.get(3));  // 40 should be at the end
        }
    }

