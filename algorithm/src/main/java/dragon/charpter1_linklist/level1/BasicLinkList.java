package dragon.charpter1_linklist.level1;

/**
 * @ClassName: BasicLinkList
 * @Description: 构造链表，使用静态类部类，实现天机和删除元素功能
 * @Date: 2023/9/5 15:25
 * @Author: chj
 * @Version: 1.0
 */
public class BasicLinkList {


     static class Node{
         int data;
         Node next;
     }

    /**
     * 遍历链表
     */
    public static int getLength(Node head){
        int length = 0;
        Node node = head;
        while (node!=null){
            length++;
            node = head.next;
        }
        return length;
    }

    /**
     * 链表插入
     */

    public static Node insertFirst(Node head,Node nodeInsert,int position){
        if (head == null){
            return nodeInsert;
        }
        int size = getLength(head);
        if (position > size + 1 || position < 1) {
            System.out.println("位置参数越界");
            return head;
        }
        if (position ==1){
            nodeInsert.next = head;
            return head;
        }
        int count = 0;
        Node pNode = head;
        while (count<position-1){
            pNode = head.next;
            count++;
        }
         nodeInsert.next= pNode.next;
            pNode.next = nodeInsert;
        return head;
    }

    /**
     * 链表删除 头中后
     */

    public static Node deleteNode(Node head,int position){
        if (head == null){
            return null;
        }
        int size = getLength(head);
        if (position > size + 1 || position < 1) {
            System.out.println("位置参数越界");
            return head;
        }
        if (position ==1){
            return head.next;
        }else{
            int count = 0;
            Node cur = head;
          while (count<position-1){
              cur = head.next;
              count++;
          }
          head.next = cur.next.next;
          return head;
        }
    }
}
