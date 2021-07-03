package BankProject1;

import java.util.ArrayList;

public class Bank {
    private ArrayList<BankAccounts> bank = new ArrayList<>();


    private int search(String number){
        for (int i = 0; i < bank.size() ; i++) {
            BankAccounts tempAccount = bank.get(i);
            String tempNumber = tempAccount.getAccountNumber();
            if (tempNumber.equals(number)){
                return i;
            }
        }
        return -999;
    }

    public int getTotal(){
        return bank.size();
    }

    public BankAccounts getItem(String accountNumber){
        int index = search(accountNumber);
        if (index != -999){
            return bank.get(index);
        }else{
            return null;
        }
    }

    public boolean addAccount(String Accountname, String AccountNumber){
        if (search(AccountNumber)== -999){
            bank.add(new BankAccounts(Accountname,AccountNumber));
            return true;
        }
        return false;
    }
    public boolean removeAccount(String AccountNumber){
        int index = search(AccountNumber);
        if (index != -999){
            bank.remove(index);
            return true;
        }
        return false;
    }

    public boolean depositMoney(String number, double money){

        BankAccounts accounts = getItem(number);
        if (accounts != null){
            accounts.deposit(money);
            return true;
        }else{
            return false;
        }
    }



    public boolean withDrawMoney(String accountNumber, double money){
        BankAccounts accounts = getItem(accountNumber);
        if (accounts != null && accounts.getBalance() >= money){
            accounts.withdraw(money);
            return true;
        }else{
            return false;
        }
    }
}
