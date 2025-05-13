import java.util.Scanner;//导入java.util包下的Scanner类，用于从标准输入读取用户输入的数据

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//创建一个Scanner对象scanner，用于读取用户从控制台输入的数据
        System.out.print("请输入收入金额: ");//输出提示信息
        double income = scanner.nextDouble();//用户输入
        double tax = calculateTax(income);//调用方法，传入用户输入的数据，将结果赋给tax变量
        System.out.printf("应缴纳的个人所得税为: %.2f", tax);//输出结果
    }

    public static double calculateTax(double income) {
        double threshold = 5000;//起点为5000元
        double taxableIncome = income - threshold;//收入减去起征点
        double tax = 0;
        if (taxableIncome > 0) {//按区间缴税
            if (taxableIncome <= 1500) {
                tax = taxableIncome * 0.03;
            } else if (taxableIncome <= 4500) {
                tax = 1500 * 0.03 + (taxableIncome - 1500) * 0.1;
            } else if (taxableIncome <= 9000) {
                tax = 1500 * 0.03 + 3000 * 0.1 + (taxableIncome - 4500) * 0.2;
            } else if (taxableIncome <= 35000) {
                tax = 1500 * 0.03 + 3000 * 0.1 + 4500 * 0.2 + (taxableIncome - 9000) * 0.25;
            } else if (taxableIncome <= 55000) {
                tax = 1500 * 0.03 + 3000 * 0.1 + 4500 * 0.2 + 26000 * 0.25 + (taxableIncome - 35000) * 0.3;
            } else if (taxableIncome <= 80000) {
                tax = 1500 * 0.03 + 3000 * 0.1 + 4500 * 0.2 + 26000 * 0.25 + 20000 * 0.3 + (taxableIncome - 55000) * 0.35;
            } else {
                tax = 1500 * 0.03 + 3000 * 0.1 + 4500 * 0.2 + 26000 * 0.25 + 20000 * 0.3 + 25000 * 0.35 + (taxableIncome - 80000) * 0.45;
            }
        }
        return tax;//返回应缴税的值
    }
}