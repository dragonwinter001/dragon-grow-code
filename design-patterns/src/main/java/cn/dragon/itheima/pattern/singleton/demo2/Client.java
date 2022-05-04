package cn.dragon.itheima.pattern.singleton.demo2;

/**
 * @ClassName: Client
 * @Description: TODO
 * @Date: 2022/5/3 10:21
 * @Author: chj
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Singletion instance = Singletion.getInstance();
        Singletion instance1 = Singletion.getInstance();
        System.out.println(instance==instance1);
    }
}
