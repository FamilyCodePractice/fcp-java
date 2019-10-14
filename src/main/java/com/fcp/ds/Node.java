package com.fcp.ds;

/**
 * Represents a singly linked node with one pointer that points to the next node in the list.
 * @param <T>
 */
public class Node<T> {
    public final T value;
    public Node<T> next;

    public Node(T value) {
        this(value, null);
    }

    public Node(T value, Node<T> next) {
        this.value = value;
        this.next = next;
    }
}
