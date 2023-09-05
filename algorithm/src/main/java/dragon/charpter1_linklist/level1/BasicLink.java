package dragon.charpter1_linklist.level1;


/**
 * @ClassName: BasicLink
 * @Description: 链表实例，用于怎么演示JVM怎么构造链表的
 * @Date: 2023/9/5 15:06
 * @Author: chj
 * @Version: 1.0
 */
public class BasicLink {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8};

    }


    /**
     * 数组添加到链表里，遍历先处理头节点，再利用cur处理一个个next添加
     * @param array
     * @return
     */
    static Node initLinkedList(int[] array){
        Node head = null, cur = null;
        for (int i = 0; i < array.length; i++) {
            Node newNode = new Node(array[i]);
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
    static class Node{
        public int val;
        public Node next;

        public Node(int x) {
            this.val = x;
            this.next = null;
        }
    }
}
