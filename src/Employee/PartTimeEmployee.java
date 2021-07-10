package Employee;

class PartTimeEmployee extends Employee {
    private double hourlyPay;

    public PartTimeEmployee(String number, String name, double hourlyPay) {
        super(number, name);
        this.hourlyPay = hourlyPay;
    }

    @Override
    public String getStatus() {
        return "Part-Time";
    }

    public double calculateWeeklyPay(int hoursIn){
        return hoursIn*hourlyPay;
    }



    public double getHourlyPay() {
        return hourlyPay;
    }

    public void setHourlyPay(double hourlyPay) {
        this.hourlyPay = hourlyPay;
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" +"\n"+
                "Number " + super.getNumber()+"\n"+
                "Name " + super.getName()+"\n"+
                "hourlyPay=" + hourlyPay +'}';
    }
}
