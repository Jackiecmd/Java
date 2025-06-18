package Thread_Kuangshen.demo01;
//创建线程方式二：实现Runnable接口，重写run方法，执行线程需要丢入Runnable接口的实现类，调用start方法启动线程
public class TestThread2 implements Runnable{
    @Override
    public void run() {
        //run方法线程体
        for(int i=0;i<20;i++){
            System.out.println("我在看代码----"+i);
        }
    }

    public static void main(String[] args) {
        //创建Runnable接口的实现类对象
        //TestThread2 t2=new TestThread2();
        //创建Thread类对象，构造方法中传递Runnable接口的实现类对象
       // Thread t1=new Thread(t2);
       // t1.start();
        //精简一下：
        new Thread(new TestThread2()).start();
        for (int i = 0; i < 20; i++) {
            System.out.println("我在学习多线程"+i);
        }
    }
}