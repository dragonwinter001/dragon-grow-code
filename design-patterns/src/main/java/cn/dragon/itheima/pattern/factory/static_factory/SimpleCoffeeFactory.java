package cn.dragon.itheima.pattern.factory.static_factory;


/**
 * @ClassName: SimpleCoffeeFactory
 * @Description: 简单的咖啡工厂,专门用来生产咖啡
 * @Date: 2022/5/3 16:01
 * @Author: chj
 * @Version: 1.0
 */
public class SimpleCoffeeFactory {


    public static Coffee createCoffee(String type){
        Coffee coffee = null;
        if ("american".equals(type)){
            coffee = new AmericanCoffee();

        }else if ("latte".equals(type)){
            coffee = new LatteCoffee();
        }else{
            throw new RuntimeException("对不起,您所点的咖啡没有");
        }
        return coffee;
    }
}
