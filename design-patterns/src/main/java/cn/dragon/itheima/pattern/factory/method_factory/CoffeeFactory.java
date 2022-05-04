package cn.dragon.itheima.pattern.factory.method_factory;

/**
 * @ClassName: CoffeeFactory
 * @Description: 抽象工厂角色
 * @Date: 2022/5/3 16:21
 * @Author: chj
 * @Version: 1.0
 */
public interface CoffeeFactory {
    //创建咖啡对象的方法
    Coffee createCoffee();
}
