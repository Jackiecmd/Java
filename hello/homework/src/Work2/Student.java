package Work2;


    public class Student { // 定义公共类Student，类名必须与文件名一致

        // 声明私有成员变量name，用于存储学生姓名
        // 使用private修饰符确保封装性
        private String name;

        // 声明私有成员变量id，用于存储学生学号
        // 学号通常包含字母和数字组合
        private String id;

        // 声明私有成员变量age，用于存储学生年龄
        // 使用基本数据类型int存储
        private int age;

        // 声明私有成员变量major，用于存储学生专业
        // 专业名称通常是字符串类型
        private String major;

        /**
         * 无参构造方法
         * 功能：创建一个带有默认值的学生对象
         * 注意：当不提供任何参数时使用此构造方法
         */
        public Student() {
            // 为name赋默认值"未命名"
            this.name = "未命名";
            // 为id赋默认值"000000"
            this.id = "000000";
            // 为age赋默认值18
            this.age = 18;
            // 为major赋默认值"未定"
            this.major = "未定";
        }

        /**
         * 全参构造方法
         * @param name 学生姓名（String类型）
         * @param id 学生学号（String类型）
         * @param age 学生年龄（int类型）
         * @param major 学生专业（String类型）
         * 功能：使用指定参数创建学生对象
         */
        public Student(String name, String id, int age, String major) {
            // 使用this关键字区分成员变量和参数
            // 将参数name赋值给成员变量name
            this.name = name;
            // 将参数id赋值给成员变量id
            this.id = id;
            // 将参数age赋值给成员变量age
            this.age = age;
            // 将参数major赋值给成员变量major
            this.major = major;
        }

        /**
         * 获取学生姓名
         * @return 当前学生的姓名（String类型）
         */
        public String getName() {
            // 返回成员变量name的值
            return name;
        }

        /**
         * 设置学生姓名
         * @param name 要设置的新姓名（String类型）
         */
        public void setName(String name) {
            // 将参数name赋值给成员变量name
            this.name = name;
        }

        /**
         * 获取学生学号
         * @return 当前学生的学号（String类型）
         */
        public String getId() {
            // 返回成员变量id的值
            return id;
        }

        /**
         * 设置学生学号
         * @param id 要设置的新学号（String类型）
         */
        public void setId(String id) {
            // 将参数id赋值给成员变量id
            this.id = id;
        }

        /**
         * 获取学生年龄
         * @return 当前学生的年龄（int类型）
         */
        public int getAge() {
            // 返回成员变量age的值
            return age;
        }

        /**
         * 设置学生年龄
         * @param age 要设置的新年龄（int类型）
         * @throws IllegalArgumentException 当年龄不在0-150范围内时抛出
         */
        public void setAge(int age) {
            // 检查年龄是否在合理范围内
            if (age >= 0 && age <= 150) {
                // 如果合法，赋值给成员变量age
                this.age = age;
            } else {
                // 如果非法，抛出异常
                throw new IllegalArgumentException("年龄必须在0-150之间");
            }
        }

        /**
         * 获取学生专业
         * @return 当前学生的专业（String类型）
         */
        public String getMajor() {
            // 返回成员变量major的值
            return major;
        }

        /**
         * 设置学生专业
         * @param major 要设置的新专业（String类型）
         */
        public void setMajor(String major) {
            // 将参数major赋值给成员变量major
            this.major = major;
        }

        /**
         * 重写toString方法
         * @return 格式化的学生信息字符串
         * 功能：提供对象的标准字符串表示形式
         */
        @Override
        public String toString() {
            // 使用String.format格式化输出字符串
            return String.format(
                    // 格式化模板
                    "学生信息[姓名=%s, 学号=%s, 年龄=%d, 专业=%s]",
                    // 依次填入各个成员变量的值
                    name, id, age, major
            );
        }

}
