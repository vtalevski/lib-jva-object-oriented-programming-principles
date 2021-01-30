package com.talevski.viktor.example.good;

public class TransportationDeviceWithEngine extends TransportationDevice {
    private Engine engine;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void startEngine() {
        System.out.println("The engine of the " + super.getName() + " has started.");
    }
}
