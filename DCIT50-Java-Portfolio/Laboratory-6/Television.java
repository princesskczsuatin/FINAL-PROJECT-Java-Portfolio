public class Television extends Device {
    private int channel;
    private int volume;
    public Television() {
        this.channel = 1;
        this.volume = 10;
    }
    public void setChannel(int channel) {
        this.channel = channel;
        if (isOn()) showStatus();
    }
    public void setVolume(int volume) {
        this.volume = volume;
        if (isOn()) showStatus();
    }
    @Override
    public void showStatus() {
        if (isOn()) {
            System.out.println("TV  - Channel: " +
                    channel + ", Volume: " + volume + "%");
        }
    }
}
