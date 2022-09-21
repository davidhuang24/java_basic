package com.leetcode;

import com.leetcode.common.ListNode;

public class Solution0203 {
    public ListNode removeElements(ListNode head, int val) {
        // 建立一个 dummy 虚拟节点，方便统一操作
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        // 双指针遍历
        ListNode pre = dummy, p = pre.next;
        boolean found = false;
        // 查找并删除
        while (p != null) {
            if (p.val == val) {
                pre.next = p.next;
                found = true;
            }
            // 查找并删除结点后只移动p，pre不移动,found需重置
            if (!found) {
                pre = p;
            } else {
                found = false;
            }
            p = p.next;
        }
        return dummy.next;
    }
}
