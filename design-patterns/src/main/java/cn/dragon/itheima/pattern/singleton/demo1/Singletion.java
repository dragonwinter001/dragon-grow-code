package cn.dragon.itheima.pattern.singleton.demo1;

/**
 * @ClassName: Singletion
 * @Description: 饿汉式:静态成员变量 类加载就会导致该单例实例对象被创建
 * @Date: 2022/5/3 10:10
 * @Author: chj
 * @Version: 1.0
 */
public class Singletion {
    //1 私有构造方法
    private Singletion(){

    }

    //2 在本类中创建本类的对象
    private static Singletion instance = new Singletion();

    //3 提供一个公共的访问方式让外界获取该对象

    public static Singletion getInstance(){
        return instance;
    }


}
