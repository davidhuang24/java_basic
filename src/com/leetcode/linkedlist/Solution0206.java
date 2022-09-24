package com.leetcode.linkedlist;

import com.leetcode.common.ListNode;


public class Solution0206 {
    /**
     * 反转链表:头插法建立链表
     * T(n) = O(n), S(n) = O(1)
     */
    public ListNode reverseList(ListNode head) {
        // 建立一个 dummy 虚拟节点，方便统一操作
        ListNode dummy = new ListNode(0);
        while (head != null) {
            // next是临时缓存指针，保证链表不断链
            ListNode next = head.next;
            head.next = dummy.next;
            dummy.next = head;
            head = next;
        }
        return dummy.next;
    }

    /**
     * 尾插法建立链表，和输入顺序一致
     * T(n) = O(n), S(n) = O(1)
     */
    public ListNode createList(int[] array) {
        // 建立一个 dummy 虚拟节点，方便统一操作
        ListNode dummy = new ListNode(0), tail = dummy;
        for (int a : array) {
            ListNode s = new ListNode(a);
            tail.next = s;
            tail = s;
        }
        return dummy.next;
    }
}
