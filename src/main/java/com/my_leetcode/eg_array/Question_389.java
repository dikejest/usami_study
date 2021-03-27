package com.my_leetcode.eg_array;

import java.util.HashMap;

/**
 * @author ：hyj
 * @description：
 * @date ：Created in 2020/12/19 0:04
 *
 * 389. 找不同
 * 给定两个字符串 s 和 t，它们只包含小写字母。
 *
 * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母。
 *
 * 请找出在 t 中被添加的字母。
 *
 *
 *
 * 示例 1：
 *
 * 输入：s = "abcd", t = "abcde"
 * 输出："e"
 * 解释：'e' 是那个被添加的字母。
 * 示例 2：
 *
 * 输入：s = "", t = "y"
 * 输出："y"
 * 示例 3：
 *
 * 输入：s = "a", t = "aa"
 * 输出："a"
 * 示例 4：
 *
 * 输入：s = "ae", t = "aea"
 * 输出："a"
 *
 *
 * 提示：
 *
 * 0 <= s.length <= 1000
 * t.length == s.length + 1
 * s 和 t 只包含小写字母
 */
public class Question_389 {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char key = t.charAt(i);
            if (map.containsKey(key)){
                Integer count = map.getOrDefault(key,1);
                count++;
                map.put(key,count);
            }else {
                map.put(key,1);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            Integer count = map.getOrDefault(key,1);
            count--;
            if (count==0){
                map.remove(key);
            }else {
                map.put(key,count);
            }
        }
        for (Character character : map.keySet()) {
            return character;
        }
        return 'h';
    }

    public static void main(String[] args){
        String s = "abcdefgaaaaaa";
        String t = "gfedxcbaaaaaaa";
        Question_389 x389 = new Question_389();
        System.out.println(x389.findTheDifference(s, t));
    }
}
