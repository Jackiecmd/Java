package Work2;

public class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;
    private static final double MIN_SALARY = 5000;

    // 无参构造方法
    public Employee() {
        this.employeeId = 0;
        this.name = "Unknown";
        this.baseSalary = MIN_SALARY;
    }

    // 有参构造方法
    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        if (baseSalary >= MIN_SALARY) {
            this.baseSalary = baseSalary;
        } else {
            System.out.println("基本薪资不能低于最低薪资标准，已设置为最低薪资。");
            this.baseSalary = MIN_SALARY;
        }
    }

    // Getter 和 Setter 方法
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary >= MIN_SALARY) {
            this.baseSalary = baseSalary;
        } else {
            System.out.println("基本薪资不能低于最低薪资标准，设置失败。");
        }
    }

    // 计算年度奖金的方法
    public double calculateAnnualBonus() {
        return baseSalary * 2.5;
    }
}