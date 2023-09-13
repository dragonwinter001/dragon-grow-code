package dragon.charpter1_linklist.level2.topic2_3合并有序链表;

/**
 * @ClassName: MergeList
 * @Description: 合并两个有序链表 leetcode 21
 * @Date: 2023/9/12 14:02
 * @Author: chj
 * @Version: 1.0
 */
public class MergeList {
      static class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newHead = new ListNode(-1);
        ListNode res = newHead;
        if(list1==null && list2!=null){
            return list2;
        }
        if(list1!=null && list2==null){
            return list1;
        }
        while (list1!=null || list2!=null){
            //情况1 都不为空的情况
            if (list1!=null && list2!=null){
                if (list1.val<list2.val){
                    newHead.next = list1;
                    list1 =list1.next;
                }else if (list1.val>list2.val){
                    newHead.next = list2;
                    list2 = list2.next;
                }else{//相等的情况，分别接两个链表
                    newHead.next = list2;
                    list2 = list2.next;
                    newHead=  newHead.next;
                    newHead.next= list1;
                    list1 = list1.next;
                }
                newHead=  newHead.next;
                //情况2 有一个链表为空的情况
            }else if (list1!=null && list2==null){
                newHead.next = list1;
                list1 = list1.next;
                newHead =  newHead.next;
            }else if (list2!=null && list1==null){
                newHead.next = list2;
                list2 = list2.next;
                newHead =  newHead.next;
            }
        }
        return res.next;
    }
}
