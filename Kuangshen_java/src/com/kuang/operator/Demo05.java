package com.kuang.operator;
//逻辑运算符

public class Demo05 {
    public static void main(String[] args) {


        //与（and）     或（or）         非（取反）
        boolean a = true;
        boolean b = false;
        System.out.println("a&&b:"+(a&&b));//逻辑与运算
        System.out.println("a||b:"+(a||b));//逻辑或运算
        System.out.println("!(a&&b):"+!(a&&b));//若真则假，若假则真

        //会出现短路运算的情况。
    }
}

