package open_closed_principle;
/*
* Bertrand Meyer proposed the open-closed principle (OCP)
* classes should be open form extension (new functionality) and closed for modification
* a class should be easily extensible without modifying the class itself
*
* A module is said to be open if it is still available for extension
* it should be possible to add fields to the data structures it contains or new elements to the set of functions it performs
*
* A module is said to be closed if it is available for use by other modules
* assumes that the module has been given a well-define, stable description
* the interface in the sens of information hiding (not a java interface)
*
* General idea of this principle is that it tells you to write your code so that you will be able to add new functionality
* without changing the existing code:
*      prevents situations in which a change to one of your classes also requires you to adopt all depending classes
*      reduces tight coupling
*
* !! Robert C Martin considered this principle as "the most important principle of object-oriented design"
*
* Meyer proposed the use of inheritance to achieve the OCP, but inheritance introduces tight coupling if the subclasses
* depend of implementation details of their parent
* Redefined: OPC to a polymorphic implementation -> the use of interfaces instead of a super class (helps with the use of multiple implementation)
*   interfaces are closed for implementation -> you can provide new implementation to extend the functionality of your software
*   new impl need to implement the interface
* */
public class Main {
    public static void main(String[] args) {
       Shape rectangle = new Rectangle(33, 22);
       AreaCalculator areaCalculator = new AreaCalculator();
        System.out.println(areaCalculator.calculateShapeArea(rectangle));

    }
}
