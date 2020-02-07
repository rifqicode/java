package Mobil;

public class Car {
    private String name;
    private double engine;
    public Car(String name, double engine) {
        this.name = name;
        this.engine = engine;
    }
    @Override
    public String toString() {
        return "Car " + name + ", engine: " + engine;
    }
}