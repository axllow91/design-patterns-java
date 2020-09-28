package single_responsibility_principle;


public class Finance {
    public double calcIncomeTaxForCurrentYear(final Employee employee) {
        double salary = employee.getSalary();
        if(salary <= 1000)
            salary += 2000;
        return salary;
    }

}
