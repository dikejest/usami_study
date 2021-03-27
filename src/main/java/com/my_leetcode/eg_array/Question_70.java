package com.my_leetcode.eg_array;

/**
 * @author ：hyj
 * @description：
 * @date ：Created in 2020/12/6 0:47
 * <p>
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * <p>
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * <p>
 * 注意：给定 n 是一个正整数。
 * <p>
 * 示例 1：
 * <p>
 * 输入： 2
 * 输出： 2
 * 解释： 有两种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶
 * 2.  2 阶
 * 示例 2：
 * <p>
 * 输入： 3
 * 输出： 3
 * 解释： 有三种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶 + 1 阶
 * 2.  1 阶 + 2 阶
 * 3.  2 阶 + 1 阶
 */
public class Question_70 {
    public static int climbStairs(int n) {
        /*
         * f(x) = f(x-1)+f(x-2)
         * 动态规划题
         * */
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int count = 0;//多少种方法
        int q = 1;
        int p = 2;
        for (int i = 3; i <= n; i++) {
            count = q + p;
            q = p;
            p = count;
        }
/*
        //斐波那契数列的通项公式
        if (n == 0)
            return 1;
        if (n == 1 || n == 2)
            return n;
        int result = (int) Math.floor(
                1 / Math.sqrt(5) * (Math.pow((1 + Math.sqrt(5)) / 2, n + 1) - Math.pow((1 - Math.sqrt(5)) / 2, n + 1)));
        return result;
        * */
        return count;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }

}
