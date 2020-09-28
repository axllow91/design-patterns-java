package creational_patterns.abstract_factory_pattern;

abstract class MovieFactory {
    abstract BollyWoodMovie getBollyWoodMovie(String type);
    abstract HollyWoodMovie getHollyWoodMovie(String type);
}
