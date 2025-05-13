package com.kuang.struct;

public class SwitchDemo02 {
    public static void main(String[] args) {
        String name="蛋仔" ;
        //JDK7新特性：表达式结果可以是字符串
        //字符串的本质还是数字
        //反编译：java----->class（字节码文件：人类看不懂）----反编译（IDEA）
        //Hash值，每个字符可以对应特定的Hash值

        switch(name){
            case"王者":
                System.out.println("王者");
                break;
            case"蛋仔":
                System.out.println("蛋仔");
                break;
            default:
                System.out.println("bad");
        }
    }
}
