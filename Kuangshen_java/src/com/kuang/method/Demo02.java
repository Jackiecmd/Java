package com.kuang.method;

public class Demo02 {

    /**
     * 方法重载的规则：
     * ①方法名称必须相同
     * ②参数列表必须不同
     * ③方法的返回类型可以相同也可以不同
     * ④仅仅返回类型不同不足以成为方法的重载
     *
     */
    public static void main(String[] args) {
        double max=max(5,6);
        int max2=max(5,6);//方法的重载（方法名一样）
        System.out.println(max);
        System.out.println(max2);
    }
    //java的方法都是值传递
    public static int max(int num1,int num2){
        int result=0;
        if(num1==num2){
            System.out.println("num1=num2");
            return 0;//中止方法！最终还是会输出0
        }
        if(num1>num2){
            result=num1;
        }else{
            result=num2;
        }
        return result;
    }

    //方法的重载：
    public static double max(double num1,double num2){
        double result=0;
        if(num1==num2) {
            System.out.println("num1=num2");
            return 0;
        }
            if(num1>num2){
                result=num1;
            }else{
                result=num2;
            }
            return result;

    }
}
