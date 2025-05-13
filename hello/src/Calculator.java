import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("请输入一个数学表达式（格式：数字 运算符 数字，例如：3 + 5），输入 'q' 退出：");
            String input = scanner.nextLine();

            if ("q".equalsIgnoreCase(input)) {
                isRunning = false;
                System.out.println("退出计算器。");
            } else {
                try {
                    String[] parts = input.split(" ");
                    if (parts.length != 3) {
                        System.out.println("输入格式错误，请按照 '数字 运算符 数字' 的格式输入。");
                        continue;
                    }

                    double num1 = Double.parseDouble(parts[0]);
                    String operator = parts[1];
                    double num2 = Double.parseDouble(parts[2]);

                    double result = performCalculation(num1, operator, num2);
                    System.out.println("计算结果：" + result);
                } catch (NumberFormatException e) {
                    System.out.println("输入的数字格式错误，请输入有效的数字。");
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
        scanner.close();
    }

    public static double performCalculation(double num1, String operator, double num2) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 == 0) {
                    throw new IllegalArgumentException("错误：除数不能为零。");
                }
                return num1 / num2;
            default:
                throw new IllegalArgumentException("错误：不支持的运算符。请使用 +、-、* 或 /。");
        }
    }
}