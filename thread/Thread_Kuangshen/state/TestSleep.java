package Thread_Kuangshen.state;

//模拟网络延时:放大问题的发生性
public class TestSleep implements Runnable{
    private int ticketNums = 10;
    @Override
    public void run() {
        while(true){
            if(ticketNums<=0){
                break;
            }
            //模拟延时
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"--->拿到了第"+ticketNums--+"票");
        }
    }

    public static void main(String[] args) {
        TestSleep t1 = new TestSleep();
        Thread t2 = new Thread(t1, "小明");
        Thread t3 = new Thread(t1, "老师");
        Thread t4 = new Thread(t1, "黄牛");
        t2.start();
        t3.start();
        t4.start();

        //发现问题：多个线程同时操作同一个资源的情况下，线程不安全，数据紊乱。
    }
}
