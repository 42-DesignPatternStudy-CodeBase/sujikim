package observerPattern.example.weather;
public class CurrentConditionDisplay implements Observer, Display {

    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    
    @Override
    public void update() {
        // pull 
        temperature = weatherData.getTemperature();
        humidity = weatherData.getHumidity();
        display();
    }
    // public void update(float temperature, float humidity, float pressure) { 
    //     // push
    //     this.temperature = temperature;
    //     this.humidity = humidity;
    //     display();
    // }

    @Override
    public void display() {
        System.out.println("현재 상태 : 온도 " + temperature + ", 습도 " + humidity + "%");   
    }
}
