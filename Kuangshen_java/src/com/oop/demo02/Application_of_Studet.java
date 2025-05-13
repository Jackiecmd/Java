package com.oop.demo02;

//一个项目应该只存在一个main方法
public class Application_of_Studet {
    public static void main(String[] args) {
        //类：抽象的，实例化
        //类实例化后会返回一个自己的对象！
        //student的对象就是一个Student类的具体实例！
        Student xiaoming = new Student();
        Student xiaohong = new Student();

        System.out.println(xiaoming.name);//null
        System.out.println(xiaoming.age);//0

        xiaoming.name="小明";
        xiaohong.age=3;
        System.out.println(xiaoming.name);
        System.out.println(xiaohong.age);

    }
}
