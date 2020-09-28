package creational_patterns.singleton;

// this approach actually avoid the problem of synchronization because
// it creates only a single instance whatever happens (no need to take care of thread safety)
public class InnerStaticSingleton {
    private InnerStaticSingleton() {

    }

    private static class Impl {
        private static final InnerStaticSingleton INSTANCE = new InnerStaticSingleton();
    }

    public InnerStaticSingleton getInstance() {
        return Impl.INSTANCE;
    }
}
