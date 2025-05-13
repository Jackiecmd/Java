package Exception异常处理;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo01 {
    public static void main(String[] args) /*throws ParseException*/ {
        //异常分为运行时异常和编译时异常
        //show();
        try {//监视代码，若出现异常，会被catch拦截住
            show2();
        } catch (ParseException e) {
            e.printStackTrace();//打印这个异常信息
        }
    }
    public static void show2() throws ParseException {
        String str="2024-07-09 11:12:13";
        //把字符串时间解析成Java中的一个日期对象
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date =sdf.parse(str);//编译时异常，提醒程序员这里的程序很容易出错，需要注意！//在parse那里按住alt+Enter+Enter，生成throw（第8、13行）
        System.out.println(date);
    }
    //定义一个运行时异常
    public static void show(){
        //运行时异常的特点：编译阶段不报错，运行时出现异常，都继承自RuntimeException(运行时异常)
        int[] arr={1,2,3};
        System.out.println(arr[3]);//异常出现时程序就结束了
    }
}
