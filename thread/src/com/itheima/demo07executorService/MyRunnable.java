package learn.Heima.thread.src.com.itheima.demo07executorService;


//1.定义一个线程任务类实现Runnanble接口
public class MyRunnable implements Runnable{
//class MyRunnable extends A implements Runnable,Clossable{//还可以继承其他类和接口，这是该方法的一种优点
    //2.重写接口中的抽象方法run()，设置线程任务
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+"输出"+i);
        }
    }
}