abstract class Vehicle {
    abstract void start();
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car is starting.");
    }
}

interface Flyable {
    void fly();
}

class Plane implements Flyable {
    public void fly() {
        System.out.println("Plane is flying.");
    }
}

public class AbstractInterfaceDemo {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();

        Flyable plane = new Plane();
        plane.fly();
    }
}
