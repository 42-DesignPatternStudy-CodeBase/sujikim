package commandPattern.example.remote;

public class Stereo {
    
    String location = "";
    
    public Stereo(String location) {
        this.location = location;
    }

    public void onWithCD() {
        System.out.println(location + " stereo is on");
    }
    
    public void off() {
        System.out.println(location + " stereo is off");
    }
}