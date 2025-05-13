package com.oop.demo01;
//学生类
public class Student {

    //方法
    public  void say(){//如果没有static则不能通过类名.方法名调用该方法
        System.out.println("学生说话了");
    }

    //static是和类一起加载的，而没有static的化类实例化之后才存在
}
