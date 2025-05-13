package Test3;
    // 定义经理类Manager，继承自Employee类
    class Manager extends Employee {
        // 经理类的构造方法，调用父类构造方法初始化属性
        public Manager(String name, int age) {
            super(name, age);
        }

        // 重写父类的showInfo方法
        @Override
        public void showInfo() {
            System.out.println("经理 - 姓名: " + name + ", 年龄: " + age);
        }
}
