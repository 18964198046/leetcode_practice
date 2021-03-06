package practice.leecode.LinkedTable;

import org.junit.Test;
import practice.utils.ListNode;

import static org.junit.Assert.*;

public class ReverseList_206Test {

    @Test
    public void reverseList() {
        //1->2->3->4->5->NULL

        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        ReverseList_206 reverseList_206 = new ReverseList_206();
        ListNode result = reverseList_206.reverseList(head);

        assertEquals(5, result.val);
        assertEquals(4, result.next.val);
        assertEquals(3, result.next.next.val);
        assertEquals(2, result.next.next.next.val);
        assertEquals(1, result.next.next.next.next.val);

    }

}