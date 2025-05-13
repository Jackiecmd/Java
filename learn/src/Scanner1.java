import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        //next与nextLine的区别
       // next（）：一定要读取到有效字符后才可以结束输入
        //对输入有效字符前遇到的空白，next（）方法会自动将其去掉
        //只有输入有效字符后才将其后面输入的空白作为分隔符或结束符
        //next（）不能得到带有空格的字符串

        //nextLine（）：
        //以Enter为结束符，即nextLine（）方法返回的是输入回车之前的所有字符。
        //可以获得空白
        //如果要输入int或float型的数据，在输入之前最好先使用hasNextXxx（）方法进行验证，再使用nextXxx（）来读取。

        int i=0;
        Scanner scan =new Scanner(System.in);
        System.out.println("请输入数据");
        if(scan.hasNextInt()){
            //判断i是否为整数
            i=scan.nextInt();
        }
        System.out.println(i);

        float b=0.0f;
        System.out.println("请输入一个浮点数");
        if(scan.hasNextFloat()){
            b=scan.nextFloat();
        }//都是先判断再获取
        System.out.println(b);
    }
}
