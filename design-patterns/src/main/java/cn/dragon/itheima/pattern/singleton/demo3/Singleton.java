package cn.dragon.itheima.pattern.singleton.demo3;


/**
 * @ClassName: Singleton
 * @Description:懒汉
 * @Date: 2022/5/3 10:24
 * @Author: chj
 * @Version: 1.0
 */
public class Singleton {
    private Singleton(){

    }

    private static Singleton instance;


    //对外提供访问方法
    public static synchronized Singleton getInstance(){
        //判断instance 是否为null,如果为null,说明还没用创建Singleton类的对象
        if (instance==null){
            //线程1 等待,线程2 获取到cpu的执行权,也会进行到该判断里面
            instance = new Singleton();
        }
        return instance;
    }

}
