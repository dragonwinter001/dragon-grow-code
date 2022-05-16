package cn.linkedList;

/**
 * @ClassName: Solution
 * @Description: TODO
 * @Date: 2022/5/13 22:11
 * @Author: chj
 * @Version: 1.0
 */
public class Solution {
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

    public ListNode removeElements(ListNode head, int val) {
        if (head!=null && head.val ==val){
            head = head.next;
        }
        if (head ==null){
            return null;
        }
        ListNode pre = head;
        while (pre.next!=null){
            if (pre.next.val == val){
                pre.next = pre.next.next;
            }else{
                pre = pre.next;
            }
        }
        return head;
    }
}
