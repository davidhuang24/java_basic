package com.leetcode;

import java.util.HashMap;

/**
 * 不重复子串最大长度
 * 1、变长滑动窗口，若想返回最后一个最长不重复子串，只需在更新maxLen时存储j、i，最终subString即可
 * 2、T(n) = O(n), S(n) = O(log(n))
 */
public class Solution0003 {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();//map<char,index>存String不重复字符的较大索引
        int maxLen=0;
        for (int i=0, j=0; i<n; ++i){//双指针形成一个不重复字符滑动窗口，j相同字符下一个元素下标->i遍历指针
            if (map.containsKey(s.charAt(i))){//如果存在相同元素
                j = Math.max(j,map.get(s.charAt(i))+1);//j相同字符下一个元素下标
            }
            map.put(s.charAt(i),i);
            maxLen = Math.max(maxLen,i-j+1);//更新最大长度，i-j+1代表当前窗口
        }
        return maxLen;
    }
}
