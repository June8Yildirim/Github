package Employee;

import BankProject2.EasyScanner;

import java.util.Scanner;

public class EmployeeTester {
    public static void main(String[] args) {

//        PartTimeEmployee pEmp = new PartTimeEmployee("234", "test", 12);
//        System.out.println(pEmp.calculateWeeklyPay(20));
//
//        Scanner keyboard = new Scanner(System.in);
//        Scanner keyboardString = new Scanner(System.in);
//        String number, name;
//        double pay;
//        int hours;
//        PartTimeEmployee emp;

//// get the details from the user
//        System.out.print("Employee Number? ");
//        number = keyboardString.nextLine();
//        System.out.print("Employee's Name? ");
//        name = keyboardString.nextLine();
//        System.out.print("Hourly Pay? ");
//        pay = keyboard.nextDouble();
//        System.out.print("Hours worked this week? ");
//        hours = keyboard.nextInt();
//
//// create a new part-time employee
//        emp = new PartTimeEmployee(number, name, pay);
//// display part-time employee's details, including the weekly pay
//        System.out.println();
//
//// the next two methods have been inherited from the Employee class
//        System.out.println(emp.getName());
//        System.out.println(emp.getNumber());
//        System.out.println(emp.calculateWeeklyPay(hours));


        FullTimeEmployee fte = new FullTimeEmployee("A123", "Ms Full-Time", 25000);
        PartTimeEmployee pte = new PartTimeEmployee("B456", "Mr Part-Time", 30);
        testMethod(fte); // call testMethod with a full-time employee object
        testMethod(pte); // call testMethod with a part-time employee object

        Employee emp; // a reference to an Employee
        char choice;
        String numberEntered, nameEntered;
        double salaryEntered, payEntered;
        System.out.print("Choose (F)ull-Time or (P)art-Time Employee: ");
        choice = EasyScanner.nextChar();
        System.out.print("Enter employee number: ");
        numberEntered = EasyScanner.nextString();
        System.out.print("Enter employee name: ");
        nameEntered = EasyScanner.nextString();
        if(choice == 'F' || choice == 'f')
        {
            System.out.print("Enter annual salary: ");
            salaryEntered = EasyScanner.nextDouble();
// create a FullTimeEmployee object
            emp = new FullTimeEmployee (numberEntered, nameEntered, salaryEntered);
        }
        else
        {
            System.out.print("Enter hourly pay: ");
            payEntered = EasyScanner.nextDouble();
// create a PartTimeEmployee object
            emp = new PartTimeEmployee (numberEntered, nameEntered, payEntered);
        }
        testMethod(emp); // call tester with the object created

    }

    static void testMethod(Employee employeeIn) // the method expects to receive an Employee object
    {
        System.out.println(employeeIn.toString());
        System.out.println(employeeIn.getName()+" and his/her status is "+ employeeIn.getStatus());
        System.out.println();
    }

}
