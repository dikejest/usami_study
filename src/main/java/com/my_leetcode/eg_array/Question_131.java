package com.my_leetcode.eg_array;

import java.util.List;

/**
 * @author ：hyj
 * @description：
 * @date ：Created in 2021/3/7 19:47
 *
 *131. 分割回文串
 * 给你一个字符串 s，请你将 s 分割成一些子串，使每个子串都是 回文串 。返回 s 所有可能的分割方案。
 *
 * 回文串 是正着读和反着读都一样的字符串。
 *
 *
 *
 * 示例 1：
 *
 * 输入：s = "aab"
 * 输出：[["a","a","b"],["aa","b"]]
 * 示例 2：
 *
 * 输入：s = "a"
 * 输出：[["a"]]
 *
 *
 * 提示：
 *
 * 1 <= s.length <= 16
 * s 仅由小写英文字母组成
 *
 */
public class Question_131 {

    public List<List<String>> partition(String s) {
        //1.必有一种情况，所有的字符组成的字符串数组
        String[] s1 = new String[s.length()];
        for (int i = 0; i < s.length(); i++) {
            s1[i] = String.valueOf(s.charAt(i));
        }
        return null;
    }
}
