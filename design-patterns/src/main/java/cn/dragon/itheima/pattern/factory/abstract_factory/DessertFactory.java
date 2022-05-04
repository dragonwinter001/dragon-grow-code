package cn.dragon.itheima.pattern.factory.abstract_factory;

/**
 * @ClassName: DessertFactory
 * @Description: TODO
 * @Date: 2022/5/3 17:13
 * @Author: chj
 * @Version: 1.0
 */
public interface DessertFactory {
    //生产咖啡的功能
     Coffee createCoffee();
    //生产甜品的功能
     Dessert createDessert();
}
