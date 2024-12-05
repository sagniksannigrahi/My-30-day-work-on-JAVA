class Engine {
    void start() {
        System.out.println("Engine is starting.");
    }
}

class Car {
    private Engine engine;

    Car() {
        engine = new Engine();
    }

    void drive() {
        engine.start();
        System.out.println("Car is driving.");
    }
}

public class CompositionDemo {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
    }
}
