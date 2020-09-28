package structural_patterns.bridge;

// Refine abstraction 1 in bridge pattern
public class Car extends Vehicle {

    public Car(Workshop workshop1, Workshop workshop2) {
        super(workshop1, workshop2);
    }

    @Override
    public void manufacture() {
        System.out.println("car ");
        workshop1.work();
        workshop2.work();
    }
}
