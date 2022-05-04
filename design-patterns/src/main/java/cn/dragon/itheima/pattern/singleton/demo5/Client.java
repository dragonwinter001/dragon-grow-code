package cn.dragon.itheima.pattern.singleton.demo5;


/**
 * @ClassName: Client
 * @Description: TODO
 * @Date: 2022/5/3 10:45
 * @Author: chj
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance==instance1);

    }
}
