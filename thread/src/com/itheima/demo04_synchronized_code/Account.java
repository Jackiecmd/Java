package com.itheima.demo04_synchronized_code;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private String cardId;
     private double money;


     //小明和小红都到这里来取钱
     public void drawMoney(double money){
         //拿到当前是谁来取钱
         String name = Thread.currentThread().getName();
         //判断余额是否足够
         //Java中只有对象可以作为锁
         synchronized (this) {//选中后按ctrl+alt+t选第九个//用this上锁，this指向当前调用方法的Account对象，不会互相影响
             if(this.money >= money){
                 //一定要先更新余额
                 this.money -= money;//减的是当前账户对象的钱
                 System.out.println(name+"取钱成功！取钱金额："+money);
                   System.out.println("取钱后余额："+this.money);
             }else{
                 //余额不足
                  System.out.println(name+"取钱失败！余额不足！");
             }
         }
     }
}
