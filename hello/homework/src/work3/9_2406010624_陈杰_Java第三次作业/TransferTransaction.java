package work3.work9;

public class TransferTransaction extends Transaction{
    private double amount;
    public TransferTransaction(double amount){
        this.amount=amount;
    }

    @Override
    public boolean checkRisk() {
        return amount>10000;//布尔表达式，大于就返回true否则返回false
    }
}
