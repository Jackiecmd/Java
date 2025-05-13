package com.kuang.base;

public class Demo06 {
    public static void main(String[] args) {
        //操作数比较大的时候，注意溢出问题
        //JDK7新特性：数字之间可以用下划线分割，并且下划线不会被输出
        int money=10_000_000_00;
        System.out.println(money);
        int years =20;
        int total=money*years;
        System.out.println(total);//结果是负的，计算的时候溢出了
        long total2=money*years;//money和years默认为int，计算完会默认转换为int，然后再转换成long，但是转换之前就已经出问题了。
        System.out.println(total2);//仍然是负数

        long total3=money*((long)years);//先把一个数转换成long
        System.out.println(total3);//L和l一样，但L更容易分辨。
    }
}
