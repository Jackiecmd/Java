package com.oop.demo01;

public class Demo02 {

    //静态方法  static

    //非静态方法
    public static void main(String[] args) {
        //如果加了static
        // Student.say();//类名.方法名
        //没加static：实例化
        //对象类型  对象名 = 对象值（对象值变成了实例化对象）
        Student student =new Student();
        student.say();
    }
}
