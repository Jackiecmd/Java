package Test3;

// 定义开发人员类Developer，继承自Employee类
class Developer extends Employee {
    // 开发人员类的构造方法，调用父类构造方法初始化属性
    public Developer(String name, int age) {
        super(name, age);
    }

    // 重写父类的showInfo方法
    @Override
    public void showInfo() {
        System.out.println("开发人员 - 姓名: " + name + ", 年龄: " + age);
    }
}