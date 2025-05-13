package work1;

import java.util.Scanner;

//编写程序，提示用户输入两个正整数，并求出它们的最大公约数，以及最小公倍数。
public class Work1_2 {
    public static void main(String[] args) {
        System.out.println("请输入两个正整数。");//提示用户输入
        int num1=0,num2=0;
        Scanner scanner=new Scanner(System.in);//创建一个Scanner对象，用于从控制台读取用户输入
        if(scanner.hasNextInt()){// 检查输入流中是否有下一个整数
            num1=scanner.nextInt();// 读取第一个整数并赋值给num1
        }
        else{
            System.out.println("输入的不是整数！");
        }
        if(scanner.hasNextInt()){
            num2=scanner.nextInt();
        }
        else{
            System.out.println("输入的不是整数！");
        }
        System.out.println(num1 + "和"+num2);
        int temp=0;
        int a=num1,b=num2;
        while(b!=0){//使用辗转相除法计算最大公约数
            temp=a%b;
            a=b;
            b=temp;
        }
        System.out.println("最大公约数为"+a);//输出结果
        int lcm=0;
        lcm=(num1*num2)/a;//最小公倍数等于两数乘积/最大公约数
        System.out.println("最小公倍数是"+lcm);//输出结果
        scanner.close();//关闭Scanner对象，释放资源
    }
}
