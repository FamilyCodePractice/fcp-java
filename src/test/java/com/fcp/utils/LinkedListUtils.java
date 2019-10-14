package com.fcp.utils;

import com.fcp.ds.Node;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.ArrayUtils;

import java.util.Random;

/**
 * Utils for linked list.
 */
@Slf4j
public class LinkedListUtils {
    private final static Random random = new Random();

    // Initialize a linked list from defined values.
    public static <T> Node<T> initializeLinkedList(T[] values) {
        if (values == null) {
            return null;
        }

        Node<T> curr = null;
        for (int i = values.length - 1; i >= 0; --i) {
            curr = new Node<T>(values[i], curr);
        }
        return curr;
    }

    // Initialize a random linked list of integers with pre-defined size
    public static Node<Integer> initializeRandomLinkedList(int size) {
        if (size <= 0) return null;

        int[] arr = random.ints(size, 7, Integer.MAX_VALUE).toArray();
        Integer[] arrObj = ArrayUtils.toObject(arr);
        return LinkedListUtils.initializeLinkedList(arrObj);
    }

    public static <T> void display(Node<T> head) {
        StringBuilder sb = new StringBuilder();
        Node<T> curr = head;
        while (curr != null) {
            if (curr == head) {
                sb.append(curr.value);
            } else {
                sb.append(String.format(" -> %s", curr.value));
            }
            curr = curr.next;
        }
        log.info(sb.toString());
    }

    public static <T> int getSize(Node<T> head) {
        int size = 0;
        Node<T> curr = head;
        while (curr != null) {
            size++;
            curr = curr.next;
        }
        return size;
    }
}
