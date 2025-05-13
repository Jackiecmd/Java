package com.kuang.struct;

public class SwitchDemo01 {
    public static void main(String[] args) {
        char grade = 'v';
        //case穿透现象：没有break就会一直下去。
        //switch匹配一个具体的值，没有break就继续输出
        switch(grade){
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
                System.out.println("良好");
                break;
            default:
                System.out.println("有问题");
        }
    }
}
