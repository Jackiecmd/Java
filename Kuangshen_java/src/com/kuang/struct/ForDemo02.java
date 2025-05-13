package com.kuang.struct;

public class ForDemo02 {
    public static void main(String[] args) {
        //计算0-100奇数偶数的和
        int oddSum=0;
        int evenSum=0;
        for (int i = 0; i < 100; i++) {//这里是不包括100的！
            if (i % 2 != 0)
                oddSum += i;
            else {
                evenSum += i;
            }
        }
        System.out.println("奇数的和："+oddSum);
        System.out.println("偶数的和："+evenSum);
    }
}
