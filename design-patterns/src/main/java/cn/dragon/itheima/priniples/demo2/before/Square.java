package cn.dragon.itheima.priniples.demo2.before;

/**
 * @ClassName: Square
 * @Description: 正方形类
 * @Date: 2022/5/2 22:47
 * @Author: chj
 * @Version: 1.0
 */
public class Square extends Recatangle {

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }
}
