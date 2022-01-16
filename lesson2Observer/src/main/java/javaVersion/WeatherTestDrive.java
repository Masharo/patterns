package javaVersion;


import java.io.IOException;
import java.util.Observer;

public class WeatherTestDrive {

    public static void main(String[] args) throws InterruptedException, IOException {
        WeatherData station = new WeatherData(15, 90, 30.5f);

        Observer current = new CurrentConditionsDisplay();
        Observer statistic = new StatisticsDisplay();

        station.addObserver(current);
        station.addObserver(statistic);

        Thread.sleep(5000);

        station.setNewData(16, 92, 30.7f);

        Thread.sleep(5000);

        station.setNewData(18, 96, 32.8f);
    }
}
