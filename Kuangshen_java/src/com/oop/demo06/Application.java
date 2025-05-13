package com.oop.demo06;

public class Application {
    public static void main(String[] args) {
        //一个对象的实际类型是确定的
        //new Student();
        //new Person();

        //可以指向的引用类型不确定:父类的引用指向子类的类型

        //Student能调用的方法都是自己的或者继承的父类的
        Student s1=new Student();
        //Person父类型，可以指向子类，但是不能调用子类独有的方法
        Person s2 = new Student();
        Object s3=new Student();//Object祖宗类


        s2.run();

        s1.run();//这里注意比较Student中有无4-6行的区别（重写）

        //对象能执行哪些方法，主要看对象左边的类型，和右边关系不大
        s1.eat();
       // s2.eat();会报错.因为s2的类型是Person，Person里没有eat方法
        //都有的情况：子类重写了父类：调用子类，没重写：调用父类
        ((Student)s2).eat();//强制类型转换，要有父子关系（高转低）


        //instanceof:检测一个对象是否是一个类的实例或者其子类的实例
        //Object>String
        //Object>Person>Teacher
        //Object>Person>Student

       // System.out.println(x instanceof y);//能否编译通过是看x和y之间是否存在父子关系。true与false是看x指向的实际类型是否为y的子类型
        Object object =new Student();
        System.out.println(object instanceof Student);//true
        System.out.println(object instanceof Person);//true
        System.out.println(object instanceof Object);//true
        System.out.println(object instanceof Teacher);//false
        System.out.println(object instanceof String);//false

        System.out.println("=============");
        Person person =new Student();
        System.out.println(person instanceof Student);//true
        System.out.println(person instanceof Person);//true
        System.out.println(person instanceof Object);//true
        System.out.println(person instanceof Teacher);//false
        //System.out.println(person instanceof String);//编译报错。Person和String是同级的，都是在Object之下

        System.out.println("===========");
        Student student=new Student();
        System.out.println(student instanceof Student);//true
        System.out.println(student instanceof Person);//true
        System.out.println(student instanceof Object);//true
       // System.out.println(student instanceof String);//编译报错
       // System.out.println(student instanceof Teacher);//编译报错

        System.out.println("========");

        //父与子之间的强制类型转换
        //高     -->     低
        Person obj=new Student();//Person类是高的一方，Student类是低得一方。低转高不需要强制转换
        //此时的obj不能执行Student类中的go方法
       // obj.go();//编译报错（Person类里面没有go（）方法)

        //将Person类型的obj对象转换为Student类型,就可以使用Student类型的方法了
        //高-->低：要强制转换
        Student obj1 = (Student) obj;
        obj1.go();
        ((Student)obj).go();


        System.out.println("==========");

        //由低到高转换
        Student a=new Student();
        student.go();
        //把a变成一个Person类型，可以默认转化
        Person b=a;
       // b.go();//go是Person类型，编译报错

        //****子类转换成父类可能会丢失自己本来的一些方法*****


        /**
         * 多态总结
         * 1.父类引用指向子类的对象（如79行）
         * 2.把子类转换为父类，向上转型：不用强制转换
         * 3.把父类转换成子类，要向下转型：需要强制转换（可能丢失一些方法）
         * 4.方便方法的调用，减少重复的代码，更简洁
//         * 抽象类、接口
         */

    }
}
