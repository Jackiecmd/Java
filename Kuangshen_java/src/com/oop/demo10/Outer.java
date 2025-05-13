package com.oop.demo10;
 //外部类
public class Outer {
    private  int id=10;
    public void out(){
        System.out.println("这是外部类的方法");
    }

    public /*static*/ class Inner{//如果这里加上static变成静态的内部类，第16行就无效了
        public void in(){
            System.out.println("这是内部类的方法");
        }

        //获得外部类的私有属性
        public void getID(){
            System.out.println(id);
        }
    }

    //一个java类中可以有多个class类，但是只能有一个public class

     public void method(){
        class Inner{//局部内部类
            public void in(){

            }
         }
     }
}
