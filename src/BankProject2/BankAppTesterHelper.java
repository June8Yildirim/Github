package BankProject2;

import BankProject1.EasyScanner;

public class BankAppTesterHelper {
    private Bank accounts;

    public BankAppTesterHelper(Bank accounts) {
        this.accounts = accounts;
    }

    public  void addAccount(Bank accounts) {
        System.out.println("Enter your name");
        String accountName = BankProject1.EasyScanner.nextString();
        System.out.println("Enter your account number");
        String accountNumber = BankProject1.EasyScanner.nextString();

        boolean found = accounts.addAccount(accountNumber, accountName);
        if (found) {
            System.out.println("Account is added.");
        } else {
            System.out.println("Account is not exist.");
        }
    }

    public  void removeAccount(Bank account) {
        System.out.println("Enter your account number");
        String accountNumber = BankProject1.EasyScanner.nextString();
        BankAccount tempAccount = account.getItem(accountNumber);
        int found = account.search(accountNumber);
        if (found != 1) {
            if (tempAccount.getBalance() == 0) {
                System.out.println("Account is removed on the system.");
            } else {
                System.out.println("Before the removing an account you must transfer your money.");
            }
        } else {
            System.out.println("Account is not exist.");
        }
    }

    public  void depositMoney(Bank account) {
        System.out.println("Enter your account number");
        String accountNumber = BankProject1.EasyScanner.nextString();
        int found = account.search(accountNumber);
        if (found != -1) {
            System.out.println("Enter your deposit amount");
            double money = BankProject1.EasyScanner.nextDouble();
            account.depositMoney(accountNumber, money);
        } else {
            System.out.println("Account is not exist.");
        }
    }

    public  void withdrawMoney(Bank account) {
        System.out.println("Enter your account number");
        String accountNumber = BankProject1.EasyScanner.nextString();
        int found = account.search(accountNumber);
        if (found != -1) {
            System.out.println("Enter your deposit amount");
            double money = BankProject1.EasyScanner.nextDouble();
            account.withdrawMoney(accountNumber, money);
        } else {
            System.out.println("Account is not exist.");
        }
    }

    public  void accountDetails(Bank account) {
        System.out.println("Enter your account number");
        String accountNumber = EasyScanner.nextString();
        BankAccount tempAccount = account.getItem(accountNumber);
        if (tempAccount != null) {
            System.out.println(tempAccount.toString());
//            System.out.println("Account number: "+ tempAccount.getAccountNumber());
//            System.out.println("Account name: "+ tempAccount.getAccountName());
//            System.out.println("Account balance: "+ tempAccount.getBalance());
            System.out.println();
        } else {
            System.out.println("Account is not exist.");
        }
    }

    public  void changeType(Bank account) {
        System.out.println("Account changed.");
    }
}
