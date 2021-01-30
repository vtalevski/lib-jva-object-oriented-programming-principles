package com.talevski.viktor.example.good;

public class HealthInsurance implements Insurance {

    @Override
    public boolean processInsurance() {
        System.out.println("Logic for the HealthInsurance class.");
        return true;
    }
}
