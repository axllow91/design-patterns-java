package creational_patterns.factory_method;

abstract class AnimalFactoryInterface {
    public abstract Animal getAnimalType(String type) throws Exception;
}
