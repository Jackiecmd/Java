package com.itheima.demo01creat;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ThreadDemo03 {
    public static void main(String[] args) {
        //目标：掌握多线程的创建方式三：实现Callable接口，方式三的优势：可以获取线程执行完毕后的结果

        //3.创建一个实现Callable接口的实现类对象。
        //MyCallable mc = new MyCallable(100);
        Callable c1 = new MyCallable(100);//这样写能体现多态

        //但是这个任务不是线程任务对象
        //4.把Callable对象封装成一个真正的线程任务对象FutureTask对象。

        /**
         * 未来任务对象的作用：
         * 1.本质是一个Runnable线程任务对象（比如下面的第二行可以用Runnable），可以交给Thread线程对象处理
         * 2.可以获取线程执行完毕后的结果
         */
        FutureTask<String> f1 = new FutureTask<>(c1);
        Runnable f = new FutureTask<>(c1);

        //5.把FutureTask对象做为参数传递给Thread对象。
        Thread t1 = new Thread(f1);
        // 6.启动线程
        t1.start();

        //再创建一个线程
        Callable c2 = new MyCallable(50);
        FutureTask<String> f2 = new FutureTask<>(c2);
         Thread t2 = new Thread(f2);
          t2.start();

          // 获取线程执行完毕后返回的结果
        try{
            //如果发现第一个线程还没有结束，会让出cpu，等第一个线程执行完毕侯才会进行下一个（往下进行）
             System.out.println(f1.get());
        } catch (Exception e) {
            e.printStackTrace();
        }

         try{
             //如果主线程发现第二个线程还没有执行完，会让出cpu，等第一个线程执行完才会往下执行
             System.out.println(f2.get());
        } catch (Exception e) {
            e.printStackTrace();
        }

         //上面是分开try-catch的，建议这样写
        }
    }


//1.定义一个实现类实现Callable接口
class MyCallable implements Callable<String> {  //尖括号中是要返回的类型
    private int n;
     public MyCallable(int n) {
        this.n = n;
    }
    @Override
    //2.实现call方法，定义线程执行体
    public String call() throws Exception {//这里的返回类型和上面定义实现类中尖括号的相同
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return "子线程计算1-"+n+"的结果是:"+sum;
    }
}
