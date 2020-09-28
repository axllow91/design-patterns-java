package creational_patterns.builder;

/*
* Some objects are simple and can be created in a single constructor call
* Other objects require a lot of ceremony to create
* Having an object with 10 constructor arguments is not productive
* Instead opt for piecewise construction
* Builder provides an API for construction an object step-by-step
* So, when an piecewise object construction is complicated provide an API for doing it succinctly
* Builder Design Pattern in Java

Let’s see how we can implement builder design pattern in java.
 First of all you need to create a static nested class and then copy all the arguments from the outer class to the Builder class.
 We should follow the naming convention and if the class name is Computer then builder class should be named as ComputerBuilder.
 Java Builder class should have a public constructor with all the required attributes as parameters.
 Java Builder class should have methods to set the optional parameters and it should return the same Builder object after setting the optional attribute.
 The final step is to provide a build() method in the builder class that will return the Object needed by client program.
 For this we need to have a private constructor in the Class with Builder class as argument.
 *
 * java example builder pattern StringBuilder#append() (unsynchronized)
 * java example builder pattern StringBuffer#append() (synchronized)
* */
public class Main {
    public static void main(String[] args) {
        // Using builder to get the object in a single line of code
        // and without any inconsistent state or arguments management issues
        Computer pc = new Computer
                .ComputerBuilder("500 GB", "16 GB")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true)
                .build();

        System.out.println(pc);
    }
}
