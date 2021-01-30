package com.talevski.viktor.example.good;

public class InsuranceManager {
    public void processInsurance(Insurance insurance) {
        if (insurance.processInsurance()) {
            System.out.println("HealthInsurance is active.");
        } else System.out.println("HealthInsurance is not active.");
    }
}
