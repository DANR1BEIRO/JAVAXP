package academy.devdojo.maratonajava.javacore.F_StaticModifier.domain;

public class Car {
    private String name;
    private double maxSpeed;
    public static double speedLimit = 250;

    public Car() {
    }

    public Car(String name, double maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public void print() {
        System.out.println("----------------");
        System.out.println("Name " + this.name);
        System.out.println("Max speed: " + this.maxSpeed);
        System.out.println("Speed limit: " + Car.speedLimit);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getSpeedLimit() {
        return speedLimit;
    }

    public static void setSpeedLimit(double speedLimit) {
        Car.speedLimit = speedLimit;
    }
}
