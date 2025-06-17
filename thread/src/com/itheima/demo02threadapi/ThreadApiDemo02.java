package com.itheima.demo02threadapi;

public class ThreadApiDemo02 {
    public static void main(String[] args) {
         //目标：搞清楚Thread类的Sleep方法（线程休眠）
         for (int i = 1; i <= 10; i++) {
             System.out.println(i);
              try {//用try-catch是因为这是一个异常，担心时间有问题或者这个线程被其他线程干扰
                  //让当前执行的线程进入休眠状态，直到时间到了，才会继续执行
                  //
                 Thread.sleep(1000);//1000ms(=1s)
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }
    }
}
