package creational_patterns.singleton.synchronized_singleton;

public class DoubleCheckSynchSingleton {
    // private reference to the one and only instance
    private static DoubleCheckSynchSingleton uniqueInstance = null;

    private int data = 0;

    /*
     * Singleton constructor
     * Note that it is private!
     * No client can instantiate a Singleton object (can't create a singleton object)
     * */
    private DoubleCheckSynchSingleton() {
    }

    // this is an outdated so we should not be doing it
    // but we should be aware of it
    // this is lazy and thread safe
    public static DoubleCheckSynchSingleton getInstance() {
        if(uniqueInstance == null) {
            synchronized (DoubleCheckSynchSingleton.class) {
            if (uniqueInstance == null)
                    uniqueInstance = new DoubleCheckSynchSingleton();
                }
        }
        return uniqueInstance;
    }

    public int getData() {
        return this.data;
    }

    // set data here
    public void setData(int data) {
        this.data = data;
    }
}
