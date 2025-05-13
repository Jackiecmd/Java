package com.oop.demo05_1;

public class Application {
    public static void main(String[] args) {

        //静态方法（static）：方法的调用只和左边，定义的数据类型有关
       //非静态：重写
        A a=new A();
        a.test();//A

        //父类的引用指向了子类
        B b=new A();//去static后，子类重写了父类的方法
        b.test();//A

        //静态的方法和非静态的方法区别很大！
        //重写的关键词只能是public的（public void test（））
    }
}
