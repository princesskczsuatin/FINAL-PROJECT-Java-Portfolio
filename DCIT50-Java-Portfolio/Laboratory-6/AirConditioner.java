public class AirConditioner extends Device {
    private int fanSpeed;
    private int temperature;
    public AirConditioner() {
        this.fanSpeed = 3;
        this.temperature = 24;
    }
    public void setFanSpeed(int fanSpeed) {
        this.fanSpeed = fanSpeed;
        if (isOn()) showStatus();
    }
    public void setTemperature(int temperature) {
        this.temperature = temperature;
        if (isOn()) showStatus();
    }
    @Override
    public void showStatus() {
        if (isOn()) {
            System.out.println("AC - Fan Speed: " + fanSpeed +
                    ", Temperature: " + temperature + "°C");
        }
    }
}
