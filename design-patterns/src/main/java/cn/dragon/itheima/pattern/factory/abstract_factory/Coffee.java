package cn.dragon.itheima.pattern.factory.abstract_factory;

/**
 * @ClassName: Coffee
 * @Description: 咖啡类
 * @Date: 2022/5/3 15:40
 * @Author: chj
 * @Version: 1.0
 */
public abstract class Coffee {

    public abstract String getName();

    //加糖
    public void addSuger(){
        System.out.println("加糖");
    }

    //加奶
    public void addMilk(){
        System.out.println("加奶");
    }
}
