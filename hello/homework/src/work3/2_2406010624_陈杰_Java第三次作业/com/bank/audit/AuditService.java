package work3.work2.com.bank.audit;

import work3.work2.com.bank.core.BankAccount;

public class AuditService {
    public void auditAccount(BankAccount account) {
        //可以调用getBalance()方法
        double balance = account.getBalance();
        System.out.println("Account balance:"+balance);
        //无法调用freezeAccount()方法，因为它是受保护的，并且不在一个包中，也没有继承
        //account.freezeAccount();

        // 无法调用 logInternalActivity() 方法，因为它是包级私有方法，只能在 com.bank.core 包内被调用
        // account.logInternalActivity();
    }
}
