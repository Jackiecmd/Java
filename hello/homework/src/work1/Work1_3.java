package work1;

import java.util.Scanner;

public class Work1_3 {
    public static void main(String[] args) {
        //简单计算器（增强版）
        //实现一个支持加、减、乘、除的计算器，能够连续计算多个表达式，直到用户选择退出。
        Scanner scanner=new Scanner(System.in); // 创建一个 Scanner 对象，用于从控制台读取用户输入
        System.out.println("请输入计算式：");
        double num1 = 0;
        double num2 = 0;
        double result=0;
        char operator = '0';
        boolean continueFlag=true; // 定义一个布尔变量，用于控制是否继续计算，初始值为 true
        while(continueFlag==true) {// 使用 while 循环，只要 continueFlag 为 true，就持续进行计算
            System.out.println("请输入第一个数字：");//提示用户输入第一个数字
            if (scanner.hasNextDouble()) {
                num1 = scanner.nextDouble();
            }
            System.out.println("请输入操作符：");//提示用户输入操作符
            if (scanner.hasNext()) {
                operator = scanner.next().charAt(0);
            }
            System.out.println("请输入第二个数字：");//提示用户输入第二个数字
            if(scanner.hasNextDouble()){
                num2=scanner.nextDouble();
            }
            switch (operator){//判断是什么运算
                case'+':result =num1+num2;break;
                case'-':result=num1-num2;break;
                case'*':result=num1*num2;break;
                case'/':result=num1/num2;break;
                default://输入有误的情况
                    System.out.println("操作符有误！");
            }
            System.out.println(result);//输出结果

            System.out.println("是否继续计算？Y：是 N：否");//询问是否继续
            if(!scanner.next().equalsIgnoreCase("Y"))//终止信号
            {
                continueFlag=false;
            }
        }
    }
}
