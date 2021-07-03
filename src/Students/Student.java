package Students;

import BankProject2.EasyScanner;

import java.text.DecimalFormat;

public class Student {
    private String studentNumber;
    private String studentName;
    private int markForEnglish;
    private int markForMath;
    private int markForScience;
    private double fee;
    private static DecimalFormat dc = new DecimalFormat("0.00");

    public Student(String studentNumber, String studentName) {
        this.studentNumber = studentNumber;
        this.studentName = studentName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getMarkForEnglish() {
        return markForEnglish;
    }

    public int getMarkForMath() {
        return markForMath;
    }

    public int getMarkForScience() {
        return markForScience;
    }

    public double getFee() {
        return fee;
    }

    public void enterMark(int english, int math, int science) {
        this.markForMath = math;
        this.markForEnglish = english;
        this.markForScience = science;
    }

    public double calculateAverageMark() {
        double average = (getMarkForMath() + getMarkForEnglish() + getMarkForScience()) / 3.0;
        return (Math.round(average * 100) / 100.0);
    }

    public void setFee(double courseFee) {
        this.fee = courseFee;
    }

    public int checkInteger() {
        final int NOTESYSTEM = 100;
        int mark;
        do {
            try {
                mark = Integer.parseInt(EasyScanner.nextString());
            } catch (NumberFormatException e) {
                mark = -1;
                System.out.println("Please enter the mark as an integer, or less than ");
            }
        } while (mark < 1 || mark > NOTESYSTEM);
        return mark;
    }

}
