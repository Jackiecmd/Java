package com.itheima.demo01creat;

public class Test {
    //main方法本身是由一条主线程负责推进执行的
    public static void main(String[] args) {
        //目标：认识多线程，掌握创建线程的方式一：继承Thread类来实现

        //4.创建线程类的对象：代表线程
        //MyThread t1 = new MyThread();
        Thread t1 = new MyThread();//这是多态的写法
        //5.调用start方法启动线程
        t1.start();//一定是.start()而不是.run()

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程输出："+i);//会同时执行，输出结果中主线程和子线程的交替呈现
        }
    }
}


//1.定义一个子类继承Thread类，成为一个线程类。
class MyThread extends Thread{
    //2.重写Thread类的run方法
    @Override
    public void run() {
        //3.在run方法中编写线程要执行的任务代码（线程要干的活）
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程输出："+i);//自己创建的线程一般叫做子线程
        }
        }
    }
//有了线程类并不代表系统中就创建了线程（就好比有了学生类不一定就创建了学生对象）-->第四步
