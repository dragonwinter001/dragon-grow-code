package cn.stacks;

/**
 * @ClassName: Stack
 * @Description: TODO
 * @Date: 2022/5/1 19:58
 * @Author: chj
 * @Version: 1.0
 */
public interface Stack<E> {
    int getSize();
    boolean isEmpty();
    /*
    添加元素
     */
    void push(E e);
    /*
    出栈
     */
    E pop();
    /*
      查看栈顶元素
     */
    E peek();
}
