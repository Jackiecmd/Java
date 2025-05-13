package com.kuang.array;

import java.util.Arrays;//Arrays类
//主要是：赋值通过fill，排序通过sort，比较通过equals，查找数组元素通过binarySearch（二分法查找）

public class ArrayDemo06 {
    public static void main(String[] args) {
        int[] a={1,2,3,4,9090,31231,543,21,3,23};
        System.out.println(a);
        //打印数组元素Arrays.toSrtring
        System.out.println(Arrays.toString(a));

        Arrays.sort(a);//数组进行排序
        System.out.println(Arrays.toString(a));


        Arrays.fill(a,0);//数组填充
        System.out.println(Arrays.toString(a));

        Arrays.fill(a,2);
        System.out.println(Arrays.toString(a));
        for (int i : a) {
            System.out.print(i);
        }
    }
}
