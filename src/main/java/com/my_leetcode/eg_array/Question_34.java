package com.my_leetcode.eg_array;

/**
 * @author ：hyj
 * @description：
 * @date ：Created in 2020/12/4 10:22
 * <p>
 * <p>
 * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 * <p>
 * 如果数组中不存在目标值 target，返回 [-1, -1]。
 * <p>
 * 进阶：
 * <p>
 * 你可以设计并实现时间复杂度为 O(log n) 的算法解决此问题吗？
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [5,7,7,8,8,10], target = 8
 * 输出：[3,4]
 * 示例 2：
 * <p>
 * 输入：nums = [5,7,7,8,8,10], target = 6
 * 输出：[-1,-1]
 * 示例 3：
 * <p>
 * 输入：nums = [], target = 0
 * 输出：[-1,-1]
 *  
 * <p>
 * 提示：
 * <p>
 * 0 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 * nums 是一个非递减数组
 * -109 <= target <= 109
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Question_34 {

    public static int[] searchRange(int[] nums, int target) {
        int index1=-1,index2=-1;
        for (int i = 0; i < nums.length; i++) {
            //如果大于则返回[-1,-1]

            if (nums[i] == target) {
                if (index1==-1){
                    index1 = i;
                }
                if (index1!=-1){
                    index2 = i;
                }
            }
        }
        int[] indexs = {index1,index2};
        return indexs;
    }

    //二分法
    public int[] searchRange2(int[] nums, int target){
        int leftIdx = binarySearch(nums, target, true);
        int rightIdx = binarySearch(nums, target, false) - 1;
        if (leftIdx <= rightIdx && rightIdx < nums.length && nums[leftIdx] == target && nums[rightIdx] == target) {
            return new int[]{leftIdx, rightIdx};
        }
        return new int[]{-1, -1};
    }

    public int binarySearch(int[] nums, int target, boolean lower) {
        int left = 0, right = nums.length - 1, ans = nums.length;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target || (lower && nums[mid] >= target)) {
                right = mid - 1;
                ans = mid;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 8, 9, 10};
        int[] nums2 = new int[]{1, 2, 3, 4, 5, 6, 7, 7, 8};
        int[] nums3 = new int[]{5,7,7,8,8,10};
        int[] ints = searchRange(nums3, 8);
        System.out.println("["+ints[0]+","+ints[1]+"]");
    }
}
