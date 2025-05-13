package com.oop.demo05_1;

//继承
public class A extends B {
   // public /*static*/ void test(){//两边的static必须同时存在或同时不存在。
   //     //static的有无对Application中输出的结果有影响
   //     System.out.println("A=>test()");
   // }这里要用alt+insert实现下面的方法所以先将每一行都注释掉了


    @Override//注解  override：重写
    public void test() {
        System.out.println("A=>test()");
    }
}
