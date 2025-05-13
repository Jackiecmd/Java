package com.kuang.base;

public class Demo05 {
    public static void main(String[] args){
        //强制转换
        //从低到高：byte,short,char->int->long->float->double
        int i =128;
        byte b=(byte)i;//内存溢出（强制类型转换：从高到低）
        System.out.println(i);
        System.out.println(b);
        //自动类型转换：从低到高
        int c=128;
        double d=i;
        System.out.println(c);//128
        System.out.println(d);//128.0
        /*
        ①不能对布尔进行转换
        ②不能把对象类型转换为不相干的类型
        ③在把高容量转换到低容量的时候，强制转换
        ④转换的时候可能存在内存溢出或者精度问题！
         */

        System.out.println("-------------");
        System.out.println((int)23.7);//23.7是double
        System.out.println((int)45.89f);//45.89f是float

        System.out.println("============");
        char m ='a';
        int n = m+1;
        System.out.println(n);
        System.out.println((char)n);
    }
}
