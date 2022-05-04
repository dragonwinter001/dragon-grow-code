package cn.dragon.itheima.pattern.factory.abstract_factory;

/**
 * @ClassName: ItalyDessertFactory
 * @Description: 意大利甜品工厂,生产拿铁和提拉米苏
 * @Date: 2022/5/3 17:18
 * @Author: chj
 * @Version: 1.0
 */
public class ItalyDessertFactory implements DessertFactory {
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Trimisu() ;
    }
}
