package bridgePattern.example.remote;

public class TV implements Device {

    private String name = "TV";
    private boolean isEnabled = false;
    private int volume = 5;

    @Override
    public boolean isEnabled() {
        return isEnabled;
    }

    @Override
    public void enable() {
        isEnabled = true;
    }
    
    @Override
    public void disable() {
        isEnabled = false;
    }
    
    @Override
    public int getVolume() {
        return volume;
    }
    
    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    @Override
    public String getName() {
        return name;
    }
}
