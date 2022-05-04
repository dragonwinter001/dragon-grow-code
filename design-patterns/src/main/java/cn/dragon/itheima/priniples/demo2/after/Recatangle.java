package cn.dragon.itheima.priniples.demo2.after;

/**
 * @ClassName: Recatangle
 * @Description: TODO
 * @Date: 2022/5/2 23:07
 * @Author: chj
 * @Version: 1.0
 */
public class Recatangle implements Quarilateral{

    private double length;
    private double width;

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
