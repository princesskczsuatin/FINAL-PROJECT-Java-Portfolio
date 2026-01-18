public class LampShade extends Device {
    private int brightness;
    private String lightColor;
    public LampShade(int brightness, String lightColor) {
        this.brightness = brightness;
        this.lightColor = lightColor;
    }
    public LampShade(LampShade copy) {
        this.brightness = copy.brightness;
        this.lightColor = copy.lightColor;
    }
    public void setBrightness(int brightness) {
        this.brightness = brightness;
        if (isOn()) showStatus();
    }
    public void setLightColor(String color) {
        this.lightColor = color;
        if (isOn()) showStatus();
    }
    @Override
    public void showStatus() {
        if (isOn()) {
            System.out.println("Lampshade  - Brightness: " +
                    brightness + "%, Light Color: " + lightColor);
        }
    }
}
