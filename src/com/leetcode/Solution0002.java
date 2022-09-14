package com.leetcode;

import com.leetcode.common.ListNode;

/**
 * T(n)=O(max(m,n))
 * S(n)=O(1)
 */
public class Solution0002 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l = new ListNode();
        ListNode p = l;
        int add = 0;
        while (true) {
            if (l1 != null && l2 != null) {
                ListNode r = new ListNode();
                r.val = (l1.val + l2.val + add)%10;
                add = (l1.val + l2.val + add)/10;
                l1 = l1.next;
                l2 = l2.next;
                p.next = r;
                p = r;
            } else if (l1 != null) {
                ListNode r = new ListNode();
                r.val = (l1.val + add)%10;
                add = (l1.val + add)/10;
                l1 = l1.next;
                p.next = r;
                p = r;
            } else if (l2 != null) {
                ListNode r = new ListNode();
                r.val = (l2.val + add)%10;
                add = (l2.val + add)/10;
                l2 = l2.next;
                p.next = r;
                p = r;
            } else if (add != 0){
                ListNode r = new ListNode();
                r.val = add;
                add = 0;
                p.next = r;
                p = r;
            } else {
                break;
            }
        }
        return l.next;
    }
}
