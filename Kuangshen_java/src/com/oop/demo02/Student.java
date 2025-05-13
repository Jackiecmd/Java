package com.oop.demo02;
//学生类

public class Student {
    //一个类里面包括属性和方法

    //属性：字段
    String name;
    int age;

    //方法

    public void study(){
        System.out.println(this.name+"学生在学习");//this代表自己这个类
    }
}
