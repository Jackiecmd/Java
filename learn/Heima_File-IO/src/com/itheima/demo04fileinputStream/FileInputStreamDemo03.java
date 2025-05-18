package com.itheima.demo04fileinputStream;

import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStreamDemo03 {
    //目标：掌握文件字节输入流读取文件中的字节数组到内存中
    public static void main(String[] args) throws Exception {
        //1.创建一个文件字节输入流管道与源文件接通
       InputStream is = new FileInputStream("D:\\java代码\\learn\\Heima_File-IO\\src\\com\\itheima\\demo04fileinputStream\\dlei04");//简化写法
        //2.一次性读完文件中的所有字节，可以避免读取汉字输出乱码的问题
        byte[] bytes=is.readAllBytes();
        String rs=new String(bytes);
        System.out.println(rs);
    }
}
