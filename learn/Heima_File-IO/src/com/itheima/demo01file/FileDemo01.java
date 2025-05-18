package com.itheima.demo01file;

import java.io.File;
import java.io.IOException;

public class FileDemo01 {
    public static void main(String[] args) throws IOException {
        //目标：创建File创建对象代表文件（文件夹/目录），搞清楚其提供的对文件进行操作的方法
        //1.创建File对象，去获取某个文件的信息
        File f1 = new File("D:\\51 2405060317 余强仁寿县铧强中学\\51 2405060317 仁寿县铧强中学活动总结.docx");
        File f11 = new File("D:/51 2405060317 余强仁寿县铧强中学/51 2405060317 仁寿县铧强中学活动总结.docx");//一个斜杠也是可以的
        //如果出现了\n，java会把其当作换行符，此时需要改成\\n（转义操作）
        System.out.println(f1.length());//打印字节个数
        System.out.println(f1.getName());
        System.out.println(f1.isFile());//true
        System.out.println(f1.isDirectory());//false(不是文件夹）

        //2.可以使用相对路径定位文件对象
        //只要带盘符的都称之为：绝对路径
        //相对路径：不带盘符，默认是到idea工程下直接寻找文件的。一般用是来找工程下的项目文件的
        File f=new File("D:\\java代码\\learn\\Heima_File-IO\\src\\dilei01.txt");//绝对路径
        File f2=new File("learn\\Heima_File-IO\\src\\dilei01.txt");//相对路径
         System.out.println(System.getProperty("user.dir")); // 输出当前工作目录
        //相对路径的话，传给别人比较好。绝对路径在别人电脑中的存储可能不一样
        //崩溃了这个相对路径，一直没搞好//
        System.out.println(f.length());
        System.out.println(f2.length());
        System.out.println(f.exists());
        System.out.println(f2.exists());

        System.out.println("--------------");
        //3.创建对象代表不存在的文件路径。
        File f3=new File("D:\\java代码\\learn\\Heima_File-IO\\src\\dilei02.txt");
        System.out.println(f3.exists());
        System.out.println(f3.createNewFile());//创建文件(会提示异常，这里alt+Enter抛出去就可以了）
        System.out.println(f3.exists());

        System.out.println("-----------");
        //4. 创建对象代表不存在的文件夹路径
        File f4=new File("D:\\java代码\\learn\\Heima_File-IO\\src\\dilei03");
        System.out.println("f4存在？"+f4.exists());
        System.out.println(f4.mkdir());
        //创建一个三级文件夹
        File f5=new File("D:\\java代码\\learn\\Heima_File-IO\\src\\dilei04\\dilei05\\dilei06");
        System.out.println(f5.mkdirs());
        //已懵比。。

        //5.创建File对象代表存在的文件，然后删除它
        File f6=new File("D:\\java代码\\learn\\Heima_File-IO\\src\\dilei02.txt");
        System.out.println(f6.delete());//删除成功返回true

        //6.创建File对象代表存在的文件夹，然后删除它
        File f7=new File("D:\\java代码\\learn\\Heima_File-IO\\src\\dilei03");
        System.out.println(f7.delete());//只能删除空文件夹，不能删除非空文件夹（删除后不会进回收站，直接就没了）

        //7.获取某个目录下的全部一级文件名称
        File f8=new File("D:\\java代码\\learn\\Heima_File-IO\\src");
        String[] names0=f8.list();
        for (String name : names0) {
            System.out.println(name);
        }

        System.out.println("-=====");
        //8.可以获取某个目录下的全部一级文件名称
        File f9=new File("D:\\java代码\\learn\\Heima_File-IO\\src");
        String[] names=f9.list();
        for (String name : names) {//增强for循环
            System.out.println(name);
        }

        System.out.println("======");
        //9.获取某个目录下的全部一级文件对象
        File f10=new File("D:\\java代码\\learn\\Heima_File-IO\\src");
        File[] files=f10.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
        //当主调是文件或者路径不存咋在时，会返回null
        File dir=new File("D:\\java代码\\learn\\Heima_File-IO\\src\\dilei01.txt");
        File[] files1=dir.listFiles();
        System.out.println(files1);
        //当主调是空文件夹时，返回空数组
    }
}
