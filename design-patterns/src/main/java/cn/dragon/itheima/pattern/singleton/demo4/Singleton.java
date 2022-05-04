package cn.dragon.itheima.pattern.singleton.demo4;

import com.sun.xml.internal.bind.v2.TODO;

/**
 * @ClassName: Singleton
 * @Description: 双重检查锁方式
 * @Date: 2022/5/3 10:41
 * @Author: chj
 * @Version: 1.0
 */
public class Singleton {

    //私有构造方法
    private Singleton(){

    }

    //声明Singlton类型变量,volatile保持指令排序可见性和有序性,这里指有序性
    //TODO 为什么会出现空指针情况

    private static volatile Singleton intance;

    //对外提供公共的访问方式
    public static Singleton getInstance(){
        //第一次判断,如果instance不为null,不需要抢占锁,直接放回对象
        if (intance ==null){
            synchronized (Singleton.class){
                if (intance ==null){
                    intance = new Singleton();
                }
            }
        }
        return intance;
    }
}
