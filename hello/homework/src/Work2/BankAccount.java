package Work2;

public class BankAccount {
    // 私有属性
    private String accountName;  // 账户名
    private double balance;      // 账户余额

    /**
     * 无参构造方法 - 创建默认账户
     * 默认账户名："未命名账户"
     * 默认余额：0.0
     */
    public BankAccount() {
        this.accountName = "未命名账户";
        this.balance = 0.0;
    }

    /**
     * 全参构造方法 - 使用指定账户名和初始余额创建账户
     * @param accountName 账户名
     * @param initialBalance 初始余额
     */
    public BankAccount(String accountName, double initialBalance) {
        this.accountName = accountName;
        this.balance = initialBalance;
    }

    // ============== Getter方法 ==============

    /**
     * 获取账户名
     * @return 账户名
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * 获取账户余额（只读）
     * @return 当前余额
     */
    public double getBalance() {
        return balance;
    }

    // ============== 业务方法 ==============

    /**
     * 存款操作
     * @param amount 存款金额（必须为正数）
     * @throws IllegalArgumentException 如果存款金额不合法
     */
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("存款金额必须大于0");
        }
        balance += amount;
        System.out.printf("成功存入 %.2f，当前余额: %.2f%n", amount, balance);
    }

    /**
     * 取款操作
     * @param amount 取款金额（必须为正数且不超过余额）
     * @throws IllegalArgumentException 如果取款金额不合法或余额不足
     */
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("取款金额必须大于0");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("余额不足，无法取款");
        }
        balance -= amount;
        System.out.printf("成功取出 %.2f，当前余额: %.2f%n", amount, balance);
    }

    /**
     * 重写toString方法，返回账户信息
     * @return 格式化的账户信息字符串
     */
    @Override
    public String toString() {
        return String.format("账户[名称=%s, 余额=%.2f]", accountName, balance);
    }
}
