package cn.dragon.itheima.pattern.singleton.demo7;

import java.io.*;

/**
 * @ClassName: Client
 * @Description: 测试反射破坏单例模式
 *"C:\Users\Admin\Desktop"
 * @Date: 2022/5/3 11:08
 * @Author: chj
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) throws Exception {
        //writeObject2File();
        readObjcetFromFile();
        readObjcetFromFile();
    }



    //文件中写入数据
    public static void writeObject2File() throws Exception {
        //1获取Singleton对象
        Singleton instance = Singleton.getInstance();
        //2 创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Admin\\Desktop\\a.txt"));
        //写对象
        oos.writeObject(instance);
        //释放资源
        oos.close();
    }

    //从文件中读取数据

    public static void readObjcetFromFile()throws Exception {
        //1 创建输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Admin\\Desktop\\a.txt"));

        //2读取对象
        Singleton instance = (Singleton) ois.readObject();
        System.out.println(instance);
    }
}
