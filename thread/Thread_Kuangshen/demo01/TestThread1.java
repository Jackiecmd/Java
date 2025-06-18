package Thread_Kuangshen.demo01;
//创建线程方式一：继承Thread类，重写run方法，调用start方法启动线程
public class TestThread1 extends  Thread{
    @Override
    public void run() {
        //run方法线程体
        for(int i=0;i<20;i++){
            System.out.println("我在看代码----"+i);
        }
    }

    public static void main(String[] args) {
        //main线程，主线程

        //创建线程对象
        TestThread1 t1=new TestThread1();
        //调用start方法启动线程
        t1.start();
       // t1.run();//直接调用run方法也可以，只不过先后就确定了

        for (int i = 0; i < 200; i++) {
            System.out.println("我在学习多线程"+1);
        }
    }

    //其实线程开启了也不一定执行，是由CPU调度执行
}
