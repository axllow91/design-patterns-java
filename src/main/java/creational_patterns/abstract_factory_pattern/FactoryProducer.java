package creational_patterns.abstract_factory_pattern;

public class FactoryProducer {
    public static MovieFactory getFactory(String choice) {
        if(choice.equalsIgnoreCase("HollyWoodMovie")) {
            return new HollyWoodMovieFactory();
        } else if(choice.equalsIgnoreCase("BollyWoodMovie")) {
            return new BollyWoodMovieFactory();
        }
        return null;
    }
}
