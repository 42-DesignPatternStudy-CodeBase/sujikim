package observerPattern.example.weather;

public class ForecastDisplay implements Observer, Display {

    private WeatherData weatherData;
    private float currentPressure;
    private float lastPressure = 0;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    
    @Override
    public void display() {
        System.out.print("현재 기압 : " + currentPressure);
        String lastPressureMessage = "";
        if (lastPressure != 0)
            lastPressureMessage = ", 지난 기압기록 : " + lastPressure;
        System.out.println(lastPressureMessage); 
    }

    @Override
    public void update() {
        lastPressure = currentPressure;
        currentPressure = weatherData.getPressure();
        display();
    }
}
