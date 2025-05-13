package com.oop.demo07;

//static总结
public class Student {
    private static int age;//静态的变量
    private double score;//非静态的变量

    public void run(){

        System.out.println("==========");
        go();//非静态方法可以直接访问静态方法。因为静态方法跟类一起加载出来的
        System.out.println("run");
        System.out.println("===========");
    }

    public static void go(){

        System.out.println("go");
    }


    public static void main(String[] args) {
        Student s1 = new Student();
        s1.age=1;
        System.out.println(s1.age);//用对象来调用的

        System.out.println(Student.age);//使用类名访问
        //System.out.println(Student.score);//报错：无法从静态上下文中引用非静态变量score

       // run();//报错：无法从静态上下文中引用非静态方法run（）---->解决方案：new一个出来

        new Student().run();//对象.方法，会输出run
        Student.go();//输出go
        go();//也能输出go
    }
}
