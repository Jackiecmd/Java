package com.kuang.scanner;

import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
        //输入多个数字，求平均数和总和。每输入一个数字用回车确认，通过输入非数字来结束输入并执行结果
        Scanner scanner=new Scanner(System.in);

        //和
        double sum=0;
        //计算输入了多少数字
        int m=0;
        System.out.println("请输入数据");
        //通过循环判断是否还有输入，并在里面对每一次进行求和统计
        while (scanner.hasNextDouble()){
            double x=scanner.nextDouble();
            //
            m=m+1;
            sum=sum+x;

        }

        System.out.println(sum);
        System.out.println(m+"个数的平均值是"+(sum/m));
        scanner.close();
    }
}
