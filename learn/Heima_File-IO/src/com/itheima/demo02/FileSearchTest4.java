package com.itheima.demo02;

import java.io.File;
import java.io.IOException;

public class FileSearchTest4 {
    public static void main(String[] args) {
        //目标：完成文件搜索。找出D：盘下的QQ.exe的位置。
        try {
            File dir=new File("D:/");
            searchFile(dir,"QQ.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 搜索文件
     * @param dir  搜索的目录/文件夹
     * @param fileName  搜索的文件名
     */
    public static void searchFile(File dir,String fileName) throws IOException {
        //1.判断dir是否是文件夹/目录
        if(dir==null || !dir.exists()||dir.isFile()){
            return;//不搜索
        }

        //2.获取目录下的所有一级文件或者文件夹对象
        File[] files=dir.listFiles();

        //3.判断当前目录下是否存在一级文件对象，存在才可以遍历
        if(files!=null && files.length>0){//数组对象要存在，且里面有元素，这里且前后不能交换位置
            //4.遍历一级文件对象
            for(File file:files){
                //5.判断当前一级文件对象是否是文件
                if(file.isFile()){
                    //6.判断文件名是否是目标文件名
                    if(file.getName().equals(fileName)){
                        System.out.println("找到文件："+file.getAbsolutePath());
                        Runtime r=Runtime.getRuntime();
                        r.exec(file.getAbsolutePath());//这里抛异常，然后就可以启动QQ了！
                    }
                }else{
                    //7.判断当前一级文件对象是否是文件夹,是就递归继续搜索
                    searchFile(file,fileName);
                }
            }
        }
    }
}
