package cn.stacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @ClassName: Main
 * @Description: TODO
 * @Date: 2022/5/1 19:45
 * @Author: chj
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
        Stack<String> objects = new Stack<>();
        objects.add("a");
        objects.add("b");
        objects.add("c");
        String str = null;
         str = objects.peek();
        System.out.println(str);
        System.out.println("---------------");
         str= objects.peek();
        System.out.println(str);
        System.out.println("---------------");
         str = objects.peek();
        System.out.println(str);
        System.out.println("---------------");
        objects.forEach(e-> System.out.println(e));
    }
}
