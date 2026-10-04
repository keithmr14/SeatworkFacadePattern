public class AirConditioning implements HomeService {

    @Override
    public void turnOn() {
        System.out.println("Air conditioning is turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Air conditioning is turned off.");
    }
}