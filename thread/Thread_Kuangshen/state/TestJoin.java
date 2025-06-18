package Thread_Kuangshen.state;

import Thread_extra.Test;

//测试join方法（想象为插队）
public class TestJoin implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("线程vip来了"+1);
        }
    }

    public static void main(String[] args) {
        TestJoin testJoin=new TestJoin();
        Thread t1=new Thread(testJoin);
    }
}
