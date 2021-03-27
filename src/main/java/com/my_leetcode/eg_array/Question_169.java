package com.my_leetcode.eg_array;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author ：hyj
 * @description：
 * @date ：Created in 2021/3/7 20:14\
 * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于 ⌊ n/2 ⌋ 的元素。
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 * 示例 1：
 * 输入：[3,2,3]
 * 输出：3
 * 示例 2：
 * 输入：[2,2,1,1,1,2,2]
 * 输出：2
 * 进阶：
 *
 * 尝试设计时间复杂度为 O(n)、空间复杂度为 O(1) 的算法解决此问题。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/majority-element
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Question_169 {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            //不存在相同的数，则加入map
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                //已存在的数，则使其+1
                map.put(num, map.get(num) + 1);
            }
        }
        //遍历map，比较最大的值
        Map.Entry<Integer, Integer> myEntry = null;
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            if (myEntry == null || entry.getValue() > myEntry.getValue()) {
                myEntry = entry;
            }
        }
        return myEntry.getKey();
    }
    /**
     *
     *
     class Solution2 {
         public int majorityElement(int[] nums) {
            Arrays.sort(nums);
            return nums[nums.length / 2];
         }
     }

     */
}
