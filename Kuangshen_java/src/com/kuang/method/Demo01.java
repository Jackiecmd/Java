package com.kuang.method;

public class Demo01 {
    //main方法
    public static void main(String[] args) {
        int sum=add(1,2);//这里是直接输入1，2；如果手输全部会报错
        System.out.println(sum);
    }
    //加法
    public static int add(int a,int b){

        return a+b;
    }
}
