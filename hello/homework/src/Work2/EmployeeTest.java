package Work2;

public class EmployeeTest {
    public static void main(String[] args) {
        // 使用无参构造方法创建员工对象
        Employee employee1 = new Employee();
        System.out.println("员工 1 信息：");
        System.out.println("员工编号: " + employee1.getEmployeeId());
        System.out.println("员工姓名: " + employee1.getName());
        System.out.println("基本薪资: " + employee1.getBaseSalary());
        System.out.println("年度奖金: " + employee1.calculateAnnualBonus());

        // 使用有参构造方法创建员工对象
        Employee employee2 = new Employee(2, "张三", 6000);
        System.out.println("\n员工 2 信息：");
        System.out.println("员工编号: " + employee2.getEmployeeId());
        System.out.println("员工姓名: " + employee2.getName());
        System.out.println("基本薪资: " + employee2.getBaseSalary());
        System.out.println("年度奖金: " + employee2.calculateAnnualBonus());

        // 测试设置基本薪资
        employee2.setBaseSalary(4000);
        System.out.println("\n尝试设置员工 2 基本薪资为 4000 元后：");
        System.out.println("基本薪资: " + employee2.getBaseSalary());
        System.out.println("年度奖金: " + employee2.calculateAnnualBonus());
    }
}

