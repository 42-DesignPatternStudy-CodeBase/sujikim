package observerPattern.example.weather;

public class StatisticsDisplay implements Observer, Display {

    private WeatherData weatherData;
    private float maxTemperature;
    private float minTemperature;
    private float sumTemperature;
    private long count = 0;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.print("평균/최고/최저 온도 = ");
        System.out.print(String.format("%.2f", sumTemperature / count));
        System.out.print("/" + String.format("%.2f", maxTemperature));
        System.out.println("/" + String.format("%.2f", minTemperature));
    }

    @Override
    public void update() {
        count++;
        float temperature = weatherData.getTemperature();
        maxTemperature = Math.max(maxTemperature, temperature);
        minTemperature = minTemperature != 0 ? Math.min(minTemperature, temperature) : temperature;
        sumTemperature += temperature;
        display();
    }
    
}
