package creational_patterns.factory_method;

public class AnimalFactory extends AnimalFactoryInterface {
    @Override
    public Animal getAnimalType(String type) throws Exception {
        switch (type) {
            case "Duck":
                return new Duck();
            case "Tiger":
                return new Tiger();
            default:
                throw new Exception("Animal Type: " + type + " cannot be instantiated");
        }
    }
}
