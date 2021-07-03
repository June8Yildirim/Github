package BankProject2;



public class BankAccount {
    private String accountName;
    private String accountNumber;
    private double balance;
    private double interestRate;

    public BankAccount(String nameAccount, String numberAccount){
        this.accountName=nameAccount;
        this.accountNumber=numberAccount;
    }

    public String getAccountName() {
        return accountName;
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    public boolean withdraw(double money){
        if (money<balance){
            this.balance -=money;
            return true;
        }else{
            System.out.println("Balance problem");
            return false;
        }
    }

    public void deposit(double money){
        this.balance += money;
    }
}
