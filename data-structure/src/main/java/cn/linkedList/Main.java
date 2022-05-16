package cn.linkedList;

/**
 * @ClassName: Main
 * @Description: TODO
 * @Date: 2022/5/13 21:13
 * @Author: chj
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            linkedList.addFirst(i);
            System.out.println(linkedList);
        }
        linkedList.add(2,666);
        System.out.println(linkedList);
    }
}
