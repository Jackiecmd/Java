import java.util.Scanner;

public class Scanner_detailed {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);//创建一个Scanner类实例接收控制台输入的数据
        System.out.println("next方式接收：");
        if(scan.hasNext())//判断控制台是否输入了数据
        {
            String str1=scan.next();//调用接收输入数据方法获取输入字符
            System.out.println("接收到的是:"+str1);
        }
        //scan.close();//使用完Scanner类实例后，必须进行关闭！！！！！


        //hasNextLine方法


        System.out.println("nextLine方式接收：");
        if(scan.hasNextLine()){//判断控制台是否输入了数据
            String str2=scan.nextLine();//调用接收输入数据的方法获取输入字符
            System.out.println("接收到的数据是："+str2);
        }
        scan.close();

    }
}
