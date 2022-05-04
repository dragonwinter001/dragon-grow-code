package cn.dragon.itheima.pattern.factory.abstract_factory;

/**
 * @ClassName: Client
 * @Description: TODO
 * @Date: 2022/5/3 17:20
 * @Author: chj
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        ItalyDessertFactory dessertFactory = new ItalyDessertFactory();
        Dessert dessert = dessertFactory.createDessert();
        Coffee coffee = dessertFactory.createCoffee();
        System.out.println(coffee.getName());
        dessert.show();
    }
}
