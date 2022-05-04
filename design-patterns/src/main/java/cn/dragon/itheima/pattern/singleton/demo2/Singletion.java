package cn.dragon.itheima.pattern.singleton.demo2;

/**
 * @ClassName: Singletion
 * @Description: 饿汉式:静态代码快 类加载就会导致该单例实例对象被创建
 * @Date: 2022/5/3 10:17
 * @Author: chj
 * @Version: 1.0
 */
public class Singletion {
    //私有的构造方法
    private Singletion(){

    }

    //声明Singletion类型的变量
    private static Singletion instance;

    //在静态代码快进行赋值

    static {
        instance = new Singletion();
    }

    public static Singletion getInstance(){
        return instance;
    }
}
