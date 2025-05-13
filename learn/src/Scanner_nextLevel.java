import java.util.Scanner;

public class Scanner_nextLevel {
    public static void main(String[] args) {
        //输入多个数字，并求其总和与平均数，每输入一个数字用回车确认，通过输入非数字来结束输入并输出执行结果
        Scanner scan=new Scanner(System.in);
        double sum=0;
        int m=0;
        while(scan.hasNextDouble()){
            double x=scan.nextDouble();
            m=m+1;
            sum=sum+x;
        }
        System.out.println(m+"个数的和为"+sum);
        System.out.println(m+"个数的平均值是"+(sum/m));
        scan.close();//这里是scan
    }
}
