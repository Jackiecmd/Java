package com.kuang.array;

public class ArrayDemo04 {
    public static void main(String[] args) {
        //数组增强型的for循环。JDK1.5以上：没有下标
        int []arrays={1,2,3,4,5};
        for (int array : arrays) {//这里是直接输入的arrays.for
            System.out.println(array);//这是取不到下标的

        }
        System.out.println("=============");
        printArray(arrays);
        System.out.println("=============");
       int[] reverse= reverse(arrays);
        for (int i : reverse) {
            System.out.println(i);
        }
        System.out.println("------");
        printArray(reverse);
    }

    //打印数组元素

    public static void printArray(int [] arrays){
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i]+" ");
        }
    }

    //反转数组
    public static int[]/*要返回的是一个数组*/ reverse(int[] arrays){
        int[]result=new int[arrays.length];
        //反转的操作
        for (int i = 0,j=result.length-1; i < arrays.length; i++,j--) {
            result[j]=arrays[i];
        }

        return result;
    }
}
