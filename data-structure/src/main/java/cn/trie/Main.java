package cn.trie;

import cn.queues.ArrayQueue;

/**
 * @ClassName: Main
 * @Description: TODO
 * @Date: 2022/5/5 22:50
 * @Author: chj
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        String[] arr = new String[]{"abc","bd","df","ea"};
        //添加到前缀树 arr有重复可以去重
        Trie trie = new Trie();
        for (int i = 0; i < arr.length; i++) {
            trie.add(arr[i]);
        }
        //过滤

        ArrayQueue<String> aababccbc = trie.filter("aabcbc");
        System.out.println(aababccbc.getFront());
    }
}
