package com.kuang.array;

public class ArrayDemo05 {
    public static void main(String[] args) {
        int [][]array={{1,2},{100,3},{3,4},{4,5}};
        /*
        1,2     array[0]
        100,3     array[1]
        3,4     array[2]
        4,5     array[3]
         */
        System.out.println(array[0]);
        printArray(array);
        System.out.println("==========");
        printArray_2(array[2]);
        System.out.println("\n-----------");
        printArray(array[2]);
    }
    public static void printArray(int[][]array){
        for (int[] ints : array) {
            System.out.println(ints);
            System.out.print(ints[0]+" ");
            System.out.println(ints[1]+" ");
        }
        }



    public static void printArray_2(int[]arrays){
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i]+" ");
        }
    }

    public static void printArray(int[]arrays){
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i]+" ");
        }
    }
}
