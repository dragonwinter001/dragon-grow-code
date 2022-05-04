package cn.dragon.itheima.pattern.factory.after;

/**
 * @ClassName: CoffeeStore
 * @Description: TODO
 * @Date: 2022/5/3 15:43
 * @Author: chj
 * @Version: 1.0
 */
public class CoffeeStore {
    public Coffee orderCoffee(String type){
        //声明coffer 类型的变量,根据不通类型创建不同coffee创建子类独享
        Coffee coffee = null;
        if ("american".equals(type)){
            coffee = new AmericanCoffee();

        }else if ("latte".equals(type)){
            coffee = new LatteCoffee();
        }else{
            throw new RuntimeException("对不起,您所点的咖啡没有");
        }

        coffee.addMilk();
        coffee.addSuger();
        return coffee;
    }

}
