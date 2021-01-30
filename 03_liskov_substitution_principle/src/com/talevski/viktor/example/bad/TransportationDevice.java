package com.talevski.viktor.example.bad;

public class TransportationDevice {
    private String name;
    private Integer speed;
    private Engine engine;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void startEngine() {
        System.out.println("The engine of the " + name + " has started.");
    }
}
