package com.talevski.viktor;

import com.talevski.viktor.example.bad.Bicycle;
import com.talevski.viktor.example.bad.Car;
import com.talevski.viktor.example.bad.TransportationDevice;
import com.talevski.viktor.example.good.TransportationDeviceWithEngine;
import com.talevski.viktor.example.good.TransportationDeviceWithoutEngine;

/**
 * Reference link for the LSP - Liskov Substitution Principle - 'https://springframework.guru/principles-of-object-oriented-design/liskov-substitution-principle'.
 */
public class LiskovSubstitutionPrincipleApplication {
    public static void main(String[] args) {
        System.out.println("Bad example.");

        TransportationDevice badCar = new Car();
        badCar.setName("car");
        badCar.startEngine();
        TransportationDevice badBicycle = new Bicycle();
        badBicycle.setName("bicycle");
        badBicycle.startEngine();

        System.out.println("------------------------------");

        System.out.println("Good example.");

        TransportationDeviceWithEngine goodCar = new com.talevski.viktor.example.good.Car();
        goodCar.setName("car");
        goodCar.startEngine();
        TransportationDeviceWithoutEngine goodBicycle = new com.talevski.viktor.example.good.Bicycle();
        goodBicycle.setName("bicycle");
        goodBicycle.startMoving();
    }
}
