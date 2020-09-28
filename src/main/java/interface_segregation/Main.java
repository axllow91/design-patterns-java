package interface_segregation;
/*
* Interface Segregation: defined by Robert C Martin
* Clients should not be forced to depend upon interfaces that they do not use
*   a client should not implement an interface if it does not use a method in that interface
*   happens mostly when one interface contains more than one functionality and the client only needs one
*
*  the goal of the Interface Segregation is to reduce the side effects and frequency of required changes by splitting
*  the software into multiple, independent parts
*
* using the the interface keyword in java means that you have to implement all of the methods in the interface
* before any class ca use it
*
* if we follow this principle in java, we will implement less methods because each interface will have a single functionality
* This interface avoids the design drawbacks associated with a fat interface(big interface that client will implement unnecessarily to all classes)
*
* A lean interface that does not mean one method per instance
*
* A lean interface caters to a consumers of a specific type of funct or a specific set of customers all of whom have the same
* functional needs
* */
public class Main {
    public static void main(String[] args) {

    }
}
