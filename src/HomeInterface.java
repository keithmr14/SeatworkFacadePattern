public class HomeInterface {

    private final Light light;
    private final TV tv;
    private final AirConditioning airConditioning;

    public HomeInterface(
            Light light,
            TV tv,
            AirConditioning airConditioning) {

        this.light = light;
        this.tv = tv;
        this.airConditioning = airConditioning;
    }

    public void turnOnAll() {
        System.out.println("Turning on all home services...");

        light.turnOn();
        tv.turnOn();
        airConditioning.turnOn();
    }

    public void turnOffAll() {
        System.out.println("Turning off all home services...");

        light.turnOff();
        tv.turnOff();
        airConditioning.turnOff();
    }
}