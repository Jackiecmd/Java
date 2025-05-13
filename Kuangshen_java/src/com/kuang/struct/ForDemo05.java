package com.kuang.struct;

public class ForDemo05 {
    public static void main(String[] args) {
        int[]numbers={10,20,30,40,50};//定义了一个数组
        //遍历数组的元素
        for(int i=0;i<5;i++){
            System.out.println(numbers[i]);
        }
        System.out.println("=============");
        for(int x:numbers){
            System.out.println(x);//可以直接输出numbers了
        }
    }
}
