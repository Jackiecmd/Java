package work3.work9;

public class WithdrawTransaction extends Transaction{
    private double dailyTotalWithdraw;
    public WithdrawTransaction(double dailyTotalWithdraw){
        this.dailyTotalWithdraw=dailyTotalWithdraw;
    }

    @Override
    public boolean checkRisk() {
        return dailyTotalWithdraw>5000;
    }
}
