package cn.dragon.itheima.pattern.singleton.demo7;

import java.io.Serializable;

/**
 * @ClassName: Singleton
 * @Description: 静态内部类
 * @Date: 2022/5/3 10:51
 * @Author: chj
 * @Version: 1.0
 */
public class Singleton implements Serializable {
    private Singleton(){

    }

    //定义一个静态内部类
    private static class SingletonHolder{
        private static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHolder.instance;
    }

    //当进行反序列化时将自动调用该方法,将该方法返回值直接放回
    public Object readResolve(){
        return SingletonHolder.instance;
    }
}
