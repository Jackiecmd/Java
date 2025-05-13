package Test5;


public class StudentManagement {
    public static void main(String[] args) {
        // 创建一个长度为 3 的学生数组
        Student[] students = new Student[3];
        // 初始化 3 个学生对象
        students[0] = new Student("heima001", "张三", 20);
        students[1] = new Student("heima003", "李四", 21);
        students[2] = new Student("heima004", "王五", 22);

        // 要求 1：添加一个学生对象，并进行学号唯一性判断
        Student newStudent = new Student("heima005", "赵六", 23);
        students = addStudent(students, newStudent);

        // 要求 2：添加完毕后，遍历所有学生信息
        System.out.println("添加学生后所有学生信息：");
        printStudents(students);

        // 要求 3：通过 id 删除学生信息
        String idToDelete = "heima003";
        students = deleteStudent(students, idToDelete);

        // 要求 4：删除完毕后，遍历所有学生信息
        System.out.println("删除学生后所有学生信息：");
        printStudents(students);

        // 要求 5：查询数组 id 为 "heima002" 的学生，如果存在，则将他的年龄 +1 岁
        String idToQuery = "heima002";
        updateStudentAge(students, idToQuery);

        System.out.println("更新年龄后所有学生信息：");
        printStudents(students);
    }

    // 添加学生方法，包含学号唯一性判断
    public static Student[] addStudent(Student[] students, Student newStudent) {
        for (Student student : students) {
            if (student != null && student.getId().equals(newStudent.getId())) {
                System.out.println("学号已存在，添加失败");
                return students;
            }
        }
        // 扩展数组长度
        Student[] newStudents = new Student[students.length + 1];
        System.arraycopy(students, 0, newStudents, 0, students.length);
        newStudents[students.length] = newStudent;
        System.out.println("学生添加成功");
        return newStudents;
    }

    // 遍历学生信息方法
    public static void printStudents(Student[] students) {
        for (Student student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }
    }

    // 删除学生方法
    public static Student[] deleteStudent(Student[] students, String id) {
        int indexToDelete = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getId().equals(id)) {
                indexToDelete = i;
                break;
            }
        }
        if (indexToDelete != -1) {
            // 收缩数组长度
            Student[] newStudents = new Student[students.length - 1];
            int newIndex = 0;
            for (int i = 0; i < students.length; i++) {
                if (i != indexToDelete) {
                    newStudents[newIndex++] = students[i];
                }
            }
            System.out.println("学生删除成功");
            return newStudents;
        } else {
            System.out.println("学生不存在，删除失败");
            return students;
        }
    }

    // 更新学生年龄方法
    public static void updateStudentAge(Student[] students, String id) {
        for (Student student : students) {
            if (student != null && student.getId().equals(id)) {
                student.setAge(student.getAge() + 1);
                System.out.println("学生年龄已更新");
                return;
            }
        }
        System.out.println("未找到该学生，无法更新年龄");
    }
}
