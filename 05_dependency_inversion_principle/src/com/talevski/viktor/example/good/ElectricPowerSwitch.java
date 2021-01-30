package com.talevski.viktor.example.good;

public class ElectricPowerSwitch {
    private ElectricDevice electricDevice;
    private boolean on;

    public ElectricPowerSwitch(ElectricDevice electricDevice) {
        this.electricDevice = electricDevice;
        on = false;
    }

    public boolean isOn() {
        return on;
    }

    public void pressSwitch() {
        if (isOn()) {
            electricDevice.turnOff();
            on = false;
        } else {
            electricDevice.turnOn();
            on = true;
        }
    }
}
