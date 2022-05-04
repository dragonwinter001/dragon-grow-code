package cn.dragon.itheima.priniples.demo2.after;

/**
 * @ClassName: Square
 * @Description: 正方形
 * @Date: 2022/5/2 23:05
 * @Author: chj
 * @Version: 1.0
 */
public class Square implements  Quarilateral{

    private  double side;
    @Override
    public double getWidth() {
        return side;
    }

    @Override
    public double getLength() {
        return side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
