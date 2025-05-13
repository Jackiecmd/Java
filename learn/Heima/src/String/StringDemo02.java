package String;//字符串的比较


import java.util.Scanner;

public class StringDemo02 {
    public static void main(String[] args) {
        String a1="abc";
        String a2=new String("abc");
        System.out.println(a1==a2);
        String a3="abc";
        //串池中已经有了abc，所以不会创建新的
        System.out.println(a1==a3);
        String a4=new String("abc");
        //new会在堆中开辟新空间
        System.out.println(a2==a3);
        //==两边是引用数据类型时，比较的是地址值


        //比较字符串对象中的内容是否相等
        boolean result1 = a1.equals(a2);
        System.out.println(result1);//true
        String s2="Abc";
        boolean result2= a1.equals(s2);
        System.out.println(result2);//false

        //比较字符串对象中的内容是否相等，忽略大小写
        //1 一 壹 是不等的
        boolean result3 = a1.equalsIgnoreCase(s2);
        System.out.println(result3);//true

        //1.从键盘录入一个abc
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str1=sc.next();//next()是new出来的！

        //2.代码中再定义一个字符串abc
        String str2="abc";

        //3.用==比较
        System.out.println(str1==str2);//false

        //结论：
        /**
         * 以后只要想比较字符串的内容，就必须要String里面的方法
         */
    }
}
