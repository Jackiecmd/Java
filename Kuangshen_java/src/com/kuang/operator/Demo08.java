package com.kuang.operator;

public class Demo08 {
    public static void main(String[] args) {
        //三元运算符
        //x?y:z
        //若x为true则为y否则为z
        int score =80;
        String type = score<60?"不及格":"及格";
        System.out.println(type);
    }
}
