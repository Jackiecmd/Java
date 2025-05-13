package com.oop.demo02;

public class Application_of_Person {
    public static void main(String[] args) {
        //new实例化了一个对象
        Person person=new Person();//选择没有参数的
        Person person1 =new Person("蛋仔");//选择有参构造
        Person person3=new Person("cs",27);
        System.out.println(person.name);
        System.out.println(person1.name);
        System.out.println(person3.name+person3.age);//注意是用+连接

    }
}

