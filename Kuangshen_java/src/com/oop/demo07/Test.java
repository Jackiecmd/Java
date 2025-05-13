package com.oop.demo07;

import static java.lang.Math.random;//静态导入包
import static java.lang.Math.PI;//静态导入包
public class Test {
    public static void main(String[] args) {
        System.out.println(Math.random());//生成随机数
        System.out.println(random());//生成随机数。第三行导入了，这里可以直接写random（）
        System.out.println(PI);
    }
}
