package cn.stacks;

/**
 * @ClassName: ArrayStack
 * @Description: 栈:先进后出
 * @Date: 2022/5/1 19:58
 * @Author: chj
 * @Version: 1.0
 */
public class ArrayStack<E> implements Stack<E> {
    private Array<E> array;

    public ArrayStack(int capacity){
        array = new Array<>(capacity);
    }

    public ArrayStack(){
        array = new Array<>();
    }

    @Override
    public int getSize(){
        return array.getSize();
    }

    @Override
    public boolean isEmpty(){
        return array.isEmpty();
    }
    //栈中添加一个元素 入栈
    @Override
    public void push(E e){
        array.addLast(e);
    }

    public int getCapacity(){
        return array.getCapacity();
    }

    //栈中取出一个元素 出栈
    @Override
    public E pop(){
        return array.removeLast();
    }

    //查看栈顶元素
    @Override
    public E peek(){
        return array.getLast();
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("Stack: ");
        res.append('[');
        for(int i = 0 ; i < array.getSize() ; i ++){
            res.append(array.get(i));
            if(i != array.getSize() - 1) {
                res.append(", ");
            }
        }
        res.append("] top");
        return res.toString();
    }
}
