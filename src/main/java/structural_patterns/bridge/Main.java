package structural_patterns.bridge;
/*
Bridge Design Pattern
        The Bridge design pattern allows you to separate the abstraction from the implementation.It is a structural design pattern.
        There are 2 parts in Bridge design pattern :
        Abstraction
        Implementation

        This is a design mechanism that encapsulates an implementation class inside of an interface class.

        The bridge pattern allows the Abstraction and the Implementation to be developed independently and the client
        code can access only the Abstraction part without being concerned about the Implementation part.
        The abstraction is an interface or abstract class and the implementor is also an interface or abstract class.
        The abstraction contains a reference to the implementor. Children of the abstraction are referred
        to as refined abstractions, and children of the implementor are concrete implementors.
        Since we can change the reference to the implementor in the abstraction, we are able to change the abstraction’s
        implementor at run-time. Changes to the implementor do not affect client code.
        It increases the loose coupling between class abstraction and it’s implementation.
        https://media.geeksforgeeks.org/wp-content/uploads/Bridge_Design.png

Elements of Bridge Design Pattern
        Abstraction – core of the bridge design pattern and defines the crux. Contains a reference to the implementer.
        Refined Abstraction – Extends the abstraction takes the finer detail one level below. Hides the finer elements from implementors.
        Implementer – It defines the interface for implementation classes. This interface does not need to correspond
        directly to the abstraction interface and can be very different.
        Abstraction imp provides an implementation in terms of operations provided by Implementer interface.
        Concrete Implementation – Implements the above implementer by providing concrete implementation.
        */

public class Main {
    public static void main(String[] args) {
        Vehicle veh1 = new Car(new Produce(), new Assemble());
        veh1.manufacture();
        Vehicle veh2 = new Bike(new Produce(), new Assemble());
        veh2.manufacture();
    }
}
