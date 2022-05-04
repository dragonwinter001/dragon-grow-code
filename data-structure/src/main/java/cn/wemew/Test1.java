package cn.wemew;


import java.util.Queue;
import java.util.Scanner;

/**
 * @ClassName: Test1
 * @Description:假设有一个数组：{“abc”,”bd”,”df”,”ea”,”......”}任意多个,现要求输入:
 * 任意字符串, 包含数组里的元素屏蔽.即
 * 输入: abcdefgeab,输出:***defg**b.
 * 输入:aabcbc.输出: ****** 解释:(包含了(abc)屏蔽完又是abc 又需要屏蔽)
 * 输入:aababccbc.输出: *********.
 * @Date: 2022/4/26 18:07
 * @Author: chj
 * @Version: 1.0
 */
public class Test1 {

    public static void main(java.lang.String[] args) {
        Scanner sc = new Scanner(System.in);
        //输入
        String str = sc.next();
        //数组
        String[] arr =new String[]{"abc","bd","df","ea4"};
        for (String s : arr) {
            if (str.contains(s)){
                String s1 = str.replaceAll(s, "***");
                System.out.println(s1);
                return;
            }
        }


    }

}
