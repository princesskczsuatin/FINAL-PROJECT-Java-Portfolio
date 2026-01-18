public class Microwave extends Device {
    private int timer;
    private int temperature;
    public Microwave() {
        this.timer = 0;
        this.temperature = 0;
    }
    public void setTimer(int timer) {
        this.timer = timer;
        if (isOn()) showStatus();
    }
    public void setTemperature(int temp) {
        this.temperature = temp;
        if (isOn()) showStatus();
    }
    @Override
    public void showStatus() {
        if (isOn()) {
            System.out.println("Microwave  - Timer: " +
                    timer + " sec, Temperature: " + temperature + "°C");
        }
    }
}
