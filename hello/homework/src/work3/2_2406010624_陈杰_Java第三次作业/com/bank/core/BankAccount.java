package work3.work2.com.bank.core;

public class BankAccount {
    //私有字段
    private String accountNumber;
    //包级私有方法，仅供核心系统内部调用
    void logInternalActivity(){
        System.out.println("Logging internal activity...");
    }
    //公开方法，课供任何类调用
    public double getBalance(){
        return 999;
    }
    //受保护方法，允许子类或同包调用
    protected void freezeAccount(){
        System.out.println("Account frozen.");
    }

}
