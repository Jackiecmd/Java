package String;

import java.util.Scanner;

//练习：已知正确的用户名和密码，请用程序实现模拟用户登录。
//总共给三次机会，登录之后，给出相应的提示
public class String_practice {
    public static void main(String[] args) {
        //已知正确的用户名和密码
        String rightUsername="zhangsan";
        String rightPassword="123456";

        //用程序实现模拟用户登录
        //键盘录入用户名和密码

        //实现循环：选中要包含在循环体中的代码，然后按ctrl+alt+t，选择for即可
        int count=0;
        for (int i=0;i<3;i++) {
            Scanner sc=new Scanner(System.in);
            System.out.println("请输入用户名：");
            String username=sc.next();
            System.out.println("请输入密码：");
            String password=sc.next();

            //比较
            if(username.equals(rightUsername) && password.equals(rightPassword)){
                System.out.println("登录成功！");
                break;
            } else if (username.equals(rightUsername)&&!(password.equals(rightPassword))) {
                System.out.println("密码错误！");
                count++;
                System.out.println("你还有"+(3-count)+"次机会");
            } else if (!(username.equals(rightUsername)) && password.equals(rightPassword)) {
                System.out.println("用户名错误！");
                count++;
                System.out.println("你还有"+(3-count)+"次机会");
            } else {
                System.out.println("用户名和密码错误！");
                count++;
                System.out.println("你还有"+(3-count)+"次机会");
            }
        }

    }
}
