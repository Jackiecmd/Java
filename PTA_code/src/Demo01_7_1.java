import java.util.Scanner;

public class Demo01_7_1{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String name =sc.nextLine();
    int age=sc.nextInt();
    String college=sc.nextLine();
    String major=sc.nextLine();
    String className=sc.nextLine();
    sc.close();
        System.out.println("姓名：张三");
        System.out.println("年龄：20");
        System.out.println("所在学院：计算机学院");
        System.out.println("所在专业：计算机科学与技术");
        System.out.println("所在班级：1班");
    }
}