package creational_patterns.singleton;

public class Singleton {

    // private reference to the one and only intance
    private static Singleton uniqueInstance = null;

    private int data = 0;

    /*
    * Singleton constructor
    * Note that it is private!
    * No client can instantiate a Singleton object (can't create a singleton object)
    * */
    private Singleton() {}

    public static Singleton getInstance() {
        if(uniqueInstance == null)
            uniqueInstance = new Singleton();

        return uniqueInstance;
    }

    // set data here
    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }
}
