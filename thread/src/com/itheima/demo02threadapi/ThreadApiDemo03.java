package com.itheima.demo02threadapi;

public class ThreadApiDemo03 {
    public static void main(String[] args) {
        //目标：搞清楚线程的join方法，线程插队，让调用这个方法的线程先执行完毕
        MyThread2 t1 = new MyThread2();
        t1.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + "主线程输出：" + i);
            if (i == 1) {
                try {
                    t1.join();//插队，让 t1线程先执行完毕，然后继续执行主线程
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName()+"子线程输出"+i);//把名字输出出来，便于区分
        }
    }
}
