package com.leetcode.linkedlist.MergeList;

import com.leetcode.common.ListNode;

/**
 * 合并两个有序链表为有序链表：尾插法建立返回值链表
 * T(n) = O(m+n), S(n) = O(1)
 */
public class Solution0021 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode l = new ListNode(), tail = l; // 建立一个头结点，统一每个节点的操作
        while (list1 != null && list2 != null) {
            if (list1.val >= list2.val) {
                tail.next = list2;
                tail = list2;
                list2 = list2.next;
            } else {
                tail.next = list1;
                tail = list1;
                list1 = list1.next;
            }
        }
        if (list1 != null) {
            tail.next = list1;
        }
        if (list2 != null) {
            tail.next = list2;
        }
        return l.next;
    }
}
