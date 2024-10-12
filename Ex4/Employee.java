package Ex4;

public class Employee {
    private int id;
    private String firstName, lastName;
    private int salary;

    public Employee() {

    }
    public Employee(int id, String firstName, String lastName, int salary) {
        this.firstName = firstName;
        this.id = id;
        this.lastName = lastName;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getName() {
        return firstName +" "+ lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAnnualSalary() {
        return salary*12;
    }
    public int raiseSalary(int percent) {
        salary = salary + (salary*percent)/100;
        return salary;
    }
    public String toString() {
        return "Employee [Id: "+id+", Name: "+ getName()+", Salary: "+salary;
    }
}