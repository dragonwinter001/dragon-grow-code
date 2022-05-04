package cn.dragon.itheima.pattern.singleton.demo8;

import java.lang.reflect.Constructor;

/**
 * @ClassName: Client
 * @Description: 测试使用反射破坏单例模式
 * @Date: 2022/5/3 14:54
 * @Author: chj
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) throws Exception {
        //1 获取Singleton 的字节码对象
         Class clazz= Singleton.class;
         //获取无参构造方法
        Constructor cons = clazz.getDeclaredConstructor();
        //取消访问检查
        cons.setAccessible(true);
        //创建Singleton对象
        Singleton s1 = (Singleton) cons.newInstance();
        Singleton s2 = (Singleton) cons.newInstance();
        System.out.println(s1==s2);//如果返回的true 说明并没用破坏单例模式 如果是false ,说明破坏了单例模式







    }
}
