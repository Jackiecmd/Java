package com.oop.demo01;
//引用传递:一般是传递一个对象，本质还是值传递
public class Demo05 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);//null
        Demo05.change(person);
        System.out.println(person.name);
    }


    public static void change(Person person) {
        person.name = "王者";
    }
}
//这里class是小写的
class Person {//定义了一个Person类，有一个属性：name
        String name;
        }

