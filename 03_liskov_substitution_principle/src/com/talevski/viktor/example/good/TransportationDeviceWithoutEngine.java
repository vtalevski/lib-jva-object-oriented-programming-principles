package com.talevski.viktor.example.good;

public class TransportationDeviceWithoutEngine extends TransportationDevice {
    public void startMoving() {
        System.out.println("The " + super.getName() + " has started moving.");
    }
}
