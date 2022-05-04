package cn.dragon.itheima.pattern.factory.after;

/**
 * @ClassName: Client
 * @Description: TODO
 * @Date: 2022/5/3 15:47
 * @Author: chj
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        //1 创建咖啡店类
        CoffeeStore coffeeStore = new CoffeeStore();
        //2 点咖啡
        Coffee latter = coffeeStore.orderCoffee("american");
        System.out.println(latter.getName());
    }
}
