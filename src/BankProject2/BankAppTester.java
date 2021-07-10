package BankProject2;

import BankProject1.EasyScanner;

public class BankAppTester {

    public static void main(String[] args) {
        Bank BankAccounts = new Bank();
        BankAppTesterHelper accounts = new BankAppTesterHelper(BankAccounts);
         int choice;
        do {
            System.out.println();
            System.out.println("1. Create an account");
            System.out.println("2. Remove an account.");
            System.out.println("3. Deposit a money");
            System.out.println("4. Withdraw a money.");
            System.out.println("5. Check account details.");
            System.out.println("6. Change account type.");
            System.out.println("7. Display All Accounts");
            System.out.println("8. Quit.");
            System.out.println();
            System.out.println("Select your choice, enter [1-8]: ");
            choice = EasyScanner.nextInt();
            switch (choice) {
                case 1:
                    accounts.addAccount(BankAccounts);
                    break;
                case 2:
                    accounts.removeAccount(BankAccounts);
                    break;
                case 3:
                    accounts.depositMoney(BankAccounts);
                    break;
                case 4:
                    accounts.withdrawMoney(BankAccounts);
                    break;
                case 5:
                    accounts.accountDetails(BankAccounts);
                    break;
                case 6:
                    accounts.changeType(BankAccounts);
                    break;
                case 7:
                    BankAccounts.displayAccounts();
                    break;
            }
        } while (choice != 8);
    }
//
//    public static void addAccount(Bank accounts) {
//        System.out.println("Enter your name");
//        String accountName = EasyScanner.nextString();
//        System.out.println("Enter your account number");
//        String accountNumber = EasyScanner.nextString();
//
//        boolean found = accounts.addAccount(accountNumber, accountName);
//        if (found) {
//            System.out.println("Account is added.");
//        } else {
//            System.out.println("Account is not exist.");
//        }
//    }
//
//    public static void removeAccount(Bank account) {
//        System.out.println("Enter your account number");
//        String accountNumber = EasyScanner.nextString();
//        BankAccount tempAccount = account.getItem(accountNumber);
//        int found = account.search(accountNumber);
//        if (found != 1) {
//            if (tempAccount.getBalance() == 0) {
//                System.out.println("Account is removed on the system.");
//            } else {
//                System.out.println("Before the removing an account you must transfer your money.");
//            }
//        } else {
//            System.out.println("Account is not exist.");
//        }
//    }
//
//    public static void depositMoney(Bank account) {
//        System.out.println("Enter your account number");
//        String accountNumber = EasyScanner.nextString();
//        int found = account.search(accountNumber);
//        if (found != -1) {
//            System.out.println("Enter your deposit amount");
//            double money = EasyScanner.nextDouble();
//            account.depositMoney(accountNumber, money);
//        } else {
//            System.out.println("Account is not exist.");
//        }
//    }
//
//    public static void withdrawMoney(Bank account) {
//        System.out.println("Enter your account number");
//        String accountNumber = EasyScanner.nextString();
//        int found = account.search(accountNumber);
//        if (found != -1) {
//            System.out.println("Enter your deposit amount");
//            double money = EasyScanner.nextDouble();
//            account.withdrawMoney(accountNumber, money);
//        } else {
//            System.out.println("Account is not exist.");
//        }
//    }
//
//    public static void accountDetails(Bank account) {
//        System.out.println("Enter your account number");
//        String accountNumber = EasyScanner.nextString();
//        BankAccount tempAccount = account.getItem(accountNumber);
//        if (tempAccount != null) {
//            System.out.println(tempAccount.toString());
////            System.out.println("Account number: "+ tempAccount.getAccountNumber());
////            System.out.println("Account name: "+ tempAccount.getAccountName());
////            System.out.println("Account balance: "+ tempAccount.getBalance());
//            System.out.println();
//        } else {
//            System.out.println("Account is not exist.");
//        }
//    }
//
//    public static void changeType(Bank account) {
//        System.out.println("Account changed.");
//    }

}
