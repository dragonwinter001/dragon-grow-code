package dragon.charpter1_linklist.level2.topic2_4合并两个链表;

/**
 * @ClassName: LeetCode1669
 * @Description: 给你两个链表 list1 和 list2 ，它们包含的元素分别为 n 个和 m 个。
 *
 * 请你将 list1 中下标从 a 到 b 的全部节点都删除，并将list2 接在被删除节点的位置。
 * @Date: 2023/9/13 14:27
 * @Author: chj
 * @Version: 1.0
 */
public class MergeTwoList {


    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode listNode = new ListNode();
        int num = 0;
        while (list2.next!=null){
            num++;
            if (num == a){

            }
        }
        return list2;
    }
}
