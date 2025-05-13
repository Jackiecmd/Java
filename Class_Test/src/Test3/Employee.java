package Test3;

// 定义员工类Employee
class Employee {
    // 姓名属性
    protected String name;
    // 年龄属性
    protected int age;

    // 构造方法，用于初始化姓名和年龄
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 显示信息的方法
    public void showInfo() {
        System.out.println("姓名: " + name + ", 年龄: " + age);
    }
}