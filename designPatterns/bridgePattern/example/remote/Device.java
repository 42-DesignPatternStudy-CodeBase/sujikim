package bridgePattern.example.remote;

public interface Device {
    
    public boolean isEnabled();
    public void enable();
    public void disable();
    public int getVolume();
    public void setVolume(int volume);
    public String getName();
}
