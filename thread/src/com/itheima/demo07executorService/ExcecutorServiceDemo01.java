package learn.Heima.thread.src.com.itheima.demo07executorService;

import java.util.concurrent.*;

public class ExcecutorServiceDemo01 {
    public static void main(String[] args) {
        //目标：创建线程池对象来使用
        //1.使用线程池的实现类ThreadPoolExecutor声明七个参数来创建线程池对象。
        ExecutorService pool=new ThreadPoolExecutor(3,5,
                10, TimeUnit.SECONDS,new ArrayBlockingQueue<>(3),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        //2.使用线程池处理任务，看会不会复用线程池
        Runnable target = new MyRunnable();
        pool.execute(target);//提交第一个任务，创建线程 自动启动线程处理这个任务
        pool.execute(target);
        pool.execute(target);//提交了三个任务

    }
}
