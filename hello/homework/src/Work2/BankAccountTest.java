package Work2;
/**
 * BankAccountTest 类用于测试 BankAccount 的各种功能
 */
public class BankAccountTest {
    public static void main(String[] args) {
        // 测试1：使用无参构造方法创建账户
        System.out.println("===== 测试1：默认账户 =====");
        BankAccount account1 = new BankAccount();
        System.out.println(account1);

        // 测试2：使用全参构造方法创建账户
        System.out.println("\n===== 测试2：自定义账户 =====");
        BankAccount account2 = new BankAccount("张三的储蓄账户", 1000.0);
        System.out.println(account2);

        // 测试3：存款操作
        System.out.println("\n===== 测试3：存款测试 =====");
        account2.deposit(500.0);  // 正常存款
        try {
            account2.deposit(-100.0);  // 非法存款
        } catch (IllegalArgumentException e) {
            System.out.println("存款错误: " + e.getMessage());
        }

        // 测试4：取款操作
        System.out.println("\n===== 测试4：取款测试 =====");
        account2.withdraw(200.0);  // 正常取款
        try {
            account2.withdraw(2000.0);  // 余额不足
        } catch (IllegalArgumentException e) {
            System.out.println("取款错误: " + e.getMessage());
        }
        try {
            account2.withdraw(-100.0);  // 非法取款
        } catch (IllegalArgumentException e) {
            System.out.println("取款错误: " + e.getMessage());
        }

        // 测试5：余额只读测试
        System.out.println("\n===== 测试5：余额只读测试 =====");
        System.out.println("当前余额: " + account2.getBalance());
        // account2.balance = 10000;  // 编译错误，因为balance是private且没有setter
        // account2.setBalance(10000); // 编译错误，因为没有setBalance方法

        // 最终账户状态
        System.out.println("\n===== 最终账户状态 =====");
        System.out.println(account1);
        System.out.println(account2);
    }
}
