package javaVersion;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, Display {
    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum= 0.0f;
    private int numReadings;

    public void update(float temp, float humidity, float pressure) {
        tempSum += temp;
        numReadings++;

        if (temp > maxTemp) {
            maxTemp = temp;
        }

        if (temp < minTemp) {
            minTemp = temp;
        }

        display();
    }

    public void display() {
        System.out.println("\nСредняя/Максимальня/Минимальная температура = " + (tempSum / numReadings)
                + "/" + maxTemp + "/" + minTemp);
    }

    @Override
    public void update(Observable o, Object arg) {

        WeatherData weatherData = (WeatherData) arg;

        tempSum += weatherData.getTemperature();
        numReadings++;

        if (weatherData.getTemperature() > maxTemp) {
            maxTemp = weatherData.getTemperature();
        }

        if (weatherData.getTemperature() < minTemp) {
            minTemp = weatherData.getTemperature();
        }

        display();
    }
}