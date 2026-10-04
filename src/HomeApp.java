public class HomeApp {

    public static void main(String[] args) {

        Light light = new Light();
        TV tv = new TV();
        AirConditioning airConditioning = new AirConditioning();
        HomeInterface home = new HomeInterface(light, tv, airConditioning);
        home.turnOnAll();
        System.out.println();
        home.turnOffAll();
    }
}