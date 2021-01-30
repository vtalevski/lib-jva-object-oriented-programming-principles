package com.talevski.viktor.example.bad;

public class ElectricPowerSwitch {
    private LightBulb lightBulb;
    private boolean on;

    public ElectricPowerSwitch(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
        on = false;
    }

    public boolean isOn() {
        return on;
    }

    public void pressSwitch() {
        if (isOn()) {
            lightBulb.turnOff();
            on = false;
        } else {
            lightBulb.turnOn();
            on = true;
        }
    }
}
