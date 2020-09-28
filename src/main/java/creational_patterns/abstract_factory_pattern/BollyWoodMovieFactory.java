package creational_patterns.abstract_factory_pattern;

public class BollyWoodMovieFactory extends MovieFactory {
    @Override
    BollyWoodMovie getBollyWoodMovie(String type) {
        if(type.equalsIgnoreCase("action"))
            return new BollyWoodActionMovie();
        else if(type.equalsIgnoreCase("comedy"))
            return new BollyWoodComedyMovie();

        return null;
    }

    @Override
    HollyWoodMovie getHollyWoodMovie(String type) {
        return null;
    }
}
