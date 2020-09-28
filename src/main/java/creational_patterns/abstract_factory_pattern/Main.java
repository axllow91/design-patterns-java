package creational_patterns.abstract_factory_pattern;

/*
*
* The abstract factory provides an interface for creating families or related or dependent objects without
* specifying their concrete class
* "is called factory of factories"
* super factory that creates other factories
*
* A pattern that creates object via abstraction (does not care how its products are created)
*
* the methods of an Abstract Factory are implemented as factory methods
*   provides an encapsulation mechanism to a group of individual factories
*   factory method is a subset of this pattern
*
* there is often one concrete class implemented for each family
*
* When to use this pattern?
*   When a system should be independent of how its products are created, composed and represented
    when we need to deal with multiple factories

 *
 * Advantages and disadvantages
 * isolates clients from concrete implementation classes
 *  clients manipulate instances through their abstract interfaces
 *  product class names are isolated in the implementation of the concrete factory; they do no appear in client code
 *
 * can support a complete family of products
 *  enforces the use of products only from one family
 *
 * promotes consistency among products
*
*  supporting new kinds of products is difficult
*   we need to extend the interface and as a result changes will be required in all of the subclasses that already implemented the interface
*
*  Relationship to factory method:
*       both encapsulate object creation to keep application loosely coupled and less dependent on implementation
*
* All factories encapsulate object creation
*
* Factory Method relies on inheritance - obj creation is delegated to subclasses, which implement the factory method to create obj
* Abstract Factory Method relies on composition - obj creation is implemented in methods exposed in the factory method
*
* All factories patterns promote loose couping by reducing the dependency of your application on concrete classes
* The intent of Factory method is to allow a class to defer instantiation to its subclasses
* The intent of Abstract Factory Method is to create families of related obj without having to depend to heir concrete classes
*
* */
public class Main { // called as client

    public static void main(String[] args) {
        MovieFactory hollyWoodMovieFactory = FactoryProducer.getFactory("HollyWoodMovie"); // factory producer produces the right type of movie that we want
        HollyWoodMovie hAction = hollyWoodMovieFactory.getHollyWoodMovie("action");

        System.out.println("\nAction Movies: ");
        System.out.println(hAction.getMovieName());

        MovieFactory bollyWoodMovieFactory = FactoryProducer.getFactory("BollyWoodMovie");
        BollyWoodMovie hComedy = bollyWoodMovieFactory.getBollyWoodMovie("comedy");
        System.out.println("\nComedy Movies: ");
        System.out.println(hComedy.getMovieName());

    }
}
