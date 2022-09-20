package com.leetcode.线性表合并;

/**
 * 合并2个升序数组的变体
 * T(n) = O(m+n), S(n) = O(1)
 */
public class Solution0088 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1, j = n-1, k=m+n-1;
        while (i>=0 && j >=0) {
            if (nums1[i] <= nums2[j]) {
                nums1[k--] = nums2[j--];
            } else {
                nums1[k--] = nums1[i--];
            }
        }
        while (j>=0) {
            // num2还没遍历完事
            nums1[k--] = nums2[j--];
        }
    }
}
