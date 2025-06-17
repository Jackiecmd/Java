package com.itheima.demo01creat;

public class ThreadDemo02_2 {
    public static void main(String[] args) {
        //目标：掌握多线程的创建方式二：使用Runnable接口的匿名内部类来创建
        Runnable r=new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("子线程1："+i);
                }
            }
        };

        //4.把匿名内部类对象作为参数传递给Thread类的构造方法，创建Thread对象
        Thread t1=new Thread(r);
        //5.调用Thread对象的start方法，开启新线程
        t1.start();


        //还有更简洁的写法：
       new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("子线程2："+i);
                }
            }
        }).start();

//还能更简洁（上面第22行有标灰的）
        new Thread(()->{
            for (int i = 0; i < 5; i++) {
                System.out.println("子线程3："+i);
            }
        }).start();


        for (int i = 0; i < 5; i++) {
            System.out.println("主线程："+i);
        }
    }
}

//这里就有了四个线程。
