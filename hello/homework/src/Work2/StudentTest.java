package Work2;

    public class StudentTest { // 定义公共测试类StudentTest

        /**
         * 主方法 - 程序入口
         * @param args 命令行参数（未使用）
         */
        public static void main(String[] args) {
            // 打印测试1的标题
            System.out.println("===== 测试1：无参构造方法 =====");
            // 使用无参构造方法创建Student对象student1
            Student student1 = new Student();
            // 打印提示信息
            System.out.println("默认创建的学生对象：");
            // 调用student1的toString方法并打印结果
            System.out.println(student1.toString());

            // 打印测试2的标题，\n表示换行
            System.out.println("\n===== 测试2：全参构造方法 =====");
            // 使用全参构造方法创建Student对象student2
            Student student2 = new Student("学生", "000000", 20, "计算机科学与技术");
            // 打印提示信息
            System.out.println("使用全参构造方法创建的学生对象：");
            // 直接打印student2，会自动调用toString方法
            System.out.println(student2);

            // 打印测试3的标题
            System.out.println("\n===== 测试3：使用setter方法 =====");
            // 打印修改前的学生信息
            System.out.println("修改前的学生1信息：");
            System.out.println(student1);

            // 使用setter方法修改student1的属性
            student1.setName("李四");    // 设置新姓名
            student1.setId("20230002"); // 设置新学号
            student1.setAge(21);       // 设置新年龄
            student1.setMajor("软件工程"); // 设置新专业

            // 打印修改后的学生信息
            System.out.println("\n修改后的学生1信息：");
            System.out.println(student1);

            // 打印测试4的标题
            System.out.println("\n===== 测试4：使用getter方法 =====");
            // 打印提示信息
            System.out.println("学生2的详细信息：");
            // 使用getter方法获取并打印各个属性
            System.out.println("姓名：" + student2.getName());    // 获取姓名
            System.out.println("学号：" + student2.getId());     // 获取学号
            System.out.println("年龄：" + student2.getAge());    // 获取年龄
            System.out.println("专业：" + student2.getMajor());  // 获取专业

            // 打印测试5的标题
            System.out.println("\n===== 测试5：异常情况测试 =====");
            // 使用try-catch块捕获可能抛出的异常
            try {
                // 尝试设置非法年龄值
                student1.setAge(200);  // 这将抛出IllegalArgumentException
            } catch (IllegalArgumentException e) {
                // 捕获到异常后执行的代码
                System.out.println("捕获到异常：" + e.getMessage());
                // 打印当前年龄值
                System.out.println("年龄设置失败，当前年龄保持为：" + student1.getAge());
            }
        }

}
