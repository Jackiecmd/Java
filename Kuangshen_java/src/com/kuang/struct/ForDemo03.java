package com.kuang.struct;

public class ForDemo03 {
    public static void main(String[] args) {
        //用while或for循环输出1-1000之间能被5整除的数，并且每行输出三个
        for (int i = 0; i <= 1000; i++) {//这里直接输入1000.for,再添加一个等号
            if(i%5==0) {
                System.out.print(i + "\t");
            }
            if(i%(5*3)==0)//每行
            {
                System.out.println();
                //也可以用：System.out.print("\n");
            }
        }
    }
}
