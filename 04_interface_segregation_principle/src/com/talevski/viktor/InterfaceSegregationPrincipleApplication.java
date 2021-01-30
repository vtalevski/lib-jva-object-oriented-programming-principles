package com.talevski.viktor;

import com.talevski.viktor.example.bad.Toy;
import com.talevski.viktor.example.bad.ToyCar;
import com.talevski.viktor.example.bad.ToyHouse;
import com.talevski.viktor.example.bad.ToyPlane;

/**
 * Reference link for the ISP - Interface Segregation Principle - 'https://springframework.guru/principles-of-object-oriented-design/interface-segregation-principle'.
 */
public class InterfaceSegregationPrincipleApplication {
    public static void main(String[] args) {
        System.out.println("Bad example.");

        Toy badToyHouse = new ToyHouse();
        badToyHouse.setName("house");
        badToyHouse.play();
        badToyHouse.move();
        badToyHouse.fly();
        Toy badCar = new ToyCar();
        badCar.setName("car");
        badCar.move();
        badCar.fly();
        Toy badPlane = new ToyPlane();
        badPlane.setName("plane");
        badPlane.move();
        badPlane.fly();

        System.out.println("------------------------------");

        System.out.println("Good example.");

        com.talevski.viktor.example.good.ToyHouse goodToyHouse = new com.talevski.viktor.example.good.ToyHouse();
        goodToyHouse.setName("house");
        goodToyHouse.play();
        com.talevski.viktor.example.good.ToyCar goodToyCar = new com.talevski.viktor.example.good.ToyCar();
        goodToyCar.setName("car");
        goodToyCar.move();
        com.talevski.viktor.example.good.ToyPlane goodToyPlane = new com.talevski.viktor.example.good.ToyPlane();
        goodToyPlane.setName("plane");
        goodToyPlane.move();
        goodToyPlane.fly();
    }
}
