package BankProject2;

public class GoldAccount extends BankAccount{
    private double overDraftLimit;

    public GoldAccount(String nameAccount, String numberAccount, double limit){
        super(nameAccount, numberAccount);
        this.overDraftLimit= limit;
    }


    @Override
    public boolean withdraw(double money){
        if (balance + overDraftLimit >money){
            balance -= money;
//            withdraw(money);
            return true;
        }
        return false;
    }

    public double getOverDraftLimit() {
        return overDraftLimit;
    }

    public void setOverDraftLimit(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }
}
