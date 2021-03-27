package com.my_leetcode.eg_array;

/**
 * @author ：hyj
 * @description：
 * @date ：Created in 2020/12/25 0:00
 * 283. 移动零
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 示例:
 *
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 说明:
 *
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 */
public class Question_283 {
    public static void moveZeroes(int[] nums) {
        if (nums==null){
            return;
        }
        //第一次遍历的时候j指针记录非0的个数，只要是非0的统统赋给nums[i]
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0){
                nums[j++] = nums[i];
            }
        }
        //非0元素统计完了，剩下的都是0，将末尾元素赋值为0
        for (int i = j; i < nums.length ; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] a ={1,0,0,2,3,0,4,5,0,6,7,8,9,0,10};
        Question_283.moveZeroes(a);
        for (int i : a) {
            System.out.println(i);
        }
    }
}
