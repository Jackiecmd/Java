package com.kuang.base;

public class Demo09 {

    //修饰符，不存在先后顺序
    final static double pi1=3.14;//这里变量类型前面的都是修饰符
    static final double pi2=3.14;//final用来定义常量。
    public static void main(String[] args) {
        System.out.println(pi1);
        System.out.println(pi2);
        /**
         * 变量的命名规范：
         * 类成员变量：首字母小写+驼峰
         * 局部变量：首字母小写+驼峰
         * 常量：大写字母和下划线
         * 类名：首字母大写+驼峰//比如文件名Demo
         * 方法名：首字母小写+驼峰
         */
    }
}
