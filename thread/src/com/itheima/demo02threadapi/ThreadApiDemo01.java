package com.itheima.demo02threadapi;
//这里直接用的D:\java代码\learn\Heima\thread\src\com.itheima.demo01creat\Test.java的代码来改进
public class ThreadApiDemo01 {
    public static void main(String[] args) {
        //目标：搞清楚线程的常用方法
        Thread t1 = new MyThread("1号线程");
        t1.setName("1号线程");//为t1起个名字//起名字要放在线程启动之前
        t1.start();
        //区分：
        System.out.println(t1.getName());//默认名称是Thread-索引

        //Thread t2=new MyThread();
        //t2.setName("2号线程");
        //这里尝试使用有参构造器来设置名字
        //t2=new MyThread("2号线程");//但是目前子类MyThread没有提供构造器，所以会报错，所以需要子类去提供一下
        //或进一步简写为：
        Thread t2=new MyThread("2号线程");
        t2.start();//这里都是子线程输出，无法分辨到底是哪个线程在执行各自的任务，所以需要区分
        System.out.println(t2.getName());

        //哪个代码在调用这个代码，这个代码就拿到哪个线程
        Thread m = Thread.currentThread();//这里输入Thread.currentThread().var按回车//主线程
        m.setName("主线程");
        System.out.println(m.getName());//主线程的名字是main
    }
}

class MyThread extends Thread{
    //接第15行，创建子类的有参构造器
    public MyThread(String name){
        super(name);//调用的父类构造器public Thread(String name)传递名字
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+"子线程输出"+i);//把名字输出出来，便于区分
        }
    }
}
