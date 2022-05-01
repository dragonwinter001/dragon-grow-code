package cn.arrays;

/**
 * @ClassName: Array
 * @Description: TODO
 * @Date: 2022/5/1 18:30
 * @Author: chj
 * @Version: 1.0
 */
public class Array<E> {
    private E[] data;
    private int size;

    public Array(int capacity) {
        data = (E[])new Object[capacity];
        size = 0;
    }

    //获取数组容量
    public int getCapacity(){
        return data.length;
    }

    //获取元素中的个数
    public int getSize(){
        return size;
    }


    //返回数组是否为空
    public boolean isEmpty(){
        return size == 0;
    }

    //添加元素
    public void add(int index ,E e){
        if (index <0 || index >size){
            throw new IllegalArgumentException("Add failed. Require index > 0 and index <=size");
        }
        if (size == data.length){
            resize(2*data.length);
        }
        for (int i = size-1; i >=index ; i--) {
            data[i+1] = data[i];
        }
        data[index] = e;
        size++;
    }

    //在所有元素之后添加一个元素
    public void addLast(int index ,E e){
        add(size,e);
    }



    //在所有元素之前添加一个元素
    public void addFirst(int index ,E e){
        add(0,e);
    }

    //获取index索引位置的元素
    public E get(int index){
        if(index < 0 || index >= size) {
            throw new IllegalArgumentException("Get failed. Index is illegal.");
        }
        return data[index];
    }


    //修改index索引的元素
    public void set(int index,E e){
        if(index < 0 || index >= size) {
            throw new IllegalArgumentException("Set failed. Index is illegal.");
        }
        data[index] = e;
    }

    //查找数组中是否有元素e
    public boolean contains(E e){
        for (int i = 0; i < size; i++) {
            if (data[i] == e){
                return true;
            }
        }
        return false;
    }

    // 查找数组中元素e所在的索引，如果不存在元素e，则返回-1
    public int find(E e){
        for (int i = 0; i < size; i++) {
            if (data[i] == e){
                return i;
            }
        }
        return -1;
    }

    // 从数组中删除index位置的元素, 返回删除的元素
    public E remove(int index){
        if (index <0 || index >size){
            throw new IllegalArgumentException("Remove failed. Require index > 0 and index <=size");
        }
        E ret = data[index];
        for (int i = index+1; i < size; i++) {
            data[i-1] = data[i];
        }
        size--;
        data[size] = null;
        //均摊复杂度
        if(size == data.length / 4 && data.length / 2 != 0) {
            resize(data.length / 2);
        }
        return ret;
    }


    // 从数组中删除第一个元素, 返回删除的元素
    public E removeFirst(){
       return remove(0);
    }


    // 从数组中删除最后一个元素, 返回删除的元素
    public E removeLast(){
        return remove(size);
    }

    // 从数组中删除元素e


    // 将数组空间的容量变成newCapacity大小
    private void resize(int newCapacity){
       E[] newData =  (E[])new Object[newCapacity];
        for (int i = 0; i <size ; i++) {
            newData[i] =data[i];
        }
       data = newData;
    }
}
