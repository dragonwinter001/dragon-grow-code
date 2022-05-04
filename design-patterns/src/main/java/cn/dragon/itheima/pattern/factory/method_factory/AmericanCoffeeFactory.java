package cn.dragon.itheima.pattern.factory.method_factory;

/**
 * @ClassName: AmericanCoffeeFactory
 * @Description: 美式咖啡工厂对象,专门用来生产美式咖啡
 * @Date: 2022/5/3 16:23
 * @Author: chj
 * @Version: 1.0
 */
public class AmericanCoffeeFactory implements CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
