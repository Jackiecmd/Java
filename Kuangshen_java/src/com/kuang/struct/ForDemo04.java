package com.kuang.struct;

public class ForDemo04 {
    public static void main(String[] args) {
        //打印九九乘法表
       /* for (int i = 0; i <= 9; i++) {
            System.out.println(1+"*"+i+"="+(1*i));//这是第一列
        }把这个代码弄到下面的for里面去*/
        for (int j = 0; j <= 9; j++) {


            for (int i = 1; i <= j; i++) {
                System.out.print(j + "*" + i + "=" + (j * i)+"\t");//注意这里是print
            }
            System.out.println();
        }
    }
}
