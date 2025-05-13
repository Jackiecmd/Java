package com.oop.demo04;

//类  private 私有
public class Student {
    private String name;
    public String name2;
    //性别
    private char sex;
    private int age;

    //提供一些可以操作这个属性的方法！
    //提供一些public 的get、set方法

    //get 获得这个数据

    /*public String getName(){
        return this.name;
    }
    //set 给这个数据设置值

    public void setName(String name){
        this.name=name;
    }
    */
    //快捷键alt+insert会自动生成get和set

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>120||age<0){
            this.age=3;
        }else {
            this.age = age;
        }
    }
}
