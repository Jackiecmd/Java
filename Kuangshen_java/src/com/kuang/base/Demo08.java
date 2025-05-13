package com.kuang.base;

public class Demo08 {
    //属性：变量

    //类变量 static
    static double salary = 2500;//如果去掉static会报错
    //实例变量：不在方法里面，从属于对象
    String name;
    int age;
    //main方法
    public static void main(String[] args) {

        //①局部变量：在方法里面，生命周期。必须声明和初始化值。

        //②实例变量的使用：
        //先写出new Demon08，然后按alt+回车：
        Demo08 demo08 = new Demo08();
        System.out.println(demo08.age);//这里写demo08.age.sout会自动变成这样（会输出0）
        //所以：实例变量如果不自行初始化，会变成这个类型的默认值（0 0.0 u0000)
        //布尔值的默认值是false
        //除了基本类型其余的默认值都是null（空）
        System.out.println(demo08.name);//输出null


        //③类变量  static
        System.out.println(salary);
    }

    //其他方法
    public void add(){

    }
}
