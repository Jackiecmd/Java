package Exception异常处理;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo05 {
    public static void main(String[] args) {
        //目标：掌握异常的处理方案1：底层异常都抛出去给最外层调用者，最外层捕获异常，记录异常，响应合适信息给用户观看。
        System.out.println("程序开始");
        try {
            System.out.println("1");
            show2();
            System.out.println("程序运行成功");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("程序运行失败");
        }
        System.out.println("程序结束");
    }

    public static void show2() throws Exception {
        String str="2024-07-09 11:12:13";
        //把字符串时间解析成Java中的一个日期对象
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date =sdf.parse(str);//编译时异常，提醒程序员这里的程序很容易出错，需要注意！//在parse那里按住alt+Enter+Enter，生成throw（第8、13行）
        System.out.println(date);
    }
}
