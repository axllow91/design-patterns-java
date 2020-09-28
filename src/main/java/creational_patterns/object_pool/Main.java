package creational_patterns.object_pool;
/*
Object pool pattern is a software creational design pattern which is used in situations where the cost of initializing a class instance is very high.
        Basically, an Object pool is a container which contains some amount of objects. So, when an object is taken from the pool, it is not available in the pool until it is put back.
        Objects in the pool have a lifecycle:

        Creation
        Validation
        Destroy.
When objects are expensive to create and they are needed only for short periods of time
it is advantageous to utilize the Object Pool pattern.
The Object Pool provides a cache for instantiated objects tracking which ones are in use and which are available.
    https://media.geeksforgeeks.org/wp-content/uploads/uml-pool-design.jpg
Real world example
    In our war game we need to use oliphaunts, massive and mythic beasts, but the problem is that they are extremely expensive to create.
    The solution is to create a pool of them, track which ones are in-use, and instead of disposing them re-use the instances.
In plain words

    Object Pool manages a set of instances instead of creating and destroying them on demand.

Wikipedia says

    The object pool pattern is a software creational design pattern that uses a set of initialized objects kept ready
    to use – a "pool" – rather than allocating and destroying them on demand.

Programmatic Example
https://raw.githubusercontent.com/iluwatar/java-design-patterns/master/object-pool/etc/object-pool.png
*/

public class Main {
    public static void main(String[] args) {
        var pool = new OliphauntPool();
        var oliphaunt1 = pool.checkout();
        var oliphaunt2 = pool.checkout();
        var oliphaunt3 = pool.checkout();
        pool.checkIn(oliphaunt1);
        pool.checkIn(oliphaunt2);
        var oliphaunt4 = pool.checkout();
        var oliphaunt5 = pool.checkout();
    }
}
