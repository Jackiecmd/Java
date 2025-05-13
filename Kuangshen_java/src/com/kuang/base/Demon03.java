package com.kuang.base;

public class Demon03 {
    public static void main(String[] args){
        //整数拓展：进制     二进制0b     十进制      八进制0       十六进制0x
        int i=10;
        int i2=010;//八进制
        int i3=0x10;//十六进制 0~9  A~F
        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println("-------------------");
        //浮点数拓展------最好完全避免使用浮点数进行比较，可使用BigDecimal（数学工具类）
        float f=0.1f;
        double d=1.0/10;
        System.out.println(f==d);//f==d表示判断f和d是否相等,会输出false
        System.out.println(f);
        System.out.println(d);
        float d1 =213412534652f;
        float d2=d1+1;//会输出true

        //编码：Unicode表。所有的字符本质还是数字。（97=a 65=A
        //转义字符
        //\t:制表符
        System.out.println("------------------");
        System.out.println("base.Hello\tWorld!");
        //\n换行
        System.out.println("base.Hello\nWorld!");

        /*-------------------*/
        System.out.println("-------------------");
        //对象，从内存分析
        String sa = new String("base.Hello World");
        String sb=new String("base.Hello World");
        System.out.println(sa==sb);

        String sc="hello";
        String sd="hello";
        System.out.println(sc==sd);


        /*-----------------*/
        System.out.println("----------------");
        //布尔值扩展
        boolean flag =true;
        if (flag==true){//也可写作if(flag)
            System.out.println("good");
        }
    }
}
