package String;

import java.util.Scanner;

//键盘录入一个字符串，使用程序实现在控制台遍历该字符串
public class String_prac2 {
    public static void main(String[] args) {
        //1.键盘录入一个字符串
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str=sc.next();

        //2.进行遍历（字符串遍历要加括号，数组不需要
        for (int i = 0; i < str.length(); i++) {//快捷：str.length().fori+enter
            //i依次表示字符串的每一个索引（像数组一样）
            char c = str.charAt(i);
            System.out.println(c);
        }
    }
}
