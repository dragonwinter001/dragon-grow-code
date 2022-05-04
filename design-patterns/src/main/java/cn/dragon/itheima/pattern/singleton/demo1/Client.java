package cn.dragon.itheima.pattern.singleton.demo1;

/**
 * @ClassName: Client
 * @Description: TODO
 * @Date: 2022/5/3 10:14
 * @Author: chj
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        //创建Singletion 对象
        Singletion instance = Singletion.getInstance();
        Singletion instance1 = Singletion.getInstance();
        //判断获取的俩个是否是同一个对象
        //==比较的内存地址
        System.out.println(instance==instance1);
    }
}
