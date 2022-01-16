package javaVersion;

import java.util.Observable;

public class WeatherData extends Observable {

    private float temperature,
            pressure,
            humidity;

    public WeatherData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;

    }

    public void setNewData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;

        setChanged();
        notifyObservers(this);
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }
}
