package creational_patterns.singleton;

import creational_patterns.singleton.synchronized_singleton.DoubleCheckSynchSingleton;
import creational_patterns.singleton.synchronized_singleton.SynchSingleton;

/*
* Singleton pattern is one of the simplest design patterns in java
* Comes under creational pattern as this pattern provides one of the best ways to create an object
*
* ensures a class only has one instance, and provide a global point of access to it
*
* we are taking a class and letting it manage a single instance of itself
* also preventing any other class from creating a new instance on its onw
* to get an instance, you have got to go through the class itself
*
* we are also proving a global access point to the instance
* whenever you need an instance, just query the class and it will hand you back the single instance
* a global instance makes an object accessible, but it does not keep you from instantiating multiple objects
*
* it is important for some classes to have only one instance
* examples:
*   although there can be many printers in a system, there should be only one printer spooler
*   there should be only one file system and one window manager
*   an accounting system will be dedicated to serving one company
*   logging,drivers object, caching, and thread pool would also use a singleton
*   examples of singleton in java: java.lang.runtime, java.awt.desktop
*
* Advantages/disadvantages
* controlled access to sole instance - because the singleton class encapsulates its sole instance it can have strict
* control over how and when clients access it
*
* permits a variable number of instances
* makes it easy to change your mind and allow more than one instance of the singleton class
*
* singletons might cause issues for writing testable code if the object and the methods associated with it are so tightly
* coupled that become impossible to test
*
* singleton create hidden dependencies because it is readily available throughout the code base, it can be overused
*
* when to use DI over singleton?
*   when you are testing (less coupling from DI)
*   when you want to avoid using statics - make code harder to test, singleton uses statics
*   non-stable dependency - which refers to or affects the global state, such an external service, file system or db
*   using DI over singleton is all, but not entirely, about testing
*
* when to use Singleton over DI?
*   when singleton represents better the given dependencies
*   ambient dependencies are dependencies which span across multiple classes and often multiple layers - better suited to handle
*   logger service, if you tend to log a lot in your codebase
*
*  lazy initialization - is not thread safe
*      suppose two calls to getInstance() are made at virtually the same time
*
*  problem with synchronized approach - all the threads will have to wait for the check on whether the object
*  already exists
*  reduces performance because of cost associated with the synchronized method
*  when we have synchronized the instance as a Singleton for the first time we don't need to synchronize it anymore
*  in java we need to ensure that singleton works with the presence of multiple threads and does not have performance issues
*
* double check locking - we use synchronized inside the if condition with an additional check to ensure that only one instance of
* the singleton class is created - optimize unnecessary locking, increase performance
* 
*
*
* */
public class Main {
    public static void main(String[] args) {
        // can't instantiate like this
        // Singleton singleton = new Singleton();
        Singleton singleton = Singleton.getInstance();
        singleton.setData(10);

        System.out.println("\nFirst reference: " + singleton);
        System.out.println(singleton.getData());

        // get another reference to the singleton
        // is it the same object
        singleton = null;
        singleton = Singleton.getInstance();
        System.out.println("\nSecond reference: " + singleton);
        System.out.println(singleton.getData());

        System.out.println("Synchronized singleton");
        // can't instantiate like this
        // Singleton singleton = new Singleton();
        SynchSingleton singleton1 = SynchSingleton.getInstance();
        singleton1.setData(10);

        System.out.println("\nFirst reference: " + singleton1);
        System.out.println(singleton1.getData());

        // get another reference to the singleton
        // is it the same object
        singleton1 = null;
        singleton1 = SynchSingleton.getInstance();
        System.out.println("\nSecond reference: " + singleton1);
        System.out.println(singleton1.getData());

        //

        System.out.println("Synchronized singleton with double-checked\n" +
                "locking mechanism");

        // can't instantiate like this
        // Singleton singleton = new Singleton();
        DoubleCheckSynchSingleton singleton2= DoubleCheckSynchSingleton.getInstance();
        singleton2.setData(10);

        System.out.println("\nFirst reference: " + singleton2);
        System.out.println(singleton2.getData());
    }
}
