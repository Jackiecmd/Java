import java.util.Scanner;//也可以是import.java.util.*;

public class Learn1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//打开通过键盘的录入程序入口
        String name = input.next();//获得用户输入的字符串
        System.out.println(name);
        String sex=input.next();
        System.out.println(sex);
        int age =input.nextInt();
        System.out.println(age);


    }

}
