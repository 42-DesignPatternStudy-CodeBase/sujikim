package bridgePattern.example.remote;

public class _Main {
    public static void main(String[] args) {
        TV tv = new TV();
        Speaker speaker = new Speaker();
        Radio radio = new Radio();

        Remote remote = new BasicRemote(tv);
        Remote remote2 = new BasicRemote(speaker);
        Remote remote3 = new AdvancedRemote(radio);

        remote.togglePower();
        remote2.togglePower();
        remote3.togglePower();

    }
    
}
