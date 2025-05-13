package com.oop.demo10;

public class Application {
    public static void main(String[] args) {
        Outer outer = new Outer();
        //通过外部类来实例化内部类(先把外部类new出来）
        Outer.Inner inner = outer.new Inner();

        inner.in();
        inner.getID();//可以获得外部类的私有属性、私有方法！
    }
}
