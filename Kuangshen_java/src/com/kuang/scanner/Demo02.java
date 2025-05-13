package com.kuang.scanner;
import java.util.Scanner;

/**
 * scanner对象：
 * ①一定要读取到有效字符后才可以结束输入
 * ②对输入有效字符之前遇到的空白，next（）方法会自动将其去掉
 * ③只有输入有效字符后才将其后面输入的空白作为分隔符或者结束符
 * ④next（）不能得到带有空格的字符串
 */
public class Demo02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入数据：");
        System.out.println("使用nextline方式接收：");
        //判断是否还有输入
        if(scanner.hasNextLine()){
            String str=scanner.nextLine();//等待用户继续输入
            System.out.println("输出的内容为："+str);
        }

        scanner.close();
    }
}
