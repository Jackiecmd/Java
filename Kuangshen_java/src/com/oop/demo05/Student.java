package com.oop.demo05;

//子类（派生类）
//学生  is    人
public class Student extends Person {
    private String name="cj";

    public void test(String name){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }

    public void print(){
        System.out.println("Student");
    }

    public void test1(){
        print();//输出当前类的Student
        this.print();//输出当前类的Student
        super.print();
      //  super.print1();  Person中print1是私有的，无法被继承
    }

}
