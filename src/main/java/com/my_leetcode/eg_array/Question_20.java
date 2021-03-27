package com.my_leetcode.eg_array;

import java.util.Stack;

/**
 * @author ：hyj
 * @description：
 * @date ：Created in 2020/12/8 23:43
 *
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 * 示例 1:
 *
 * 输入: "()"
 * 输出: true
 * 示例 2:
 *
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 *
 * 输入: "(]"
 * 输出: false
 * 示例 4:
 *
 * 输入: "([)]"
 * 输出: false
 * 示例 5:
 *
 * 输入: "{[]}"
 * 输出: true
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Question_20 {
    public boolean isValid(String s){
        /*if (s.length()%2!=0){
            return false;
        }
        int length = s.length();
        Map<Character, Character> pairs = new HashMap<Character, Character>() {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};
        Deque<Character> stack = new LinkedList<Character>();
        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            if (pairs.containsKey(ch)) {
                if (stack.isEmpty() || stack.peek() != pairs.get(ch)) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();*/
        if (s.isEmpty()||s.length()%2!=0){
            return false;
        }
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c=='('){
                stack.push(')');
            } else if (c=='{'){
                stack.push('}');
            }else if (c=='['){
                stack.push(']');
            } else if (stack.empty()||c!=stack.pop()){
                return false;
            }
        }

        return stack.empty();
    }

    public static void main(String[] args){
        Question_20 q20 = new Question_20();
        System.out.println(q20.isValid("[]{}()"));
    }
}
