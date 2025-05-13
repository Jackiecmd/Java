package Test5;


// 定义学生类
class Student {
    private String id;
    private String name;
    private int age;

    // 构造函数
    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // 获取学号
    public String getId() {
        return id;
    }

    // 获取姓名
    public String getName() {
        return name;
    }

    // 获取年龄
    public int getAge() {
        return age;
    }

    // 设置年龄
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
