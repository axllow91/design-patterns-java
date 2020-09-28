package liskov_substitution;

public class Car extends Vehicle {
    @Override
    int getSpeed() {
        return 0;
    }

    @Override
    int getCubicCapacity() {
        return 0;
    }

    // we can have our own functionalities
    boolean issHatchBack() {
        return true;
    }
}
