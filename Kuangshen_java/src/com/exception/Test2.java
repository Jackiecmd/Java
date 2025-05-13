package com.exception;

public class Test2 {
    public static void main(String[] args) {
        int a=1;
        int b=0;

        //下面的代码由快捷键得来：
       //首先输入 System.out.println(a/b);
        //然后选中这行代码，ctrl+alt+t即可
        try {//try监控区域

            System.out.println(a/b);
        } catch (Exception e) {
            //throw new RuntimeException(e);不知道为啥加上这行就会报错
           // e.printStackTrace();//打印错误的栈信息
        } finally {
        }
    }
}
