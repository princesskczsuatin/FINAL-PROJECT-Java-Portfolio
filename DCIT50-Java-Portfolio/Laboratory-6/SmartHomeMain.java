public class SmartHomeMain {
    public static void main(String[] args) {
        AirConditioner ac = new AirConditioner();
        LampShade lamp1 = new LampShade(100, "Yellow");
        LampShade lamp2 = new LampShade(lamp1);
        Television tv = new Television();
        Microwave mw = new Microwave();
        Device[] devices = { ac, lamp1, lamp2, tv, mw };
            System.out.print("===================================");
        System.out.println("\nTURNING ON ALL DEVICES:");
                System.out.print("\n");
        Device.toggleDevices(devices, true);
            System.out.print("===================================");
        System.out.println("\nNumber of powered devices: " +
                Device.countPoweredOnDevices(devices));
           System.out.print("===================================");
        System.out.println("\nAdjusting some device settings:");
        ac.setTemperature(18);
        lamp2.setLightColor("Pink");
        tv.setVolume(27);
        mw.setTimer(56);
            System.out.print("===================================");
        System.out.println("\nTURNING OFF ALL DEVICES:");
        Device.toggleDevices(devices, false);
            System.out.print("===================================");
    }
}
