package cn.dragon.itheima.pattern.factory.config_factory;

import java.sql.ParameterMetaData;

/**
 * @ClassName: Client
 * @Description: TODO
 * @Date: 2022/5/3 17:55
 * @Author: chj
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Coffee american = CoffeeFactory.createCoffee("american");
        System.out.println(american.getName());
        System.out.println("----------------------");
        Coffee latte = CoffeeFactory.createCoffee("latte");
        System.out.println(latte.getName());
    }
}
