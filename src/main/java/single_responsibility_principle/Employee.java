package single_responsibility_principle;

import java.util.Date;
// in this form this class breaks the single responsibility principle
// this class should have core information about the employee
public class Employee {

    private String employeeId;
    private String name;
    private double salary;
    private String address; // -> this might be turn into a class
    private Date date;

    /*public boolean isPromotionDueThisYear() { // -> this is not employee job (this comes from a finance job)
        // promotion logic
    }

    public double calcIncomeTaxForCurrentYear() { // -> this is not employee job (this comes from a finance job)
        // income tax logic
    }
    */
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
