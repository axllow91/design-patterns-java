package creational_patterns.singleton.synchronized_singleton;

public class SynchSingleton {
    // private reference to the one and only intance
    private static SynchSingleton uniqueInstance = null;

    private int data = 0;

    /*
     * Singleton constructor
     * Note that it is private!
     * No client can instantiate a Singleton object (can't create a singleton object)
     * */
    private SynchSingleton() {}

    // by adding the synchronized to the getInstance(), we force
    // every thread to wait its turn before it can enter the method
    public static synchronized SynchSingleton getInstance() {
        if(uniqueInstance == null)
            uniqueInstance = new SynchSingleton();

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
