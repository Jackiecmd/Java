package com.kuang.operator;

public class Demo02 {
    public static void main(String[] args) {
        long a =21111356354765343L;
        int b =123;
        short c=10;
        byte d=8;
        System.out.println(a+b+c+d);//Long//如果没有long，结果都为int型
        System.out.println(b+c+d);//int
        System.out.println(c+d);//int
        System.out.println((double)c+d);//转换成double//这里不能转换成String
    }
}
