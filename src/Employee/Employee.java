package Employee;

public abstract class Employee {
    private String number;
    private String name;
    private String status;


    public Employee(String number, String name) {
        this.name = name;
        this.number = number;
    }

    public abstract String getStatus();

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
