package com.kuang.scanner;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //从键盘接收数据
        int i=0;
        float f=0.0f;
        System.out.println("请输入小数");
        if(scanner.hasNextFloat()){///如果输入的是整数，也会返回true，因为整数可以自动转换成浮点数
            f=scanner.nextFloat();
            System.out.println("小数数据："+f);
        }
        else{
            System.out.println("输入的不是小数");
        }
    }
}
