package cn.dragon.itheima.pattern.factory.config_factory;


import java.util.*;

/**
 * @ClassName: Test
 * @Description: 假设有一个数组：{“abc”,”bd”,”df”,”ea”,”......”}任意多个,现要求输入:
 * 任意字符串,包含数组里的元素屏蔽.即
 * 输入: abcdefgeab,输出:***defg**b.
 * 输入:aabcbc.输出: ****** 解释:(包含了(abc)屏蔽完又是abc 又需要屏蔽)
 * 输入:aababccbc.输出: *********.
 * @Date: 2022/5/3 20:07
 * @Author: chj
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        String[] arr =  new String[]{"abc","bd","df","ea"};
        System.out.println(replaceString("aabcbc",arr,"aabcbc","aabcbc".length()));
    }

    /**
     * @return
     */
    public static String replaceString(String str, String[] arr,String strabk,int length) {
        List<String> list = Arrays.asList(arr);
        String word = null;
        //是否包含
        boolean has = false;
        for (String s : list) {
            String replaceString = "";
            if (str.contains(s)){
                has = true;
                word = s;
                for (int i = 0; i < word.length(); i++) {
                    replaceString+="*";
                }
                str = str.replaceAll(word, replaceString);
            }
        }
        if (!has && !str.equals("")){
            //不包含直接返回
            return strabk;
        }else if (!has && str.equals("")){
            //处理全为*的情况
            for (int i = 0; i < length; i++) {
                str+="*";
            }
            return str;
        }else{
            //递归
            strabk =  str;
            StringBuilder replace = new StringBuilder(str.replace("*", ""));
            return replaceString(replace.toString(), arr,strabk,length);
        }
    }
}
