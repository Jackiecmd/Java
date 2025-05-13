package com.oop.demo10;

public class Test {
    public static void main(String[] args) {
        Apple apple = new Apple();
        //没有名字初始化类：
        new Apple().eat();//匿名对象的使用：不用把实例保存到变量中
        //这里可以new一个接口//这个不重要
        new UserService(){//也可以写作UserService userService=new UserService(){}
            @Override//重写了这个接口的方法，不然会报错
            public void hello() {

            }
        };
    }
}

class Apple{
    public void eat(){
        System.out.println("1");
    }
}

interface UserService{
    void hello();
}
