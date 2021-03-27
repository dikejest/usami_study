package com.my_leetcode.eg_array;

import java.util.*;

/**
 * @author ：hyj
 * @description：
 * @date ：Created in 2020/12/14 18:49
 *
 * 给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
 *
 * 示例:
 *
 * 输入: ["eat", "tea", "tan", "ate", "nat", "bat"]
 * 输出:
 * [
 *   ["ate","eat","tea"],
 *   ["nat","tan"],
 *   ["bat"]
 * ]
 * 说明：
 *
 * 所有输入均为小写字母。
 * 不考虑答案输出的顺序。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/group-anagrams
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Question_49 {
    /*
    * 由于互为字母异位词的两个字符串包含的字母相同，
    * 因此对两个字符串分别进行排序之后得到的字符串一定是相同的，
    * 故可以将排序之后的字符串作为哈希表的键。
    * */
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<String,List<String>>();
        for (String str : strs) {
            char[] array = str.toCharArray();
            Arrays.sort(array);
            String key = String.valueOf(array);
            //如果map中有存在对应的key，则使用他的value，
            // 没有则用该方法的第二个参数作为返回值
            //这里表示如果有对应的key的String存在，则将对应的key的String数组返回给list
            //表示存在排序后相同的字符串。
            List<String> list = map.getOrDefault(key,new ArrayList<String>());
            list.add(str);
            map.put(key,list);
        }
        return new ArrayList<List<String>>(map.values());

    }
    public static void main(String[] args){
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(strs));
    }
}
