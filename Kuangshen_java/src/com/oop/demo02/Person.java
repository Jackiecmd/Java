package com.oop.demo02;

//java-->class
public class Person {

        //一个程序即使什么都不写，它也会存在一个方法
        //显示的定义构造器

        String name;
        int age;
        //实例化初始值
        //1.使用new关键字,本质是在调用构造器
  /*  public Person(){
        //this.name="王者";//注释掉值就是null

    }
    //如果把12-14行注释掉，那么Application2无法正常运行

    //有参构造：一旦定义了有参构造，无参构造就必须显示定义
    public Person(String name){
        this.name=name;//this.name是上面第九行的name，等号后面的name是17行里面的形参

    }*/

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //快捷键：alt+insert会自动生成构造器
    //把前面构造的都注释掉了
    //alt+insert+确定：有参构造
    public Person(String name) {
        this.name = name;
    }

    //alt+insert+无选择：无参构造

    public Person() {
    }


}

/**
 * 构造器：
 * 1。和类名相同
 * 2.没有返回值
 * 作用：
 * 1.new本质在调用构造器（构造方法）
 * 2.初始化对象的值
 * 注意点：
 * 1.定义了有参构造之后，如果想使用无参构造，显示的定义一个无参的构造
 *
 * 快捷键alt+insert
 * this. =参数传进来的值
 */
