package com.itheima.demo04_synchronized_code;

//取钱线程类
public class DrawThread extends  Thread{
    private Account acc;//用于记住线程对象要处理的账户对象
    public DrawThread(String name, Account acc) {
        super(name);
         this.acc = acc;
    }

    @Override
    public void run() {
        //小明 / 小红 取钱
        acc.drawMoney(100000);//这个方法由账户提供
    }
}
