package BankProject2;

public class OverridingDemo
{
    public static void main(String[] args)
    {
        boolean ok;
//declare a BankAccount object
        BankAccount bankAcc = new BankAccount("123", "Ordinary Account Holder");
//declare a GoldAccount object
        GoldAccount goldAcc = new GoldAccount("224", "Gold Account Holder", 500);
        bankAcc.deposit(1000);
        goldAcc.deposit(1000);
        ok = bankAcc.withdraw(1250); // the withdraw method of BankAccount is called
        if(ok)
        {
            System.out.print("Money withdrawn. ");
        }
        else
        {
            System.out.print("Insufficient funds. ");
        }
        System.out.println("Balance of " + bankAcc.getAccountName() + " is " + bankAcc.getBalance());
        System.out.println();
        ok = goldAcc.withdraw(1250); // the withdraw method of GoldAccount is called
        if(ok)
        {
            System.out.println("Money withdrawn. ");
        }
        else
        {
            System.out.println("Insufficient funds. ");
        }
        System.out.println("Balance of " + goldAcc.getAccountName() + " is " + goldAcc.getBalance());
        System.out.println();
    }
}
