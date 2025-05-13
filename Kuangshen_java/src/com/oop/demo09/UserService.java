package com.oop.demo09;

//接口

//interface定义的关键字,接口都需要有实现类
public interface UserService {
    //接口里不能写方法：
    //public void run(){
    //
    //}报错

    //接口中的所有定义其实都是抽象的(public abstract)
   // public abstract void run();
    //等价写法：返回值类型  方法名（参数列表）;
    void run();

    //常量：public static final
    //public static final int AGE=99;
    //等价于：
    int AGE=99;

    void add(String name);
    void delete(String name);
    void update(String name);
    void query(String name);

}
