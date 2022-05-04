package cn.dragon.itheima.pattern.factory.abstract_factory;


/**
 * @ClassName: AmericanCoffeeFactory
 * @Description: 美国甜品工厂类,生产美式咖啡和抹茶慕斯
 * @Date: 2022/5/3 17:15
 * @Author: chj
 * @Version: 1.0
 */
public class AmericanCoffeeFactory implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchMousse();
    }
}
