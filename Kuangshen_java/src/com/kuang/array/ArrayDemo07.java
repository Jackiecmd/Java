package com.kuang.array;

import java.util.Arrays;

public class ArrayDemo07 {
    public static void main(String[] args) {
        int[]a={1,4,5,6,72,2,2,2,25,6,7};
        int[] sort=sort(a);
        System.out.println(Arrays.toString(sort));
    }

    //冒泡排序
    /**
     * 1.比较数组中，两个相邻的元素，如果第一个数比第二个数大，就交换它们的位置
     * 2.每一次比较，都会产生出一个最大或者最小的数字
     * 3.下一轮就可以少一次排序
     */
    public static int[] sort(int[] array){
        //外层循环：判断这个要走多少次
        //临时变量：
        int temp=0;
        for (int i = 0; i < array.length-1; i++) {
            //内层循环：比较判断两个数，如果第一个数比第二个数大，就交换位置
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j+1]>array[j]){//如果要把小的放在前面，就把＞改成＜
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        return array;
    }
}
