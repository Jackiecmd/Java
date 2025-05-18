package com.itheima.demo03charset;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class CharSetDemo01 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //目标：写程序实现字符编码和解码
        //1.编码
        String name="我爱你一鸣abc666";
        byte[] bytes=name.getBytes("GBK");//平台的UTF-8编码的//指定GBK编码，把括号中的内容去掉是会有变化的
        System.out.println(bytes.length);//21个字节
        System.out.println(Arrays.toString(bytes));//汉字的首位是1，所以汉字的编码是负的

        //2.解码
        String name1=new String(bytes,"GBK");//指定GBK进行解码
        System.out.println(name1);
        System.out.println(bytes.length);//21个字节
        System.out.println(Arrays.toString(bytes));//汉字的首位是1，所以汉字的编码是负的
    }
}
