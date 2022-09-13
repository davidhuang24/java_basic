package com.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * T(n)=O(n*log n)
 * S(n)=O(n)
 */
public class Solution0001 {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[1] = i;
                result[0] = map.get(target - nums[i]);
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}
