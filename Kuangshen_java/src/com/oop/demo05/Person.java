package com.oop.demo05;

//人：父类
public class Person /*extends object*/ {
    public int money = 100_000_000;
    public void say(){
        System.out.println("说了一句话");
    }

    protected String name="yp";

    public void print(){
        System.out.println("Person");
    }

    private void print1(){
        System.out.println("111");
    }
}
