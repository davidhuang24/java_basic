package com.datastructures.wangdao.linearlist.linklist;

import com.leetcode.common.ListNode;

import java.util.Scanner;

public class LinkList {
    /**
     * lc206反转链表:头插法建立链表
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

    /**
     * 在链表head的第i个节点前插入一个元素e，假设链表长度为n, i范围是[0,n]
     * T(n) = O(n), S(n) = O(1)
     */
    public ListNode insert(ListNode head, int i, int e) {
        // 建立一个 dummy 虚拟节点，方便统一操作
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode p = head;
        // 计算表长
        int n = 0;
        while (p != null) {
            p = p.next;
            n++;
        }

        p = dummy;
        int j = 0;
        if (i < 0 || i > n) {
            return dummy.next;
        }
        // 查找第i-1个节点
        while (p != null && j < i) {
            p = p.next;
            j++;
        }
        // 插入元素
        if (p != null) {
            ListNode s = new ListNode(e);
            s.next = p.next;
            p.next = s;
        }
        return dummy.next;
    }

    /**
     * 删除链表中第一个为val的节点
     * T(n) = O(n), S(n) = O(1)
     */
    public ListNode deleteElement(ListNode head, int val) {
        // 建立一个 dummy 虚拟节点，方便统一操作
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        // 双指针遍历
        ListNode pre = dummy, p = pre.next;
        // 查找
        while (p != null && p.val != val) {
            pre = p;
            p = p.next;
        }
        // 删除
        if (p != null) {
            pre.next = p.next;
        }
        return dummy.next;
    }

}
