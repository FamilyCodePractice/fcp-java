package com.fcp.ds;

/**
 * A doubly linked list with two pointers: next to the next node and prev to the previous node.
 * @param <T> The type of value.
 */
public class DoublyLinkedNode<T> {
    T value;

    DoublyLinkedNode<T> next;
    DoublyLinkedNode<T> prev;
}
