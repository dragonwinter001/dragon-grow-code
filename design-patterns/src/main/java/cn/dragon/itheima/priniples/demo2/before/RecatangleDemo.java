package cn.dragon.itheima.priniples.demo2.before;

/**
 * @ClassName: RecatangleDemo
 * @Description: TODO
 * @Date: 2022/5/2 22:51
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

        System.out.println("+++++++++++++++++++++++++");

        Square square = new Square();
        square.setLength(10);
        resize(square);
        printLengthAndWidth(square);

    }

    public static void resize(Recatangle recatangle ){
        //判断宽如果比长小,进行拓宽的操作
        while (recatangle.getWidth()<=recatangle.getLength()){
             recatangle.setWidth(recatangle.getWidth()+1);
        }
    }

    //打印长和宽

    public static void printLengthAndWidth(Recatangle recatangle){
        System.out.println(recatangle.getLength());
        System.out.println(recatangle.getWidth());
    }
}
