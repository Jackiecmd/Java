package com.oop.demo04;
import com.oop.demo04.Student;
public class Application {
    public static void main(String[] args) {
        Student s1 = new Student();
        //错误写法：s1.name="1";
        s1.name2="cj";

        String name=s1.getName();
        s1.setName("cjcj");
        System.out.println(s1.getName());

        s1.setAge(18);
        System.out.println(s1.getAge());//直接输入s1.getAge.sout即可
        s1.setAge(190);
        System.out.println(s1.getAge());
        s1.setAge(-1);
        System.out.println(s1.getAge());
    }
}
