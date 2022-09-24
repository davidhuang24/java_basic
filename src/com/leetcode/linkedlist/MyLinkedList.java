package com.leetcode.linkedlist;

///**
// * lc701 设计链表：单链表方式
// */
//public class MyLinkedList {
//    /**
//     * 虚拟头结点
//     */
//    private ListNode dummy;
//
//    public MyLinkedList() {
//        dummy = new ListNode(0, null);
//    }
//    public ListNode dummy() {
//        return dummy;
//    }
//    public int size() {
//        int size = 0;
//        ListNode cur = dummy.next;
//        while (cur != null) {
//           ++size;
//           cur = cur.next;
//        }
//        return size;
//    }
//
//    public int get(int index) {
//        if (index < 0) {
//            return -1;
//        }
//        int i = 0;
//        ListNode cur = dummy.next;
//        while (cur != null && i < index) {
//            i++;
//            cur = cur.next;
//        }
//        return cur == null ? -1:cur.val;
//    }
//
//    public void addAtHead(int val) {
//        ListNode s = new ListNode(val);
//        s.next = dummy.next;
//        dummy.next = s;
//    }
//
//    public void addAtTail(int val) {
//        ListNode s = new ListNode(val);
//        ListNode cur = dummy.next;
//        ListNode tail = dummy;
//        while (cur != null) {
//            tail = cur;
//            cur = cur.next;
//        }
//        tail.next = s;
//    }
//
//    public void addAtIndex(int index, int val) {
//        ListNode cur = dummy;
//        int i = 0;
//        // 查找第index-1个节点
//        while (cur != null && i < index) {
//            cur = cur.next;
//            i++;
//        }
//        // 插入元素
//        if (cur != null) {
//            ListNode s = new ListNode(val);
//            s.next = cur.next;
//            cur.next = s;
//        }
//    }
//
//    public void deleteAtIndex(int index) {
//        if (index < 0) {
//            return;
//        }
//        ListNode cur = dummy;
//        int i = 0;
//        // 查找第index-1个节点
//        while (cur != null && i < index) {
//            cur = cur.next;
//            i++;
//        }
//        if (cur != null && cur.next != null) {
//            cur.next = cur.next.next;
//        }
//    }
//}


import com.leetcode.common.ListNode;

/**
 * lc701 设计链表：双链表方式
 */
public class MyLinkedList {
    /**
     * 虚拟头结点
     */
    private ListNode dummy;

    public MyLinkedList() {
        dummy = new ListNode(0, null, null);
    }
    public ListNode dummy() {
        return dummy;
    }
    public int size() {
        int size = 0;
        ListNode cur = dummy.next;
        while (cur != null) {
            ++size;
            cur = cur.next;
        }
        return size;
    }

    public int get(int index) {
        if (index < 0) {
            return -1;
        }
        int i = 0;
        ListNode cur = dummy.next;
        while (cur != null && i < index) {
            i++;
            cur = cur.next;
        }
        return cur == null ? -1:cur.val;
    }

    public void addAtHead(int val) {
        ListNode s = new ListNode(val);
        s.next = dummy.next;
        if (dummy.next != null) {
            dummy.next.prev = s;
        }
        dummy.next = s;
        s.prev = dummy;
    }

    public void addAtTail(int val) {
        ListNode s = new ListNode(val);
        ListNode cur = dummy.next;
        ListNode tail = dummy;
        while (cur != null) {
            tail = cur;
            cur = cur.next;
        }
        tail.next = s;
        s.prev = tail;
    }

    public void addAtIndex(int index, int val) {
        ListNode cur = dummy;
        int i = 0;
        // 查找第index-1个节点
        while (cur != null && i < index) {
            cur = cur.next;
            i++;
        }
        // 插入元素
        if (cur != null) {
            ListNode s = new ListNode(val);
            s.next = cur.next;
            if (cur.next != null) {
                cur.next.prev = s;
            }
            cur.next = s;
            s.prev= cur;
        }
    }

    public void deleteAtIndex(int index) {
        if (index < 0) {
            return;
        }
        ListNode cur = dummy;
        int i = 0;
        // 查找第index-1个节点
        while (cur != null && i < index) {
            cur = cur.next;
            i++;
        }
        if (cur != null && cur.next != null) {
            if (cur.next.next != null) {
                cur.next.next.prev = cur;
            }
            cur.next = cur.next.next;
        }
    }
}