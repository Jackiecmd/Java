package Exception异常处理;

import java.util.Scanner;

public class ExceptionDemo06 {
    public static void main(String[] args) {
        //目标：掌握异常处理方案2，捕获异常对象，尝试重新修复
        //接收用户的一个定价
        System.out.println("程序开始");
        double price= 0;
        while (true) {
            try {
                price = userInputPrice();//选中这一行然后ctrl+alt+t
                System.out.println("用户成功设置了商品定价"+price);
                break;
            } catch (Exception e) {
                System.out.println("您输入的数据有误！");
            }
        }
        System.out.println("程序结束");
    }

    public static double userInputPrice(){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入商品定价：");
        double price =sc.nextDouble();
        return price;
    }
}
