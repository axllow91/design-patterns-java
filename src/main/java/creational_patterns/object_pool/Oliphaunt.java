package creational_patterns.object_pool;

import java.util.concurrent.atomic.AtomicInteger;

public class Oliphaunt {
    // can be automatically updated
    // An AtomicInteger is used in applications such as atomically incremented counters, and cannot be used as a replacement for an Integer
    // but this class extends Number class
    private static final AtomicInteger counter = new AtomicInteger(0);

    private final int id;

    public Oliphaunt() {
        id = counter.incrementAndGet();
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return String.format("Oliphaunt id=%d", id);
    }
}

