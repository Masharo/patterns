package javaVersion;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, Display {

    private float temperature,
                  pressure;

    @Override
    public void display() {
        System.out.println("\nОповещение о погоде" +
                           "\nТекущая температура: " + temperature +
                           "\nТекущее давление: " + pressure);
    }

    @Override
    public void update(Observable o, Object arg) {
        WeatherData weatherData = (WeatherData) arg;

        this.temperature = weatherData.getTemperature();
        this.pressure = weatherData.getPressure();

        display();
    }
}
