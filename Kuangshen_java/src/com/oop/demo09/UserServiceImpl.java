package com.oop.demo09;

//抽象类：extends~ 单继承
//类  可以实现接口  implements  接口
//实现了接口的类，就需要重写接口中的方法

//多继承~利用接口实现
//类中有方法的实现，接口中只有方法的定义
public class UserServiceImpl implements UserService,TimeService{
    @Override
    public void add(String name) {

    }

    @Override
    public void delete(String name) {

    }

    @Override
    public void update(String name) {

    }

    @Override
    public void query(String name) {

    }

    @Override
    public void run() {

    }

    @Override
    public void timer() {

    }
}
