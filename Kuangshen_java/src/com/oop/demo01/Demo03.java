package com.oop.demo01;

public class Demo03 {
    public static void main(String[] args) {
        int add=Demo03.add(1,2);//实参和形参要一一对应
        System.out.println(add);
    }
    public static int add(int a,int b){
        return a+b;
    }
}
