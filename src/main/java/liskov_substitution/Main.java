package liskov_substitution;
/*
* Introduced by Barbara Liskov
* The principle defines that objects of a superclass can be replaceable with objects of its subclasses without breaking
* the application:
*       requires the objects of your subclass to behave in the same way as the objects of your superclass
*       methods which use a superclass type must be able to work with the subclass without any issues
*  an overridden method of a subclass needs to accept the same input parameter values as the method of the superclass
*  do not implement any stricter validation rules on input parameters than implemented by the parent class
*
* the return value of a method of the subclass needs to comply with the same rules as the return of the method of superclass
* In order to follow LSP the subclass must enhance functionality, but not reduce functionality
*
* The java language follows the LSP
* LSP is closely relate to the SRP and interface Segregation Principle
* if a base class has more functionality than a subclass might not support some of the functionality and does violates LSP
*
* This principle extends OCP that says a class should be open for extension closed for modification:
*   we override the base class and implement the functionality to be changed in the overriding class
*   when the subclass obj is used in place of the base class the overridden functionality is executed
*   this is exactly in line with LSP
* */
public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.getCubicCapacity();
        car.getSpeed();

        Vehicle bus = new Bus();
        bus.getSpeed();
        bus.getCubicCapacity();

    }
}
