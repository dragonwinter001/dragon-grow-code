package cn.dragon.itheima.pattern.factory.method_factory;

/**
 * @ClassName: LatteCoffeeFactory
 * @Description: 拿铁咖啡工厂对象,专门用来生产拿铁咖啡
 * @Date: 2022/5/3 16:24
 * @Author: chj
 * @Version: 1.0
 */
public class LatteCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
