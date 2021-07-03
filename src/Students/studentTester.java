package Students;

import BankProject2.EasyScanner;

import java.util.ArrayList;

public class studentTester {
    public static void main(String[]args){
        ArrayList<Student> students = new ArrayList<>();
        EasyScanner scanner = new EasyScanner();

        System.out.println("Enter name!");
        String name = EasyScanner.nextString();

        System.out.println("Enter number");
        String number = EasyScanner.nextString();

        Student s1 = new Student(name, number);

        System.out.println("Enter math mark");
        int math = s1.checkInteger();

        System.out.println("Enter science mark");
        int science = s1.checkInteger();

        System.out.println("Enter English mark");
        int english = s1.checkInteger();


        s1.enterMark(english,math,science);
        System.out.println(s1.calculateAverageMark());
        students.add(s1);


    }
}
