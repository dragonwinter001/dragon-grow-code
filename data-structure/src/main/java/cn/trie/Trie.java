package cn.trie;

import cn.queues.ArrayQueue;

import java.util.HashMap;

/**
 * @ClassName: Trie
 * @Description: 前缀树实现
 * @Date: 2022/5/5 22:08
 * @Author: chj
 * @Version: 1.0
 */
public class Trie {
    private static final ArrayQueue<String> queue = new ArrayQueue<>();
    private class Node {
        private boolean isWord;
        private HashMap<Character, Node> next;

        public Node(boolean isWord) {
            this.isWord = isWord;
            next = new HashMap<>();
        }

        public Node() {
            this(false);
        }
    }

    private Node root;
    private int size;

    //获取Trie中存储的单词数量
    public Trie() {
        root = new Node();
        size = 0;
    }

    //获取Trie中存储的单词数量
    public int getTrie() {
        return size;
    }

    //向trie中添加一个新单词word
    public void add(String word){
        Node cur = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (cur.next.get(c)==null){
                cur.next.put(c,new Node());
            }
            cur = cur.next.get(c);
        }
        if (!cur.isWord){
            cur.isWord = true;
            size++;
        }

    }
    public ArrayQueue<String> filter(String text) {

        StringBuilder result = new StringBuilder();

        Node tempNode = root;
        int begin = 0; // 起始位置
        int position = 0; // 当前比较的位置
        while (position < text.length()) {
            char c = text.charAt(position);
            // 遇到*看下一个
            if (isStars(c)) {
                if (tempNode == root) {
                    result.append(c);
                    ++begin;
                }
                ++position;
                continue;
            }
             tempNode = tempNode.next.get(c);

            // 当前位置的匹配结束
            if (tempNode == null) {
                // 以begin开始的字符串不存在敏感词
                result.append(text.charAt(begin));
                // 跳到下一个字符开始测试
                position = begin + 1;
                begin = position;
                // 回到树初始节点
                tempNode = root;
            } else if (tempNode.isWord) {
                // 发现敏感词， 从begin到position的位置用replacement替换掉
                result.append(getReplacement(begin,position));
                position = position + 1;
                begin = position;
                tempNode = root;
            } else {
                ++position;
            }
        }
        result.append(text.substring(begin));
        if (isStrAllThisChar(result.toString())){
            queue.enqueue(result.toString());
            return queue;
        }else if(text.equals(result.toString())){
            queue.enqueue(text);
            return queue;
        } else{
            filter(result.toString());
        }
        queue.enqueue(text);
        return queue;
    }

    private boolean isStars(char c) {
       return '*' == c;
    }

    private String getReplacement(int begin,int position){
        StringBuilder replacement = new StringBuilder();
        for (int i = 0; i <position-begin+1 ; i++) {
            replacement.append("*");
        }
        return replacement.toString();
    }

    public static boolean isStrAllThisChar(String str) {
        int length = getCharCount(str, '*');
        return length == str.length();
    }

    /**
     * 判断一个字符出现的次数
     */
    public static int getCharCount(String str, char c){
        //存放每个字符的数组
        String [] strs = new String[str.length()];
        //计数该字符出现了多少次
        int count = 0;
        //先把字符串转换成数组
        for(int i = 0;i<strs.length;i++){
            strs[i] = str.substring(i,i+1);
        }
        //挨个字符进行查找，查找到之后count++
        for(int i = 0;i<strs.length;i++){
            if(strs[i].charAt(0)==c){
                count++;
            }
        }

        return count;
    }



}
