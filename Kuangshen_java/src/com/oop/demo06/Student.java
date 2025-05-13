package com.oop.demo06;

public class Student extends Person{
    @Override//子类重写了父类的方法，执行子类的方法
    public void run() {
        System.out.println("son");
    }

    public void eat(){
        System.out.println("eat");
    }

    public void go(){
        System.out.println("go");
    }
}
