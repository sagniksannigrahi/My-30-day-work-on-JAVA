public class Car {
    String brand;
    int speed;

    void start() {
        System.out.println(brand + " is starting at " + speed + " km/h.");
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brand = "Tesla";
        car1.speed = 100;
        car1.start();
    }
}
