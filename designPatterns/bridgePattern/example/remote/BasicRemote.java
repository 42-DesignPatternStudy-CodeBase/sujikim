package bridgePattern.example.remote;

public class BasicRemote implements Remote {
    protected Device device;

    public BasicRemote(Device device) {
        this.device = device;
    }
    public void togglePower() {
        if (device.isEnabled()) {
            device.disable();
            System.out.println(device.getName() + " 전원이 꺼졌습니다.");
            return;
        }
        device.enable();
        System.out.println(device.getName() + " 전원이 켜졌습니다.");
    }
    public void volumeDown() {
        device.setVolume(device.getVolume() - 1);
        System.out.println(device.getName() +" 소리를 줄였습니다 현재 : " + device.getVolume());
    }
    public void volumeUp() {
        device.setVolume(device.getVolume() + 1);
        System.out.println(device.getName() +" 소리를 키웠습니다 현재 : " + device.getVolume());
    }
}
