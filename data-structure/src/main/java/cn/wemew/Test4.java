package cn.wemew;

/**
 * @ClassName: Test4
 * @Description: TODO
 * @Date: 2022/5/6 03:28
 * @Author: chj
 * @Version: 1.0
 */
public class Test4 {
    public static void main(String[] args){
        System.out.println(factorial(3));
    }
    public static int factorial(int n){
        if(n < 1) {
            return 1;
        }
        return factorial(n-1) * n;
    }
}
