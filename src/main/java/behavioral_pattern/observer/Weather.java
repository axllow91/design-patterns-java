package behavioral_pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Weather {
    private WeatherType weatherType;
    private final List<WeatherObserver> observers;

    public Weather() {
        observers = new ArrayList<>();
        weatherType = WeatherType.SUNNY;
    }

    public void addObserver(WeatherObserver obs) {
        observers.add(obs);
    }

    public void remove(WeatherObserver obs) {
        observers.remove(obs);
    }

    public void timePasses() {
        var enumValues = WeatherType.values();
        weatherType = enumValues[(weatherType.ordinal() + 1) % enumValues.length];
        System.out.println("The weather changed to " + weatherType);
        notifyObservers();
    }

    private void notifyObservers() {
        for(var obs : observers)
            obs.update(weatherType);
    }
}
