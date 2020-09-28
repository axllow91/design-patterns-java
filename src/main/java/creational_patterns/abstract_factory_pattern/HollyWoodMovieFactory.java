package creational_patterns.abstract_factory_pattern;

public class HollyWoodMovieFactory extends MovieFactory {
    @Override
    BollyWoodMovie getBollyWoodMovie(String type) {
      return null;
    }

    @Override
    HollyWoodMovie getHollyWoodMovie(String type) {
        if(type.equalsIgnoreCase("action"))
            return new HollyWoodActionMovie();
        else if(type.equalsIgnoreCase("comedy"))
            return new HollyWoodComedyMovie();

        return null;
    }
}
