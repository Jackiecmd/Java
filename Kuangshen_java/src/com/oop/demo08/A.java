package com.oop.demo08;

//abstract   抽象类：类  extends：单继承    （接口可以多继承）
//抽象类的所有方法，继承了它的子类，都必须要实现它的方法~除非子类也是abstract~
/*public class A extends Action{
}这样子会报错
 */

/*public abstract class A extends Action{

}这样子不会报错（子类也算是抽象的，让子子类去实现）*/

public class A extends Action{
    //通过重写父类的方法。
    @Override
    public void doSomething() {

    }
}

/**
 * 抽象类的特点
 * 1.不能new这个抽象类，只能靠子类去实现它：约束！（见Application第五行）
 * 2.一个类有了抽象方法，自己必须是抽象类。抽象类里面可以写普通方法，抽象方法必须在抽象类中
 *
 * 思考：抽象类不能new对象，那它存在构造器吗
 *
 */