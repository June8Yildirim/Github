package BankProject1;

public class BankAccountTester {
    public static void main(String[] args){
        BankAccounts account1 = new BankAccounts("test","123231");
        BankAccounts account2 = new BankAccounts("test2","rerer23");
        account1.deposit(1000);
        account2.deposit(2000);
        account1.setInterestedRate(12);
        account1.addInterest();
        account2.addInterest();
        System.out.println("Account number: "+account1.getAccountNumber()+"\nAccount name: "+account1.getAccountName());

        int choice;
        Bank myBank = new Bank();

        do{
            System.out.println();
            System.out.println("1. Create a new account.");
            System.out.println("2. Remove an account.");
            System.out.println("3. Deposit money.");
            System.out.println("4. Withdraw money.");
            System.out.println("5. Check account details.");
            System.out.println("6. Quit");
            System.out.println();

            choice = EasyScanner.nextInt();
            System.out.println();
            switch (choice) {
                case 1 -> option1(myBank);
                case 2 -> option2(myBank);
                case 3 -> option3(myBank);
                case 4 -> option4(myBank);
                case 5 -> option5(myBank);
                default -> System.out.println("Invalid entry");
            }
        }while (choice != '6');
    }

    public static void option1(Bank bank){
        System.out.println("Enter your account number.");
        String number = EasyScanner.nextString();
        System.out.println("Enter your account name.");
        String name = EasyScanner.nextString();

        boolean success = bank.addAccount(name,number);
        if (success){
            System.out.println("Account added");
        }else{
            System.out.println("Account number already exists");
        }
    }

    public static void option2(Bank bank){
        System.out.println("Enter your account number.");
        String number = EasyScanner.nextString();

        boolean found = bank.removeAccount(number);
        if (found){
            System.out.println("Account removed");
        }else{
            System.out.println("Account number not exists");
        }
    }

    public static void option3(Bank bank){
        System.out.println("Enter your account number.");
        String number = EasyScanner.nextString();
        System.out.println("Enter your deposit.");
        double money = EasyScanner.nextDouble();

        boolean found = bank.depositMoney(number,money);
        if (found){
            System.out.println("Money is deposited");
        }else{
            System.out.println("Account number not exists");
        }
    }

    public static void option4(Bank bank){
        System.out.println("Enter your account number.");
        String number = EasyScanner.nextString();
        System.out.println("Enter your deposit money.");
        double money = EasyScanner.nextDouble();

        boolean found = bank.withDrawMoney(number,money);
        if (found){
            System.out.println("Withdraw added.");
        }else{
            System.out.println("Account number not exists");
        }
    }

    public static void option5(Bank bank){
        System.out.println("Enter your account number.");
        String number = EasyScanner.nextString();
        BankAccounts accounts = bank.getItem(number);
        if (accounts != null){
            System.out.println("Account number: "+accounts.getAccountNumber());
            System.out.println("Account name: "+ accounts.getAccountName());
            System.out.println("Account balance: "+accounts.getBalance());
            System.out.println();
        }else{
            System.out.println("Account number already exists");
        }
    }

}
