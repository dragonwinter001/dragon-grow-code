package cn.dragon.itheima.pattern.singleton.demo5;

/**
 * @ClassName: Singleton
 * @Description: 静态内部类
 * @Date: 2022/5/3 10:51
 * @Author: chj
 * @Version: 1.0
 */
public class Singleton {
    private Singleton(){

    }

    //定义一个静态内部类
    private static class SingletonHolder{
        private static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHolder.instance;
    }
}
