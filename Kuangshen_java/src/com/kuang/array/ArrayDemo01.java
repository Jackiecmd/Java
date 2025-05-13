package com.kuang.array;
//数组的声明和创建
public class ArrayDemo01 {
    public static void main(String[] args) {
        //变量的类型 变量的名字=变量的值
        //数组类型
        int[]nums;//1.声明了一个数组。但还未复制//这是首选的数组声明方法
        int nums2[];
        int []nums3=new int[10];//把声明和创建写在了一起

        //Java语言中使用new操作符来创建数组，语法如下：
        nums=new int[10];//2.创建了一个数组。这里面可以存放10个int类型的数字

        //3.给数组元素中赋值
        nums[0]=1;
        nums[2]=2;
        nums[3]=3;
        nums[4]=4;
        nums[5]=5;
        nums[6]=6;
        nums[7]=7;
        nums[8]=8;


        System.out.println(nums[3]);
        System.out.println(nums[9]);//会输出int型的默认值0.

        //计算所有元素的和
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum=sum+nums[i];

        }
        System.out.println("sum: "+sum);


    }
}
