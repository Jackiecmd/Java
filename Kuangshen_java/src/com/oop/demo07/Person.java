package com.oop.demo07;

public class Person {
    /*补充：final修饰的类不能有子类
    如这个Person类改为：public final class Person{}
     */
    {//2 匿名代码块，一般用于赋初始值
        System.out.println("匿名代码块");

    }
    static{//1静态代码块，只执行一次
        System.out.println("静态代码块");
    }
    public Person(){//3构造方法
        System.out.println("构造方法");
    }

    public static void main(String[] args) {
        Person person =new Person();
        System.out.println("========");
        Person p=new Person();
    }
}
