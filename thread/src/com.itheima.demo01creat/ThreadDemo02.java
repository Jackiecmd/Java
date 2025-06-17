package com.itheima.demo01creat;

public class ThreadDemo02 {
    public static void main(String[] args) {
        //目标：掌握多线程的创建方式二：实现Runnable接口来创建
        //3.创建线程任务类的对象来表一个线程任务
        //MyRunnable r = new MyRunnable();//这是个线程任务，但不是线程，不能直接去调start（）
        Runnable r = new MyRunnable();//这是个线程任务，但不是线程，不能直接去调start（）
        //4.把线程任务对象交给一个线程对象来处理
        Thread t1 = new Thread(r, "1号子线程");//Thread构造器//直接设置名字
        //5.调用start()方法启动线程
        t1.start();


        for (int i = 0; i < 5; i++) {
            System.out.println("主线程输出："+i);
        }
    }
}


//1.定义一个线程任务类实现Runnanble接口
class MyRunnable implements Runnable{
//class MyRunnable extends A implements Runnable,Clossable{//还可以继承其他类和接口，这是该方法的一种优点
    //2.重写接口中的抽象方法run()，设置线程任务
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程输出："+i);
        }
    }
}