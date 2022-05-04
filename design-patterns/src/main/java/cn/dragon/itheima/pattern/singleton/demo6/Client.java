package cn.dragon.itheima.pattern.singleton.demo6;



/**
 * @ClassName: Client
 * @Description: TODO
 * @Date: 2022/5/3 10:45
 * @Author: chj
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;
        System.out.println(instance==instance1);

    }
}
