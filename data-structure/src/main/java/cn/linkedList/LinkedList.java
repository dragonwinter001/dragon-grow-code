package cn.linkedList;

import javax.xml.soap.Node;

/**
 * @ClassName: LinkedList
 * @Description: TODO
 * @Date: 2022/5/2 14:28
 * @Author: chj
 * @Version: 1.0
 */
public class LinkedList<E> {
    private class Node{
        public E e;
        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public E getE() {
            return e;
        }

        public void setE(E e) {
            this.e = e;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
    private Node head;
    private int size;

    public LinkedList(){
        head = null;
        size = 0;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    // 返回链表是否为空
    public boolean isEmpty(){
        return size == 0;
    }

    //在链表头添加新的元素
    public void add (int index , E e){
        head = new Node(e, head);
        size ++;
    }
}
