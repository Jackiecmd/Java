package work3.work9;

public class Application {
    public static void main(String[] args) {
        // 测试转账交易风险
        TransferTransaction transfer = new TransferTransaction(12000);
        System.out.println("Transfer transaction risk: " + transfer.checkRisk());

        // 测试提现交易风险
        WithdrawTransaction withdraw = new WithdrawTransaction(6000);
        System.out.println("Withdraw transaction risk: " + withdraw.checkRisk());
    }
}
