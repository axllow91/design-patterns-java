package creational_patterns.factory_method;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("***** Factory Pattern Demo *****");
        AnimalFactoryInterface animalFactoryInterface = new AnimalFactory();

        Animal duckType = animalFactoryInterface.getAnimalType("Duck");
        duckType.speak();

        Animal tigerType = animalFactoryInterface.getAnimalType("Tiger");
        tigerType.speak();

        Animal lionType = animalFactoryInterface.getAnimalType("Lion");
        lionType.speak();
    }
}
