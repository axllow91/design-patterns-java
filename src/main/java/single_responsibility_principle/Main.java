package single_responsibility_principle;


import java.util.Date;

/*
* single responsibility principle: states that every class should have responsibility over a single part of the functionality
* provided by the software:
*       responsibility should be entirely encapsulated by the class
*       all its methods should be narrowly aligned with that responsibility
*       a class should have only one job - where a responsibility is nothing but a reason to change
*
* Single responsibility principle is about limiting the impact of change by designing loosely (low) coupled classes
* that are high cohesive
* Example of responsibilities: Persistence, Validation, Notification, Error Handling, Logging, Class Selection/Instantiation
* Formatting, Parsing, Mapping
*
* */
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Mitica");
        employee.setSalary(999);
        employee.setDate(new Date());
        HRPromotions hr = new HRPromotions();
        System.out.println("Promotion? " + hr.isPromotionDueThisYear(employee));
        Finance finance = new Finance();
        System.out.println("Finance? " + finance.calcIncomeTaxForCurrentYear(employee));
    }
}
