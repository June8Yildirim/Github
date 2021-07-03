package BankProject1;

public class BankAccounts {
    private String accountNumber;
    private String accountName;
    private double balance;
    private static double interestedRate;

    BankAccounts(String name, String number) {
        this.accountName = name;
        this.accountNumber = number;
    }



    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double money) {
        System.out.println("TRANSACTION SUCCESSFUL”");
        this.balance += money;
    }

    public boolean withdraw(double money) {
        if (balance > money) {
            balance -= money;
            System.out.println("WITHDRAWAL SUCCESSFUL”");
            return true;
        } else
            System.out.println("INSUFFICIENT FUNDS");
        return false;
    }

    public  double getInterestedRate() {
        return interestedRate;
    }

    public  void setInterestedRate(double interestedRate) {
        this.interestedRate = interestedRate;
    }
    public void addInterest(){
        balance += (balance*interestedRate)/100;
    }
}
