package cn.dragon.itheima.priniples.demo2.after;

/**
 * @ClassName: RecatangleDemo
 * @Description: TODO
 * @Date: 2022/5/2 23:08
 * @Author: chj
 * @Version: 1.0
 */
public class RecatangleDemo {
    public static void main(String[] args) {
        //创建长方型对象
        Recatangle recatangle = new Recatangle();
        recatangle.setLength(20);
        recatangle.setWidth(10);

        resize(recatangle);
        printLengthAndWidth(recatangle);
    }

    public static void resize(Recatangle recatangle) {
        //判断宽如果比长小,进行拓宽的操作
        while (recatangle.getWidth()<=recatangle.getLength()){
            recatangle.setWidth(recatangle.getWidth()+1);
        }
    }

    public static void printLengthAndWidth(Quarilateral quarilateral){
        System.out.println(quarilateral.getLength());
        System.out.println(quarilateral.getWidth());
    }
}
