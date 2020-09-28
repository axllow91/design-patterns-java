package liskov_substitution;

public class Bus extends Vehicle {
    @Override
    int getSpeed() {
        return 0;
    }

    @Override
    int getCubicCapacity() {
        return 0;
    }

    public String getEmergencyExitLocation() {
        return "Exit emergency";
    }
}
