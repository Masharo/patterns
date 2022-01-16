package myVersion;

import java.util.HashSet;
import java.util.Objects;

public class WeatherData implements Subject {

    private float temperature,
                  pressure,
                  humidity;

    private HashSet<Observer> data;

    public WeatherData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;

        data = new HashSet<>();
    }

    public void setNewData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;

        notifyObservers();
    }

    @Override
    public void addObserver(Observer obs) {
        if (Objects.nonNull(obs)) {
            data.add(obs);
            obs.update(temperature, pressure, humidity);
        }
    }

    @Override
    public void removeObserver(Observer obs) {
        if (Objects.nonNull(obs)) {
            data.remove(obs);
        }
    }

    @Override
    public void notifyObservers() {
        data.forEach(observer ->
            observer.update(temperature, pressure, humidity)
        );
    }
}
