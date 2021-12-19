public class CurrentConditionsDisplay implements Observer, Display{

    private float temperature,
                  pressure;

    @Override
    public void display() {
        System.out.println("\nОповещение о погоде" +
                           "\nТекущая температура: " + temperature +
                           "\nТекущее давление: " + pressure);
    }

    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;

        display();
    }
}
