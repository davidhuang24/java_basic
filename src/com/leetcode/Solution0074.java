package com.leetcode;

/**
 * 最简单杨氏矩阵，二分查找思想
 */
public class Solution0074 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int i = 0, j = matrix[0].length-1;
        while (i < matrix.length && j >=0) {
            if (target > matrix[i][j]) {
                i++;
            } else if (target < matrix[i][j]) {
                j--;
            } else {
                return true;
            }
        }
        return false;
    }
}
