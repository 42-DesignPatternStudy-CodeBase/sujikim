package observerPattern.example.weather;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private List<Observer> observerList;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observerList = new ArrayList<Observer>() ;
    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);        
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observerList) {
            // observer.update(temperature, humidity, pressure); // push
            observer.update(); // pull
        }
    }

    public void mesurementChanged() {
        notifyObservers();
    }

    public void setMesurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        mesurementChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
