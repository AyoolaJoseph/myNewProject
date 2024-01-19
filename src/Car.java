public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.wheels = 4;
        this.cylinders = cylinders;
        this.name = name;
    }

    public String startEngine() {
        return "Car's engine is starting.";
    }

    public String accelerate() {
        return "Car is accelerating.";
    }

    public String brake() {
        return "Car is braking.";
    }

    // Getter methods
    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}
