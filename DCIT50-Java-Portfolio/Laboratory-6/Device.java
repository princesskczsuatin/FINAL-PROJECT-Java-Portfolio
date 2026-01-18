public abstract class Device {
    private boolean isOn;
    public void turnOn() {
        isOn = true;
        System.out.println(getClass().getSimpleName() + " is now ON.");
        showStatus();
        System.out.print("\n");
    }
    public void turnOff() {
        isOn = false;
        System.out.println(getClass().getSimpleName() + " is now OFF.");
    }
    public boolean isOn() {
        return isOn;
    }
    public abstract void showStatus();
    public static void toggleDevices(Device[] devices, boolean turnOn) {
        for (Device d : devices) {
            if (turnOn) d.turnOn();
            else d.turnOff();
        }
    }
    public static int countPoweredOnDevices(Device[] devices) {
        int count = 0;
        for (Device d : devices) {
            if (d.isOn()) count++;
        }
        return count;
    }
}
