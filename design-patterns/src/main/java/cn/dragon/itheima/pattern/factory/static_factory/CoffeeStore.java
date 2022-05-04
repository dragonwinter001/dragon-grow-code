package cn.dragon.itheima.pattern.factory.static_factory;

/**
 * @ClassName: CoffeeStore
 * @Description: TODO
 * @Date: 2022/5/3 15:43
 * @Author: chj
 * @Version: 1.0
 */
public class CoffeeStore {

    public Coffee orderCoffee(String type){
        Coffee coffee = SimpleCoffeeFactory.createCoffee("latte");
        coffee.addMilk();
        coffee.addSuger();
        return coffee;
    }

}
