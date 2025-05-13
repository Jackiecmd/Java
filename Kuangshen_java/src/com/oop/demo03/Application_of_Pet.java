package com.oop.demo03;

public class Application_of_Pet {
    public static void main(String[] args) {
      Pet dog =new Pet();
      dog.name="旺财";
      dog.age=3;
      dog.shout();

        System.out.println(dog.name);
        System.out.println(dog.age);
    }
}

/**Summary
 * 1.类与对象
 *  类是一个模板，抽象，对象是一个具体的实例
 * 2.方法
 *  定义、调用！
 * 3.对应的引用
 *  引用类型：基本类型（8种）
 *     对象是通过引用来操作的：栈---->堆
 *
 * 4.属性：字段Field 成员变量
 *  默认初始化：
 *      数字：0 0.0
 *      char：u0000
 *      boolean：false
 *      引用：null
 *
 *    属性的定义：
 *    修饰符 属性类型 属性名=属性值！
 *
 * 5.对象的创建和使用
 *    -必须使用new关键字创造对象，构造器Person cj=new Person();
 *    -对象的属性cj.name
 *    -对象的方法cj.sleep()
 *
 * 6.类：
 *     静态的属性  属性
 *     动态的行为  方法
 *
 * **---封装、继承、多态---**
 */
