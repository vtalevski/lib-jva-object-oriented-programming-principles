package com.talevski.viktor;

import com.talevski.viktor.example.bad.ElectricPowerSwitch;
import com.talevski.viktor.example.bad.LightBulb;

/**
 * Reference link for the DIP - Dependency Inversion Principle - 'https://springframework.guru/principles-of-object-oriented-design/dependency-inversion-principle'.
 */
public class DependencyInversionPrincipleApplication {
    public static void main(String[] args) {
        System.out.println("Bad example.");

        ElectricPowerSwitch badElectricPowerSwitch = new ElectricPowerSwitch(new LightBulb());
        System.out.println("The light bulb is on - '" + badElectricPowerSwitch.isOn() + "'.");
        badElectricPowerSwitch.pressSwitch();
        System.out.println("The light bulb is on - '" + badElectricPowerSwitch.isOn() + "'.");

        System.out.println("------------------------------");

        System.out.println("Good example.");

        com.talevski.viktor.example.good.ElectricPowerSwitch goodLightBulb = new com.talevski.viktor.example.good.ElectricPowerSwitch(new com.talevski.viktor.example.good.LightBulb());
        System.out.println("The light bulb is on - '" + goodLightBulb.isOn() + "'.");
        goodLightBulb.pressSwitch();
        System.out.println("The light bulb is on - '" + goodLightBulb.isOn() + "'.");

        com.talevski.viktor.example.good.ElectricPowerSwitch goodFan = new com.talevski.viktor.example.good.ElectricPowerSwitch(new com.talevski.viktor.example.good.Fan());
        System.out.println("The light bulb is on - '" + goodFan.isOn() + "'.");
        goodFan.pressSwitch();
        System.out.println("The light bulb is on - '" + goodFan.isOn() + "'.");
    }
}
