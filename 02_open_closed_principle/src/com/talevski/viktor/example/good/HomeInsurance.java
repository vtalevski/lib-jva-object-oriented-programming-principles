package com.talevski.viktor.example.good;

public class HomeInsurance implements Insurance {

    @Override
    public boolean processInsurance() {
        System.out.println("Logic for the HomeInsurance class.");
        return true;
    }
}
