package dragon.charpter1_linklist.level2.topic2_2回文序列;

import java.util.Stack;

/**
 * @ClassName: IsPalindromic
 * @Description: LeetCode 234  判断一个链表是否为回文链表
 * @Define  回文链表是指正着和倒着遍历链表得到的序列相同,例如1 -> 2 -> 3 -> 2 -> 1就是一个回文链表
 * @Date: 2023/9/5 18:14
 * @Author: chj
 * @Version: 1.0
 */
public class IsPalindromic {


     public class ListNode {
         int val;
         ListNode next;
         ListNode() {
         }

         ListNode(int val) {
             this.val = val;
         }

         ListNode(int val, ListNode next) {
             this.val = val;
             this.next = next;
         }
     }

    public boolean isPalindrome(ListNode head) {
         ListNode temp = head;
        Stack<Integer> stack = new Stack<>();
        //把链表阶段存放到栈中
        while (temp!=null){
            stack.push(temp.val);
            temp = temp.next;
        }
        //把链表阶段存放到栈中
        while (head!=null){
            if (head.val!=stack.pop()){
                return false;
            }
            head =  head.next;
        }
        return true;
    }


}
