package Employee;

public class FullTimeEmployee extends Employee {
    private double annualSalary;

    public FullTimeEmployee(String number, String name , double salary){
        super(number, name) ;
        this.annualSalary= salary;
    }

    public double calculateMonthlyPay(){
        return Math.round((annualSalary/12)*100)/100;
    }

    @Override
    public String getStatus() {
        return "Full-Time";
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +"\n"+
                "Number " + super.getNumber()+"\n"+
                "Name " + super.getName()+"\n"+
                "annualSalary=" + annualSalary +'}';
    }
}
