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
    void push(E e);
    E pop();
    E peek();
}
