package observerPattern.example.weather;

public interface Observer {
    // public void update(float temperature, float humidity, float pressure); //push
    public void update(); // pull
}
