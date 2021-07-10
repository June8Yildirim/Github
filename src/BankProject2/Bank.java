package BankProject2;

import java.util.ArrayList;

public class Bank {
    ArrayList<BankAccount> accountList = new ArrayList<>();

    public int search(String number) {
        for (int i = 0; i < accountList.size(); i++) {
            BankAccount account = accountList.get(i);
            String tempNumber = account.getAccountNumber();
            if (tempNumber.equals(number)) {
                return i;
            }
        }
        return -1;
    }

    public BankAccount getItem(String number) {
        int index = search(number);
        if (index != -1) {
            return accountList.get(index);
        } else {
            return null;
        }
    }

    public int getTotal() {
        return accountList.size();
    }

    public boolean addAccount(String number, String name) {
        if (search(number) == -1) {
            accountList.add(new BankAccount(name, number));
            return true;
        }
        return false;
    }

    public void depositMoney(String number, double money) {
        BankAccount tempAccount = getItem(number);
        if (tempAccount != null) {
            tempAccount.deposit(money);
        }
    }

    public void withdrawMoney(String number, double money) {
        BankAccount tempAccount = getItem(number);
        if (tempAccount != null && tempAccount.getBalance() >= money) {
            tempAccount.withdraw(money);
        }
    }

    public boolean removeAccount(String number) {
        int index = search(number);
        if (index != -1) {
            accountList.remove(index);
            return true;
        }
        return false;
    }

    public void displayAccounts(){
        int index=1;
        for (BankAccount acc: accountList) {
            System.out.println(index+". accounts: ");
            System.out.println(acc.toString());
            index++;
            System.out.println();
        }
    }
}
