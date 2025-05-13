package Test3;

public class Main {
    // Java 程序的入口点 main 方法
    public static void main(String[] args) {
        // 创建Manager对象
        Manager manager = new Manager("张三", 30);
        // 向上转型为Employee类型
        Employee emp1 = manager;
        // 调用showInfo方法
        emp1.showInfo();

        // 创建Developer对象
        Developer developer = new Developer("李四", 28);
        // 向上转型为Employee类型
        Employee emp2 = developer;
        // 调用showInfo方法
        emp2.showInfo();
    }
}