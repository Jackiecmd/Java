package Thread_Kuangshen.state;

import java.text.SimpleDateFormat;
import java.util.Date;

//模拟倒计时
public class TestSleep2 {

    public static void main(String[] args) {
        //打印系统当前时间
        Date startTime=new Date(System.currentTimeMillis());//获取系统当前时间
        int count=10;
        while(true){
            try {
                Thread.sleep(1000);
                System.out.println(new SimpleDateFormat("HH:mm:ss").format(startTime));
                startTime=new Date(System.currentTimeMillis());//更新当前时间
                count--;
                if(count<=0){
                    break;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //模拟倒计时
    public static void tenDown() throws InterruptedException {//十秒钟倒计时
        int num=10;
        while(true){
            Thread.sleep(1000);
            System.out.println(num--);
            if(num<=0){
                break;
            }
        }
    }
}
