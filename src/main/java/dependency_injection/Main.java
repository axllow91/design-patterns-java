package dependency_injection;
/*
* A java class has a dependency on another class, if it uses an instance of this class referred to as class dependency
*   a class which accesses a logger service has a dependency on this service class
*
* Java classes should be as independent as possible from other Java classes
*  increases the possibility of reusing these classes and to be able to test them independently from other classes
*
* If a java class creates an instance of another class via the enw operator, it cannot be used (and tested) independently
* from this class
* this is called a hard dependency
*
* dependency injection solves there hard dependencies
*
* dependency injection is a technique whereby one object supplies the dependencies of another object
*  enables you to replace dependencies without changing the class that uses them
*
* A dependency is an object that can be used (a service)
*
* an injection is the passing of a dependency to a dependent object (a client) that would use it
*
* allows us to remove the hard coded dependencies and make our application loosely coupled, extendable and maintainable
*
* If you want to use dependency injection, you need classes that fulfill four basic roles:
*   the service you want to use
*   the client that uses the service
*   an interface that is used by the client and  implemented by the service
*   the injector which creates a service instance and injects it into the client
*
* you already implemented 3 of those 4 rules by following the dependency inversion principle
*   the service and the client are the two classes between which the DIP intends to remove the dependency
*   by introducing an interface
*
* injection types: constructor, setter, interface injection
*
*
*
* */
public class Main {
    public static void main(String[] args) {
        Service service = new ServiceImpl(); // the injector
        Client client = new Client(service); // injects via constructor
        client.doSomething();
    }
}
