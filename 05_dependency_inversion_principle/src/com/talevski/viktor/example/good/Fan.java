package com.talevski.viktor.example.good;

public class Fan implements ElectricDevice {
    public void turnOn() {
        System.out.println("Turning fan on.");
    }

    public void turnOff() {
        System.out.println("Turning fan off.");
    }
}
