package com.my_leetcode.eg_array;

/**
 * @author ：hyj
 * @description：
 * @date ：Created in 2020/12/7 10:21
 *
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 示例 1:
 *
 * 输入: 123
 * 输出: 321
 *  示例 2:
 *
 * 输入: -123
 * 输出: -321
 * 示例 3:
 *
 * 输入: 120
 * 输出: 21
 * 注意:
 *
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 *
 */
public class Question_7 {
    public int reverse(int x) {
        //自解String
        /*boolean flag =false;
        if (x<0){
            flag = true;
        }
        StringBuffer s = new StringBuffer(String.valueOf(x));
        StringBuffer reverse = s.reverse();
        String y = reverse.toString();
        if (y.charAt(y.length()-1)=='-'){
            y = y.replace("-","");
        }
        try {
            int z = Integer.valueOf(y);
            if (flag){
                z = -z;
            }
            return z;
        }catch (Exception e){
            return 0;
        }*/
        //算术解法：除以10取余数
        int rev = 0;
        int pop = 0;
        while (x != 0) {
            pop =  (x % 10);
            x = x / 10;
            if (rev>Integer.MAX_VALUE/10 || (rev==Integer.MAX_VALUE/10 && pop>7)){
                return 0;
            }
            if (rev<Integer.MIN_VALUE/10 || (rev==Integer.MIN_VALUE/10 && pop< -8)){
                return 0;
            }
            rev = rev * 10 +pop;
        }
        return rev;
    }


    public static void main (String[] args){
        Question_7 q7 = new Question_7();
        System.out.println(q7.reverse(123));
    }
}
