package Thread_Kuangshen.state;
//测试礼让线程
//礼让不一定成功，看CPU心情
public class TestYield {
    public static void main(String[] args) {
        MyYield myYield=new MyYield();
        new Thread(myYield,"A").start();
        new Thread(myYield,"B").start();
        //A线程开始执行
        //B线程开始执行
        //A线程停止执行
        //B线程停止执行:礼让成功

        //注释掉礼让，得到礼让不成功的情况：
        //A线程开始执行
        //A线程停止执行
        //B线程开始执行
        //B线程停止执行
    }
}
class MyYield implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"线程开始执行");
        //Thread.yield();//礼让
        System.out.println(Thread.currentThread().getName()+"线程停止执行");
    }
}
