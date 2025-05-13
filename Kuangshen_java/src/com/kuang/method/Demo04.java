package com.kuang.method;

public class Demo04 {
    public static void main(String[] args) {
        Demo04 demo04 = new Demo04();
        demo04.test(1,2,3,4,5,6);//这里的test来源于后面的方法//这里直接输入1，不用打出...i:
    }
    //可变参数：在指定参数类型后加一个省略号...
    public void test(int...i){//...i必须放在最后面，比如不能写成（...i,int x）
        System.out.println(i);
        System.out.println(i[0]);//这个会输出1，因为主方法里面是...i:1。若主方法只写了...i:会报错
        System.out.println(i[1]);
        System.out.println(i[2]);
        System.out.println(i[3]);
        System.out.println(i[4]);
        System.out.println(i[5]);
    }
}
