package com.fcp;

import com.fcp.ds.Node;
import com.fcp.utils.LinkedListUtils;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class LinkedListTests {
    @Test
    public void initLinkedList() {
        Node<Integer> head = LinkedListUtils.initializeLinkedList(new Integer[] {2, 3, 6, 7, 8});
        LinkedListUtils.display(head);
        assertTrue(5 == LinkedListUtils.getSize(head));
    }

    @Test
    public void initRandomLinkedList() {
        int[] sizes = {0, 10, 20, 50, 100};
        for (int size: sizes) {
            Node<Integer> head = LinkedListUtils.initializeRandomLinkedList(size);
            LinkedListUtils.display(head);
            assertTrue(size == LinkedListUtils.getSize(head));
        }
    }
}
