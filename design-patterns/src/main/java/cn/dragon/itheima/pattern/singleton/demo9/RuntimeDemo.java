package cn.dragon.itheima.pattern.singleton.demo9;


import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName: RuntimeDemo
 * @Description: TODO
 * @Date: 2022/5/3 15:28
 * @Author: chj
 * @Version: 1.0
 */
public class RuntimeDemo {
    public static void main(String[] args) throws IOException {
        //获取Runtime对象
        Runtime runtime = Runtime.getRuntime();

        //调用runtime方法

        //调用runtime的方法exec,参数要的是一个命令
        Process process = runtime.exec("ipconfig");

        //调用process对象获取输入流的方法
        InputStream inputStream = process.getInputStream();

        byte[] arr =  new byte[1024*1024*100];
        //读取数据
        int len  = inputStream.read(arr);//返回读取到的字节的个数
        //将字节数组转换为字符串输出到控制台
        System.out.println(new String(arr,0,len,"GBK"));
    }
}
