package cn.stacks;

import java.util.Stack;

/**
 * @ClassName: Leetcode23
 * @Description: Leetcode 23 题
 *  给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合
 *
 * 示例 1：
 *
 * 输入：s = "()"
 * 输出：true
 * 示例 2：
 *
 * 输入：s = "()[]{}"
 * 输出：true
 * 示例 3：
 *
 * 输入：s = "(]"
 * 输出：false
 * 示例 4：
 *
 * 输入：s = "([)]"
 * 输出：false
 * 示例 5：
 *
 * 输入：s = "{[]}"
 * 输出：true
 *
 * @Date: 2022/5/1 20:13
 * @Author: chj
 * @Version: 1.0
 */
public class Leetcode23 {

    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c=='('|| c=='{'||c=='['){
                stack.push(c);
            }else {
                if (stack.empty()){
                    return false;
                }
                char topChar = stack.pop();
                if (c=='(' && topChar!=')'){
                    return false;
                }
                if (c=='{' && topChar!='}'){
                    return false;
                }
                if (c=='[' && topChar!=']'){
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
