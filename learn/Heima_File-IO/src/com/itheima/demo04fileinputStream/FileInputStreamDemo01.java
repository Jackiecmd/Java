package com.itheima.demo04fileinputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class FileInputStreamDemo01 {
    //目标：掌握文件字节输入流读取文件中的字节数组到内存中
    public static void main(String[] args) throws Exception {
        //1.创建一个文件字节输入流管道与源文件接通
        //复杂写法：InputStream  is = new FileInputStream(new File("D:\\java代码\\learn\\Heima_File-IO\\src\\com\\itheima\\demo04fileinputStream\\dilei02.txt"));
        InputStream  is = new FileInputStream("D:\\java代码\\learn\\Heima_File-IO\\src\\com\\itheima\\demo04fileinputStream\\dilei03.txt");

        //2.开始读取文件中的字节并输出
        //定义一个变量记住每次读取的一个字节，每次读取一个字节
        /*int b;
        while((b = is.read()) != -1){
            System.out.print((char)b);
        }
        //每次读取一个字节的问题：性能较差，读取汉字输出一定会乱码！（汉字是三个字节）*/

        //2.开始读取文件中的字节数组并输出，每次读取多个字节
        //定义一个字节数组，用于每次读取多个字节
        byte[] buffer = new byte[3];//1024个字节即，1KB.这里设置成每次读三个字节(其实大一些会更好）
        //定义一个变量，记住每次读取了多少个字节
        int len;
        while((len = is.read(buffer)) != -1){
            //3.把读取到的字节数组转换成字符串并输出
           /* 注释①String str =new String(buffer);
            System.out.println(str);//一共有三行
            /*abc
            666
            g66*///输出结果多了两个6，因为读到g之后就返回的不是-1，而前面的66还在剩余两个字节的空间中
           // 注释②*/
            //3.把读取到的字节数组转换成字符串并输出，读多少倒多少
            String str2 =new String(buffer,0,len);//第三个从0开始，len表示读取了多少个字节，读到的是1，所以正常
            System.out.println(str2);
        }

        //每次读取了多个字节，性能得到提升，因为每次读取多个字节，可以减少硬盘和内存的交互次数，从而提升性能。
        //依然无法避免读取汉字输出乱码的问题：存在截断汉字字节的可能性！
    }
}
