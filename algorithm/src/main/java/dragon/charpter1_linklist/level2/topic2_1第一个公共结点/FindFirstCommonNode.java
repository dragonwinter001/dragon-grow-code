package dragon.charpter1_linklist.level2.topic2_1第一个公共结点;


import java.util.*;

/**
 * @ClassName: FindFirstCommonNode
 * @Description: 两个链表的第一个公共子节点 important 公共子节点 第一个！  剑指offer 52题
 * @Date: 2023/9/5 16:15
 * @Author: chj
 * @Version: 1.0
 */
public class FindFirstCommonNode {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        int[] a = {2,3,4,5};
        int[] b = {1,2,6};
        ListNode aNode = initLinkedList(a);
        ListNode bNode = initLinkedList(b);
    }

    /*
     * 暴力破解
     */
    ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        ListNode currA = headA;
        while (currA!=null){
            ListNode currB= headB;
            while (currB!=null){
                if (currA==currB){
                    return currA;
                }
                currB = currB.next;
            }
            currA = currA.next;
        }
        return null;
    }

    /*
     * 使用集合
     */
    ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        while (headA!=null){
            set.add(headA);
            headA = headA.next;
        }
        while (headB!=null){
            if (set.contains(headB)){
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }

    /*
     * 使用集合
     */
    ListNode getIntersectionNode3(ListNode headA, ListNode headB) {
        List<ListNode> list = new ArrayList<>();
        while (headA!=null){
            list.add(headA);
            headA = headA.next;
        }
        while (headB!=null){
            if (list.contains(headB)){
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }

    /*
     * 使用栈 开始都是相等的，相等的然后删除，找到不同的breck跳出 那个地方的上一个就是对应的节点
     * 栈特点：后进先出
     */

    ListNode getIntersectionNode4(ListNode headA, ListNode headB) {
        Stack<ListNode> stackA = new Stack<ListNode>();
        Stack<ListNode> stackB = new Stack<ListNode>();
        while (headA!=null){
            stackA.add(headA);
            headA = headA.next;
        }
        while (headB!=null){
            stackB.add(headB);
            headB = headB.next;
        }
        ListNode preNode = null;
        while (stackA.size()>0 && stackB.size()>0){
            if (stackA.peek()== stackB.peek()){//取出栈顶元素比较，但不会删除
                preNode =  stackA.pop();// 会把stackA删除
                stackB.pop();// 会把stackB删除
            }else {
                break;
            }
        }
        return preNode;
    }

    /**
     * 数组添加到链表里，遍历先处理头节点，再利用cur处理一个个next添加
     * @param array
     * @return
     */
    public static ListNode initLinkedList(int[] array){
        ListNode head = null, cur = null;
        for (int i = 0; i < array.length; i++) {
            ListNode newNode = new ListNode(array[i]);
            if (i==0){
                head =newNode;
                cur = newNode;
            }else{
                cur.next = newNode;
                cur = newNode;
            }
        }
        return head;
    }
}
